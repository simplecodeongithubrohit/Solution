package com.example.Nimap.Solution.repository;


import com.example.Nimap.Solution.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
