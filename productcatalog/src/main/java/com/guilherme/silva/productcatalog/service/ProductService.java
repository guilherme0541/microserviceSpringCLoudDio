package src.main.java.com.guilherme.silva.productcatalog.service;

public class ProductService {
    
    @AutoWired
    private ProductRepository productRepository;

    public Product createProduct(Produto product){
        return productRepository.save(product);  
    }

    public Product getProdcutById(Long id) {
        return productExists(id);        
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();        
    }

    public Product updateProductById(Long id, Product product) {
        productExists(id);
        return productRepository.save(product); 
    }

    public void deleteById(id) {
        productExists(id);
        productRepository.deleteById(id);
    }
    
    private Product productExists(Long id) {
        return productRepository.findById(id)
        .orElseThrow(()->new Exception("Product "+id+" Not Found")); 
    }
}
