package queueAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FileCopy {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FileCopy fileTransfer = new FileCopy();
        fileTransfer.init();
    }

    private void init() {
        System.out.print("ENTER SOURCE DIRECTORY : ");
        String source = scanner.next();
        System.out.print("ENTER TARGET DIRECTORY : ");
        String target = scanner.next();
        long time = System.currentTimeMillis();
        File sourceDir = new File(source);
        File targetDir = new File(target);
        if (sourceDir.isDirectory() && targetDir.isDirectory()) copyFiles(sourceDir, targetDir);
        else System.out.println("PLEASE PROVIDE DIRECTORY INSTEAD FILE");
    }

    private void copyFiles(File sourceDir, File targetDir) {
        File[] files = sourceDir.listFiles();
        if (files != null) {
            ArrayList<File> sourceFiles = new ArrayList<>(List.of(files));
            PriorityQueue<Long> sizesOfFiles = new PriorityQueue<>();
            for (File eachFile : sourceFiles) sizesOfFiles.add(eachFile.length());
            startCopy(sizesOfFiles, sourceFiles, targetDir);
        } else System.out.println("EMPTY FOLDER FOUND");
    }

    private void startCopy(PriorityQueue<Long> sizes, ArrayList<File> files, File targetDir) {
        if (sizes.isEmpty()) {
            System.out.println("FILES TRANSFER SUCCESSFULLY");
            return;
        }
        Long fileSize = sizes.poll();
        for (File eachFile : files) {
            if (eachFile.length() == fileSize) {
                File out = new File(targetDir.getPath() + "\\" + eachFile.getName());
                try {
                    if (out.createNewFile()) {
                        System.out.println(eachFile.getName() + " - TRANSFERRING...");
                        transfer(eachFile, out);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                files.remove(eachFile);
                break;
            }
        }
        startCopy(sizes, files, targetDir);
    }
    private static void transfer(File source, File dest) {
        try (InputStream is = new FileInputStream(source); OutputStream target = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024 * 4];
            while ((is.read(buffer)) > 0) {
                target.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}