/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1.tuan1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *
 * @author lenovo
 */
public class AllIP {
    public static void main(String[] args) {
         try {
            Enumeration<NetworkInterface> netInterface = NetworkInterface.getNetworkInterfaces();
            while (netInterface.hasMoreElements()) {
                NetworkInterface networkInterface = netInterface.nextElement();
                Enumeration<InetAddress> inetAddress = networkInterface.getInetAddresses();
                while (inetAddress.hasMoreElements()) {
                    InetAddress address = inetAddress.nextElement();
                    System.out.println("Interface: "+ networkInterface.getName());
                    System.out.println("Address: " + address.getHostName());
                }
            }
        } catch (Exception e) {
        }
    }
    
}
