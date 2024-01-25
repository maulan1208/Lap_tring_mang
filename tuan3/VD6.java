
package com.mycompany.project1.tuan3;


public class VD6 {
    private final Object monitor = new Object();
    private boolean isDataReady = false;
    public void producData() throws InterruptedException{
        synchronized (monitor) {
            while(isDataReady){
                monitor.wait();
            }
        
        System.out.println("San xuat du lieu");
        Thread.sleep(2000);
        isDataReady = true;
        
        monitor.notify();
        }
    }
    public void useData() throws InterruptedException {
        synchronized (monitor) {
            while (!isDataReady) {
                monitor.wait();
            }
        
        System.err.println("Su dung du lieu ...");
        Thread.sleep(3000);
        isDataReady = false;
        monitor.notify();
        }
    }
    public static void main(String[] args) {
        VD6 ex = new VD6();
        Thread thSanXuat = new Thread(()->{
            try {
                while (true) {                    
                    ex.producData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        
        Thread thSuDung = new Thread(()->{
            try {
                while (true) {                    
                    ex.useData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thSanXuat.start();
        thSuDung.start();
        
    }
    
}
