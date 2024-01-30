
package com.mycompany.project1.tuan5;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        final int PORT = 12345;
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server dang cho ket noi tu client....");
            while (true) {                
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client da ket noi" + clientSocket);
                
                Thread thread = new Thread(new ClientHandle(clientSocket));
                thread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
    class ClientHandle implements Runnable{
        private Socket clientSocket;
        public ClientHandle(Socket clientSocket){
            this.clientSocket = clientSocket;
        }
        @Override
        public void run(){
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                String clientMessage;
                while ((clientMessage = in.readLine()) != null) {                    
                    System.out.println("Client gui: " + clientMessage);
                    out.println("Server nhan duoc: " + clientMessage);
                }
            } catch (Exception e) {
            }
        }
    }























