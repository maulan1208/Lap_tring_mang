/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1.tuan4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author lenovo
 */
public class ReadData2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection uRLConnection = url.openConnection();
            BufferedReader reader = new BufferedReader(
            new InputStreamReader (uRLConnection.getInputStream()));
            
            FileWriter fileWriter = new FileWriter("Output.html");
            String line="";
            while((line = reader.readLine())!=null){
                fileWriter.write(line + "\n");
            }
            reader.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
