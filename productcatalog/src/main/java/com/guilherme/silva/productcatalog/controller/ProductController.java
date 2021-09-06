package src.main.java.com.guilherme.silva.productcatalog.controller;


@RestController
@RequestMapping("/product")
public class ProductController {

    @AutoWired
    private ProductService productService;

    @PostMapping
    Product create(@RequestBody Product product){
        return productService.create(product);
    }
    
}
