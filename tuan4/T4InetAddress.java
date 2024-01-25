/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1.tuan4;


import java.net.InetAddress;


public class T4InetAddress {
    public static void main(String[] args) {
        try {
            InetAddress addByName = InetAddress.getByName("www.google.com");
            
            InetAddress addById = InetAddress.getByName("192.168.0.124");
            System.out.println("Add by name: " + addByName);            
            System.out.println("Add by id: " + addById);
        
            InetAddress addByName1 = InetAddress.getByName("www.vnexpress.net");
            String hostName = addByName1.getHostName();
            System.out.println("Host name: " + hostName);
            
            String ip = addByName1.getHostAddress();
            System.out.println("Dia chi IP: " + ip);
            
            InetAddress addByName2 = InetAddress.getByName("www.vnexpress.net");
            //Kiem tra Ip4 IP6
            boolean isIP4 = addByName2 instanceof java.net.Inet4Address;
            System.out.println("Co phai IP4 khong? " + isIP4);
            
            boolean isIP6 = addByName2 instanceof java.net.Inet6Address;
            System.out.println("Co phai IP6 khong? " + isIP6);

        } catch (Exception e) {
        }
    }
}
