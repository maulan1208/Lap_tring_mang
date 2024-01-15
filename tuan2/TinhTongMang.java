
package com.mycompany.project1.tuan2;

public class TinhTongMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 2;
        Thread[] ths = new Thread[numThreads];
        
        SumCalculator[] cals = new SumCalculator[numThreads];
        
        for (int i = 0; i<numThreads; i++){
            cals[i] = new SumCalculator(array, i, numThreads);
            ths[i] = new Thread(cals[i]);
            ths[i].start();
        }
        for(int i = 0; i < numThreads; i++){
            try {
                ths[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int total = 0;
        for (SumCalculator c: cals){
            total += c.getTongMotPhan();
        }
        System.out.println("Tong la: " + total);
    }
}

class SumCalculator implements Runnable{
    private int[] array;
    private int startIndex;
    private int chia;
    private int tongMotPhan;

    public SumCalculator(int[] array, int startIndex, int chia) {
        this.array = array;
        this.startIndex = startIndex;
        this.chia = chia;
        this.tongMotPhan = 0;
    }
    
    @Override
    public void run() {
        for(int i= startIndex; i < array.length; i++){
            tongMotPhan += array[i];
            
        }
    }
    public  int getTongMotPhan(){
        return tongMotPhan;
    }
}

