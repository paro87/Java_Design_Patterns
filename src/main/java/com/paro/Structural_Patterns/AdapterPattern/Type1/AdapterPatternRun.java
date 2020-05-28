package com.paro.Structural_Patterns.AdapterPattern.Type1;

public class AdapterPatternRun {
    public static void main(String[] args) {
        Xpay xpay=new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);

        PayD payD=new XpayToPayDAdapter(xpay);
        
    }
}
