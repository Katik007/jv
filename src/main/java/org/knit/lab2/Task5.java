package org.knit.lab2;
import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent {
    String getName();
    long getSize();
    void add(FileSystemComponent component);
    void remove(FileSystemComponent component);
    void display(String indent);
}

class File implements FileSystemComponent {
    private String name;
    private long size;
    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public long getSize() {
        return size;
    }
    @Override
    public void add(FileSystemComponent component) {
        // Не поддерживается для файлов
    }
    @Override
    public void remove(FileSystemComponent component) {
        // Не поддерживается для файлов
    }
    @Override
    public void display(String indent) {
        System.out.println(indent + name + " (" + size + " bytes)");
    }
}

class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }
    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }
    @Override
    public void display(String indent) {
        System.out.println(indent + name);
        String newIndent = indent + "  ";
        for (FileSystemComponent component : components) {
            component.display(newIndent);
        }
    }
}

public class Task5 {
    public static void main(String[] args) {
        // Создаем файлы
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);
        FileSystemComponent file3 = new File("file3.txt", 300);
        // Создаем папки
        FileSystemComponent folder1 = new Folder("Folder1");
        FileSystemComponent folder2 = new Folder("Folder2");
        // Добавляем файлы в папки
        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        folder2.add(folder1); // Вложенная папка
        // Выводим структуру файловой системы
        folder2.display("");
        // Выводим общий размер папки 2
        System.out.println("Итоговый размер Folder2: " + folder2.getSize() + " bytes");
    }
}
