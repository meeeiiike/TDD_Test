import ie.atu.exam.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @BeforeEach
    void setup(){
        Customer customer = new Customer();
    }
    @Test
    void testFirstName(){
        Customer customer = new Customer();
        assertEquals("John" , customer.addFirstName("John"));
    }
}
