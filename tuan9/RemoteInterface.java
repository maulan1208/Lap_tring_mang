package com.mycompany.project1.tuan9;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote{
    String sayHello() throws RemoteException;
}
