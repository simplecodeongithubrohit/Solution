package com.example.Nimap.Solution.repository;

import com.example.Nimap.Solution.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
