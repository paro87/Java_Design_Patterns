package com.paro.Creational_Patterns.Prototype.Type1;

public interface Prototype extends Cloneable{
    public AccessControl clone() throws CloneNotSupportedException;

}
