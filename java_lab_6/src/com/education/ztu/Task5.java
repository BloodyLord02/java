package com.education.ztu;

import java.io.*;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("directory_for_files/task5.txt");
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            System.out.println("Початковий вміст файлу:");
            printFileContent(file);
            raf.seek(5);
            raf.writeBytes("\ndfhahdfhadhfahdfhadgdfgafdhafh");
            raf.seek(raf.length());
            raf.writeBytes("\nagjdjatgahnjhatjnatgjhna");
            raf.close();
            System.out.println("\nОновлений вміст файлу:");
            printFileContent(file);

        } catch (IOException e) {
            System.err.println("Помилка при роботі з RandomAccessFile: " + e.getMessage());
        }
    }
    public static void printFileContent(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Помилка при читанні файлу: " + e.getMessage());
        }
    }
}
