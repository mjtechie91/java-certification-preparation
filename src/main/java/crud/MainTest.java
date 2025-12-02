package crud;

import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        System.out.println("Simple Crud with In memory");

        ProductService productService = new ProductService();
        productService.saveProduct(new Product(10L, "BB", 100.00));

        productService.saveProduct(new Product(123L, "ABC", 120.00));
        List<Product> list = productService.findAll();

        list.forEach(System.out::println);
    }
}
