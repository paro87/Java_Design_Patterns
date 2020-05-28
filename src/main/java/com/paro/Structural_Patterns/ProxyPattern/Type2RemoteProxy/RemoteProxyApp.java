package com.paro.Structural_Patterns.ProxyPattern.Type2RemoteProxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RemoteProxyApp {
    public static void main(String[] args) {
        new RemoteProxyApp().generateReport();
    }

    public void generateReport() {
        try{
            ReportGenerator reportGenerator=(ReportGenerator)Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
            System.out.println(reportGenerator.generateDailyReport());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
