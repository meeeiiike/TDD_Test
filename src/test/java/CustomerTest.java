import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testFirstName(){
        Customer customer = new Customer();
        assertEquals("John" , customer.addFirstName("John"));
    }
}
