import br.com.alura.practiceoopjava.models.PerishableProduct;
import br.com.alura.practiceoopjava.models.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var productsArray = new ArrayList<Product>();
        var product1 = new Product("Mouse");
        product1.setPrice(149.99);
        product1.setStock(25);
        var product2 = new Product("Keyboard");
        product2.setPrice(239.99);
        product2.setStock(34);
        var product3 = new Product("Headset");
        product3.setPrice(129.99);
        product3.setStock(19);

        productsArray.add(product1);
        productsArray.add(product2);
        productsArray.add(product3);

        System.out.println(productsArray.size());
        System.out.println(productsArray.get(1).getName());
        System.out.println(productsArray.toString());

        var perishableProduct = new PerishableProduct("Fish");
        perishableProduct.setPrice(44.90);
        perishableProduct.setStock(56);
        perishableProduct.setExpirationDate("10/08/2025");
        System.out.println(perishableProduct);
    }
}