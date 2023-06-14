package com.wrtecnologia.cardapio.repository;

import com.wrtecnologia.cardapio.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
