package com.sonena;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Math.addExact;

class FileRead {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("C:\\test\\a.txt");

            BufferedReader fileInput = new BufferedReader(file);

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Integer i = null;
        Integer j = 15;
        int a = addExact(i, j);
        System.out.println(" result " + a);
    }
}

