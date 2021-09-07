package src.main.java.com.guilherme.silva.productcatalog.controller;


@RestController
@RequestMapping("/product")
public class ProductController {

    @AutoWired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    
    @GetMapping{"/{id}"}
    @ResponseStatus(HttpStatus.OK)
    Product getProdcutById(@PathVariable Long id){
        return productService.getProdcutById(id);
    }

    @PutMapping{"/{id}"}
    @ResponseStatus(HttpStatus.OK)
    Product updateProductById(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProductById(id, product);
    }

    @DeleteMapping{"/{id}"}
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteById(@PathVariable Long id){
        productService.deleteById(id);
    }
}
