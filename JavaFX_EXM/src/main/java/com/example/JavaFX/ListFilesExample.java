package com.example.JavaFX;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListFilesExample {
    public static String[] listFiles(String path) {
        File directory = new File(path);
        File[] files = directory.listFiles();
        List<String> fileNameList = new ArrayList<String>();
        for (File file : files) {
            if (file.isFile()) {
                fileNameList.add(file.getName());
            }
        }
        return fileNameList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] fileNames = listFiles("/home/user/Documents");
        System.out.println("Files in directory:");
        Arrays.stream(fileNames).forEach(System.out::println);
    }
}