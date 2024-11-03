package ua.edu.ucu.apps.lab8_2.model;

public abstract class Item {
    public String description;
    public abstract double price();

    public String getDescription() {
        return description;
    }
}