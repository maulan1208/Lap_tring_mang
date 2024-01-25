/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1.tuan4;

import java.net.URL;


public class PhanTichURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://github.com/login?client_id=8156498a04d1669d6faf&return_to=%2Flogin%2Foauth%2Fauthorize%3Fclient_id%3D8156498a04d1669d6faf%26redirect_uri%3Dhttps%253A%252F%252Fuiverse.io%252Fauth%252Fgithub%252Fcallback%26response_type%3Dcode%26scope%3Duser%253Aemail%26state%3Dc83a3fe3-94df-4243-9afd-015a01eaf0b7");
            System.out.println("Protocol: " + url.getProtocol());            
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Truy van: " + url.getQuery());
            System.out.println("Tham chieu: " + url.getRef());
        } catch (Exception e) {
        }
    }
}
