package br.com.alura.practiceoopjava.models;

public class PerishableProduct extends Product {
    private String expirationDate;

    public PerishableProduct(String name) {
        super(name);
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        return "Product: " + this.getName() + ", price: " +
                this.getPrice() + ", stock: " + this.getStock() + ", expiration date: " + this.getExpirationDate();
    }
}
