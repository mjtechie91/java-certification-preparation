import crud.Product.*;
import org.junit.Test;
import static org.junit.Assert.*;
import crud.Product;

public class ProductTest {

    @Test
    public void testAdd(){
        Product prod = new Product(1L, "ABC", 40.00);
        assertEquals(5, prod.add(2,3));
    }

}
