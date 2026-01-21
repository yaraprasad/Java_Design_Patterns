package com.java.basic.design;

public class PaymentMethodTest {

    public static void main(String[] args) {

        PaymentProcessor upiPay= PaymentFactory.getPaymentMethod("UPI");
        upiPay.pay(1000);

        PaymentProcessor cardPay= PaymentFactory.getPaymentMethod("CARD");
        cardPay.pay(2000);

        PaymentProcessor netBankingPay= PaymentFactory.getPaymentMethod("NETBANKING");
        netBankingPay.pay(3000);

        PaymentProcessor cashPay= PaymentFactory.getPaymentMethod("CASH");
        cashPay.pay(4000);
    }
}

interface PaymentProcessor{
    void pay(double amount);
}

class UPIFPayment implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount+" using UPI");
    }
}

class CashFPayment implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount+" using Cash");
    }
}

class CardFPayment implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount+" using Card");
    }
}

class NetBankingPayment implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount+" using NetBanking");

    }
}

class PaymentFactory{

    public static PaymentProcessor getPaymentMethod(String type){
        return switch (type.toUpperCase()){
            case "CARD" -> new CardFPayment();
            case "CASH" -> new CashFPayment();
            case "UPI" -> new UPIFPayment();
            case "NETBANKING" -> new NetBankingPayment();
            default -> throw new IllegalArgumentException("Invalid Payment method");
        };
    }
}
