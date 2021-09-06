package src.main.java.com.guilherme.silva.productcatalog.model;

@Document(indexName = "product", type = "catalog")
@Data
public class Product {
    
    @Id
    private Long id;

    private String name;

    private Integer amount;
}
