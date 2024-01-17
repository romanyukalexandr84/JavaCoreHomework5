package org.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] array = {2, 3, 1, 0, 2, 2, 1, 0, 3};
        try (FileOutputStream str = new FileOutputStream("bytefile.txt")) {
            for (int i = 0; i < 3; i++) {
                byte field = 0;
                for (int j = 0; j < 3; j++) {
                    field = (byte) (field + (byte) (array[3 * i + j] << (j * 2)));
                }
                str.write(field);
            }
            str.flush();
        }
    }
}
