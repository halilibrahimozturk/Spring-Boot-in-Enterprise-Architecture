package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
//kodlama.io/api/products

public class ProductsController {

    @Autowired
    public ProductsController(
            ProductService productService) {
        this.productService = productService;
    }

    private ProductService productService;

    @GetMapping("/getAll")
    //kodlama.io/api/products/getall
    public List<Product> getAll(){
        return this.productService.getAll();
    }
}
