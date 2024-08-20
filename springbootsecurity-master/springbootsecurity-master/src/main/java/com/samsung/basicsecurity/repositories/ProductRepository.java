package com.samsung.basicsecurity.repositories;

import com.samsung.basicsecurity.repositories.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    public List<Product> getDummyProducts() {
        List<Product> lstProduct = new ArrayList<>();

        lstProduct.add(
                Product.builder()
                        .id(1l)
                        .name("Men's Goldman")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/71WnQIxzQ8L._SR200,200_.jpg")  // URL hình ảnh thực tế
                        .price(1652990).build());

        lstProduct.add(
                Product.builder()
                        .id(2l)
                        .name("Mens Tilden Walk")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/813UuOjWfZL.jpg")  // URL hình ảnh thực tế
                        .price(2171000).build());

        lstProduct.add(
                Product.builder()
                        .id(3l)
                        .name("Men's Fenta")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/61NzMwcRD6L.jpg")  // URL hình ảnh thực tế
                        .price(1625866).build());

        lstProduct.add(
                Product.builder()
                        .id(4l)
                        .name("Men's Delson")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/71y-7jzv9RL.jpg")  // URL hình ảnh thực tế
                        .price(2171000).build());

        lstProduct.add(
                Product.builder()
                        .id(5l)
                        .name("Men's Casual")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/81KAlkw1jiL.jpg")  // URL hình ảnh thực tế
                        .price(2171000).build());

        lstProduct.add(
                Product.builder()
                        .id(6l)
                        .name("Men's Delson")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/71y-7jzv9RL.jpg")  // URL hình ảnh thực tế
                        .price(2171000).build());


        return lstProduct;
    }



    public Product getProductById(Long id)
    {
        List<Product> lstProducts = this.getDummyProducts();
        return lstProducts.stream().filter(p->p.getId() == id).findFirst().get();
    }
}
