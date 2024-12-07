package com.LabExam.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private RestTemplate restTemplate;

    private final String FAKE_STORE_API_URL = "https://fakestoreapi.com/products";

    public List<ProductDetails> getAllProducts() {
        ProductDetails[] products = restTemplate.getForObject(FAKE_STORE_API_URL, ProductDetails[].class);
        return Arrays.asList(products);
    }
}
