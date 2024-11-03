package ua.edu.ucu.apps.lab8_2.model.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with Credit Card");
    }
}
