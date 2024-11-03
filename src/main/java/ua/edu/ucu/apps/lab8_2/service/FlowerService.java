package ua.edu.ucu.apps.lab8_2.service;
import ua.edu.ucu.apps.lab8_2.model.Flower;
import ua.edu.ucu.apps.lab8_2.repository.FlowerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerService {

    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }

    public Flower createFlower(Flower flower){
        return flowerRepository.save(flower);
    }
}