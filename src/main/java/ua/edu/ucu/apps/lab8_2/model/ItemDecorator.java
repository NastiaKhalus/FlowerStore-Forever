package ua.edu.ucu.apps.lab8_2.model;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }
    public abstract String getDescription();
}