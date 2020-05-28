package com.paro.Behaviorial_Patterns.ChainOfResponsibilty.Type2;


public interface Handler {
    public void setHandler(Handler handler);
    public void process(File file);
    public String getHandlerName();
}
