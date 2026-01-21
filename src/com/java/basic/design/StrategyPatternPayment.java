package com.java.basic.design;

public class StrategyPatternPayment {

    private PaymentStrategy strategy;

    public  StrategyPatternPayment(PaymentStrategy strategy){
        this.strategy=strategy;
    }

    public void setStrategy(PaymentStrategy strategy){
        this.strategy=strategy;
    }
    public void pay(double amount) {
        strategy.pay(amount);
    }

    public static void main(String[] args) {
        StrategyPatternPayment spp = new StrategyPatternPayment(new UPIPayment());
        spp.pay(1000);
        spp.setStrategy(new CardPayment());
        spp.pay(2000);
    }

}

interface  PaymentStrategy{
    void pay(double amount);
}

class UPIPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Pay using UPI");
    }
}

class CashPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Pay using Cash");
    }
}

class CardPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Pay using Card");
    }
}