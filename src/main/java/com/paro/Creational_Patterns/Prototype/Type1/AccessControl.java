package com.paro.Creational_Patterns.Prototype.Type1;

import lombok.Getter;

@Getter
public class AccessControl implements Prototype{
    private final String controlLevel;
    private String access;

    public AccessControl(String controlLevel, String access){
        this.controlLevel=controlLevel;
        this.access=access;
    }

    @Override
    public AccessControl clone() throws CloneNotSupportedException {
        try{
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
