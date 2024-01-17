package org.example;

import java.io.IOException;
import java.nio.file.*;;

public class Task1 {
    public static void main(String[] args) throws IOException {
        try (DirectoryStream<Path> folder = Files.newDirectoryStream(Path.of("."))) {
            Files.createDirectory(Path.of("./backup"));
            for (Path path : folder) {
                if (!(Files.isDirectory(path))) {
                    Files.copy(path, Path.of("./backup/" + path.toString()));
                }
            }
        } catch (FileAlreadyExistsException e) {
            System.out.println("Бэкап уже сделан");
        }
    }
}