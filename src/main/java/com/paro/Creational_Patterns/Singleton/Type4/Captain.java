package com.paro.Creational_Patterns.Singleton.Type4;

final class Captain {
    private static Captain captain;
    private Captain() {}

    public static synchronized Captain getCaptain() {
        if (captain==null){
            captain=new Captain();
        }
        return captain;
    }
}
