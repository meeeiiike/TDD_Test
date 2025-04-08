import ie.atu.exam.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomerTest {

    @BeforeEach
    void setup(){
        Customer customer = new Customer();
    }

    @Test
    void testFirstName() throws IllegalArgumentException {
        Customer customer = new Customer();
        assertEquals("John" , customer.addFirstName("John"));
    }
    @Test
    void testFirstNameFail(){
        Customer customer = new Customer();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            customer.addFirstName(":(");
        });
        assertEquals("must be > 3 chars", e.getMessage());
    }

    @Test
    void testLastName() throws IllegalArgumentException{
        Customer customer = new Customer();
        assertEquals("TheMan" , customer.addLastName("TheMan"));
    }
    @Test
    void testLastNameFail(){
        Customer customer = new Customer();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            customer.addLastName(":(");
        });
        assertEquals("must be > 3 chars", e.getMessage());
    }

    @Test
    void testID() throws IllegalArgumentException{
        Customer customer = new Customer();
        assertEquals("8-12Chars" , customer.addID("8-12Chars"));
    }
    @Test
    void testIDFail(){
        Customer customer = new Customer();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            customer.addID(":(");
        });
        assertEquals("length must be between 8-12", e.getMessage());
    }

}
