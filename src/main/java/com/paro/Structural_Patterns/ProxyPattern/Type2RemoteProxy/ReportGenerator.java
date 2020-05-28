package com.paro.Structural_Patterns.ProxyPattern.Type2RemoteProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReportGenerator extends Remote {
    public String generateDailyReport() throws RemoteException;
}
