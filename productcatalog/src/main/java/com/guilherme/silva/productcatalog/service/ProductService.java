package src.main.java.com.guilherme.silva.productcatalog.service;

public class ProductService {
    
    @AutoWired
    private ProductRepository productRepository;

    public Product createProduct(Produto product){
        return productRepository.save(product);  
    }

    public Product getProdcutById(Long id) {
        return productRepository.getById(id)
                    .orElseThrow(()->new Exception("Product "+id+" Not Found"));        
    }
}
