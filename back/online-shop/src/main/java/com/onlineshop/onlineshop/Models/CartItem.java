package com.onlineshop.onlineshop.Models;

import com.onlineshop.onlineshop.Models.DTO.ShopCart.CartItemDetailDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cartItems")
public class CartItem {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quantity")
    @NotNull
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public CartItem(){
    }

    public CartItem(CartItemDetailDTO cartItemDetailDTO){
        this.id = cartItemDetailDTO.getId();
        //this.product = new Product(cartItemDTO.getProduct());
        //this.shoppingCart = new ShoppingCart(cartItemDTO.getShoppingCart());
        this.quantity = cartItemDetailDTO.getQuantity();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
