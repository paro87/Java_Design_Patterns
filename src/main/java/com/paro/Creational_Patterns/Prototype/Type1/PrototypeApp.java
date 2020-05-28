package com.paro.Creational_Patterns.Prototype.Type1;

public class PrototypeApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        AccessControl userAccessControl=AccessControlProvider.getAccessControlObject("USER");
        User user=new User("User A", "USER_Level", userAccessControl);
        System.out.println("************************************");
        System.out.println(user);

        userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        user = new User("User B", "USER Level", userAccessControl);
        System.out.println("Changing access control of: "+user.getUsername());
        user.getAccessControl().setAccess("READ REPORTS");
        System.out.println(user);
        System.out.println("************************************");

        AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        user = new User("User C", "MANAGER Level", managerAccessControl);
        System.out.println(user);
    }
}
