package service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {

    public static void createFile(String url, String text) throws Exception {
        Files.write(Paths.get(url), text.getBytes(), StandardOpenOption.CREATE);
    }

    public static String[] readFile(String url) throws Exception {
        return Files.readAllLines(Paths.get(url)).toArray(new String[0]);
    }

    public static void writeFile(String url, String ss) throws Exception {
        Files.write(Paths.get(url), "\n".concat(ss).getBytes(), StandardOpenOption.APPEND);
    }

}
