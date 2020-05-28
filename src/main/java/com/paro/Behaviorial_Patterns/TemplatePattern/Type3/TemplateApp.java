package com.paro.Behaviorial_Patterns.TemplatePattern.Type3;

public class TemplateApp {
    public static void main(String[] args) {
        System.out.println("For MYSQL....");
        ConnectionTemplate template = new MySqlCSVCon();
        template.run();
        System.out.println("For Oracle...");
        template = new OracleTxtCon();
        template.run();
    }
}
