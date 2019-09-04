package se.ceutbildning.hala;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void customer_test_object() throws Exception {
        String firstName="test";
        String lastName = "testName";
        String email= "test@ec.com";

        Customer customer =new Customer("test","testName", "test@ec.com");


        Assert.assertNotNull(customer.getId());
        Assert.assertEquals(firstName,customer.getFirstName());
        Assert.assertEquals(lastName, customer.getLastName());
        Assert.assertEquals(email,customer.getEmail());
    }
}
