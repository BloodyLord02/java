package com.education.ztu;

import java.io.*;
import java.util.zip.*;

public class Task7 {
    public static void main(String[] args) {
        File directory = new File("directory_for_files");
        String zipFilePath = "archive.zip";
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFilePath))) {
            File[] files = directory.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    if (file.isFile()) {
                        try (FileInputStream fis = new FileInputStream(file)) {
                            ZipEntry zipEntry = new ZipEntry(file.getName());
                            zipOut.putNextEntry(zipEntry);
                            byte[] buffer = new byte[1024];
                            int length;
                            while ((length = fis.read(buffer)) >= 0) {
                                zipOut.write(buffer, 0, length);
                            }
                            zipOut.closeEntry();
                            System.out.println("Файл додано до архіву: " + file.getName());
                        }
                    }
                }
            }
            System.out.println("Архів створено: " + zipFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry zipEntry;
            System.out.println("\nСписок файлів в архіві:");
            while ((zipEntry = zipIn.getNextEntry()) != null) {
                System.out.println("Файл в архіві: " + zipEntry.getName());
                zipIn.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
