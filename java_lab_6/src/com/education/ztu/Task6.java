package com.education.ztu;

import java.io.File;

public class Task6 {
    public static void main(String[] args) {
        File directory = new File("inner_directory");
        if (!directory.exists()) {
            directory.mkdir();
        }
        System.out.println("Абсолютний шлях до папки: " + directory.getAbsolutePath());
        System.out.println("Батьківська директорія: " + directory.getParent());
        try {
            File file1 = new File(directory, "file1.txt");
            File file2 = new File(directory, "file2.txt");
            if (!file1.exists()) {
                file1.createNewFile();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            System.out.println("Файли створені: 'file1.txt' та 'file2.txt'");
            if (file1.delete()) {
                System.out.println("Файл 'file1.txt' видалено.");
            } else {
                System.out.println("Не вдалося видалити файл 'file1.txt'.");
            }
            File renamedDirectory = new File("renamed_inner_directory");
            if (directory.renameTo(renamedDirectory)) {
                System.out.println("Папку переіменовано на 'renamed_inner_directory'.");
            } else {
                System.out.println("Не вдалося переіменувати папку.");
            }
            File parentDirectory = new File("directory_for_files");
            if (parentDirectory.exists() && parentDirectory.isDirectory()) {
                File[] files = parentDirectory.listFiles();
                if (files != null) {
                    System.out.println("\nСписок файлів та папок у 'directory_for_files':");
                    for (File file : files) {
                        String type = file.isDirectory() ? "Папка" : "Файл";
                        System.out.println(file.getName() + " - " + type + " - Розмір: " + file.length() + " байт");
                    }
                }
            } else {
                System.out.println("Папка 'directory_for_files' не існує.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

