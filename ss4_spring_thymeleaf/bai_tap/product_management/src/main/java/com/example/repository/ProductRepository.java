package com.example.repository;

import com.example.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepository implements IProductRepository {
    static private Map<Integer, Product> map;

    static {
        map = new HashMap<>();
        map.put(1, new Product(1, "Iphone 6", 6000, 60, "USA"));
        map.put(2, new Product(2, "Iphone 7", 7000, 70, "USA"));
        map.put(3, new Product(3, "Iphone 8", 8000, 80, "USA"));
        map.put(4, new Product(4, "Iphone X", 10000, 90, "USA"));
        map.put(5, new Product(5, "Iphone 11", 11000, 100, "USA"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Product findById(int id) {
        return map.get(id);
    }

    @Override
    public void save(Product product) {
        map.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        map.put(id, product);
    }

    @Override
    public void remove(int id) {
        map.remove(id);
    }

    @Override
    public List<Product> search(String nameSearch) {
        List<Product> products = new ArrayList<>();
        for (Product product : map.values()) {
            if (product.getName().equals(nameSearch)) {
                products.add(product);
            }
        }
        return products;
    }
}
