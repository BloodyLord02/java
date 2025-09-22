package com.education.ztu;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        File sourceTextFile = new File("directory_for_files/text.txt");
        File targetTextFile = new File("directory_for_files/text_copy.txt");
        File sourceImage = new File("directory_for_files/cat.jpg");
        File targetImage = new File("directory_for_files/cat_copy.jpg");
        copyTextFile(sourceTextFile, targetTextFile);
        copyBinaryFile(sourceImage, targetImage);
    }
    public static void copyTextFile(File source, File target) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(source));
                BufferedWriter writer = new BufferedWriter(new FileWriter(target))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Текстовий файл скопійовано: " + target.getPath());
        } catch (IOException e) {
            System.err.println("Помилка при копіюванні текстового файлу: " + e.getMessage());
        }
    }
    public static void copyBinaryFile(File source, File target) {
        try (
                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(target)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Зображення скопійовано: " + target.getPath());
        } catch (IOException e) {
            System.err.println("Помилка при копіюванні зображення: " + e.getMessage());
        }
    }
}

