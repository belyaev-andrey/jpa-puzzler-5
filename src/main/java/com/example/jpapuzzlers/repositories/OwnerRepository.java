package com.example.jpapuzzlers.repositories;

import com.example.jpapuzzlers.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}