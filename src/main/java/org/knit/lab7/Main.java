package org.knit.lab7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String directoryPath = "C:\\Users\\User\\GitHub\\jv\\src\\main\\java\\org\\knit";
        FileTreeWalker fileTreeWalker = new FileTreeWalker(directoryPath);
        fileTreeWalker.walkFileTreeAndCountWords();
    }
}
