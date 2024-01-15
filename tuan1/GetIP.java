/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1.tuan1;

import java.net.InetAddress;

/**
 *
 * @author lenovo
 */
public class GetIP {
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("www.google.com");
            System.out.println("Dia chi ip google.com: " + inet.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
