package com.onlineshop.onlineshop.Repositories;

import com.onlineshop.onlineshop.Models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
}
