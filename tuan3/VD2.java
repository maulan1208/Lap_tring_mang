
package com.mycompany.project1.tuan3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VD2 {
    private int count = 0;
    private final Lock lc = new ReentrantLock();
    public void demTang(){
        lc.lock();
        try {
            count++;
        } catch (Exception e) {
        }
        finally{
            lc.unlock();
        }
    }
}
