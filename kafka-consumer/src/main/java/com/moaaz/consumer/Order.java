package com.moaaz.consumer;


public class Order {

    private Long id;
    private String username;
    private Long totalPrice;

    public Order() {

    }

    public Order(Long id, String username, Long totalPrice) {
        this.id = id;
        this.username = username;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
