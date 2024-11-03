package ua.edu.ucu.apps.lab8_2.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Data
@Entity
@Table(name ="flowers")

public class Flower extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    private String color;
    private double price;
    private boolean available;
    @Override
    public double price() {
        return this.price;
    }
}