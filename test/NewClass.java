package com.mycompany.examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алексей
 */
public class NewClass {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        try {
            File file = new File("Мой файл.txt");
            
            if(!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("Прюуэт чиловеке!");
            pw.close();
            
            br = new BufferedReader(new FileReader("Мой файл.txt"));
                    String line;
                    while((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
        } catch(IOException e) {
            System.out.println("Ошибка: " + e);
        } finally {
            br.close();
        }
    }
}
