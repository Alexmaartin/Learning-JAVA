package com.campusdual.iofiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFails {
    public static void main(String[] args) {
        Path filePath = Paths.get(Route.PATH_NAME);
        System.out.println("File delete.");
        try {
            Files.deleteIfExists(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
