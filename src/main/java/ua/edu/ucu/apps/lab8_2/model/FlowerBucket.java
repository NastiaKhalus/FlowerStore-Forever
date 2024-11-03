package ua.edu.ucu.apps.lab8_2.model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class FlowerBucket extends Item {
    private List<Flower> flowers;

    public FlowerBucket() {
        this.flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public double price() {
        return flowers.stream()
                      .mapToDouble(Flower::getPrice)
                      .sum();
    }

    public List<Flower> searchFlowers(String name) {
        return flowers.stream()
.filter(flower -> flower.getName().equalsIgnoreCase(name))
                      .collect(Collectors.toList());
    }
}
