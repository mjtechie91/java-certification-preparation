package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    Long id;
    String name;
    Double price;
    public Product(Long idParam, String nameParam, Double priceParam){
        id = idParam;
        name = nameParam;
        price = priceParam;
    }

    public int add(int a, int b){
        return a+b;
    }
    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public void setName(String newName){
         name = newName;
    }

    public void setPrice(Double newPrice){
         price = newPrice;
    }
    public void setId(Long newId){
        id = newId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


class ResourceNotFoundException extends Exception{
    public ResourceNotFoundException(String msg){
        super(msg);
    }
}

 class ProductService{

    List<Product> product = new ArrayList<>();
    Long counter = 1L;

    public Product getById(Long id) throws ResourceNotFoundException {
        return product.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Product with ID: "+ id + " not exist"));
    }

    public List<Product> findAll(){
        return product;
    }

    public void saveProduct(Product newProduct){
        newProduct.setId(counter++);
        product.add(newProduct);
    }

     public Product updateProduct(Product updateProduct) throws ResourceNotFoundException {
        Product existingProduct = getById(updateProduct.getId());
         existingProduct.setName(updateProduct.getName());
         existingProduct.setPrice(updateProduct.getPrice());
        return existingProduct;
     }

     public void deleteProduct(Long id){
        product = product.stream().filter(item -> !item.getId().equals(id)).collect(Collectors.toList());
     }
}



