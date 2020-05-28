package com.paro.Creational_Patterns.Singleton.Type5;

final class Captain {
    private static Captain captain;
    private Captain() {
    }

    public static Captain getCaptain() {
        if(captain==null){
            synchronized (Captain.class) {
                if (captain==null){
                    captain=new Captain();
                }
            }
        }
        return captain;
    }
}
