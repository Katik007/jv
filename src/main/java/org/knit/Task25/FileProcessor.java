package org.knit.Task25;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class FileProcessor {

    private static final long MAX_FILE_SIZE = 10 * 1024 * 1024; // 10 MB

    private final FileDAO fileDAO = new FileDAO();

    public void processFiles(String path) {
        File fileOrDirectory = new File(path);

        if (!fileOrDirectory.exists()) {
            System.out.println("Указанный путь не существует.");
            return;
        }

        if (fileOrDirectory.isFile()) {
            processFile(fileOrDirectory);
        } else if (fileOrDirectory.isDirectory()) {
            File[] files = fileOrDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        processFile(file);
                    }
                }
            }
        }
    }

    private void processFile(File file) {
        if (file.length() < MAX_FILE_SIZE) {
            try {
                fileDAO.saveFile(file);
                System.out.println("Файл сохранён: " + file.getName());
            } catch (SQLException | IOException e) {
                System.err.println("Ошибка при сохранении файла " + file.getName() + ": " + e.getMessage());
            }
        } else {
            System.out.println("Файл пропущен (слишком большой): " + file.getName());
        }
    }
}
