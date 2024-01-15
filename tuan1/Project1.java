/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1.tuan1;

import java.net.InetAddress;

/**
 *
 * @author lenovo
 */
public class Project1 {

    public static void main(String[] args) {
       try{
           InetAddress inet=InetAddress.getByName("www.google.com");
           boolean isKN = inet.isReachable(5000);
           if(isKN){
               System.out.println("co internet");
           } else {
               System.out.println("ko co internet");
           }
       } catch (Exception e){
           e.printStackTrace();
       }
    }
}
