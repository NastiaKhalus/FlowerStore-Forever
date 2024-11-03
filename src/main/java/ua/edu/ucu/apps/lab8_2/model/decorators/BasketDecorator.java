package ua.edu.ucu.apps.lab8_2.model.decorators;

import ua.edu.ucu.apps.lab8_2.model.ItemDecorator;
import ua.edu.ucu.apps.lab8_2.model.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return item.price() + 4;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", in a basket";
    }
}