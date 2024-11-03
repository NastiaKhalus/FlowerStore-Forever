package ua.edu.ucu.apps.lab8_2.model.delivery;
public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(String item) {
        System.out.println("Delivered " + item + " via DHL");
    }
}