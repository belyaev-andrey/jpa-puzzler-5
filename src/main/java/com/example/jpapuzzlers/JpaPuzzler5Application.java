package com.example.jpapuzzlers;

import com.example.jpapuzzlers.entities.Owner;
import com.example.jpapuzzlers.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPuzzler5Application implements CommandLineRunner {

    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaPuzzler5Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = ownerRepository.findById(1L).orElseThrow();
        owner.setName("Johnny Doe "+System.nanoTime());
        ownerRepository.save(owner);
    }
}