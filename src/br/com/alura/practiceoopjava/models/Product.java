package br.com.alura.practiceoopjava.models;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product: " + this.getName() + ", price: " +
                this.getPrice() + ", stock: " + this.getStock();
    }
}
