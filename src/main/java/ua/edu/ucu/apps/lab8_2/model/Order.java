package ua.edu.ucu.apps.lab8_2.model;

import ua.edu.ucu.apps.lab8_2.model.delivery.Delivery;
import ua.edu.ucu.apps.lab8_2.model.payment.Payment;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private List<FlowerBucket> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        this.items = new LinkedList<>();
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void addItem(FlowerBucket item) {
        items.add(item);
    }

    public void removeItem(FlowerBucket item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        return items.stream()
                    .mapToDouble(FlowerBucket::price)
                    .sum();
    }

    public void processOrder() {
        double totalPrice = calculateTotalPrice();
        if (payment != null) {
            payment.pay(totalPrice);
        }
        if (delivery != null) {
            items.forEach(item -> delivery.deliver(item.toString()));
        }
    }
}
