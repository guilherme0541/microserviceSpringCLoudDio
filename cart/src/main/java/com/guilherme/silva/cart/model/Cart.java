import java.util.List;

@Data 
@RedisHash("cart")
public class Cart {
    
    @Id 
    private Integer id;

    private List<Item> items;
}
