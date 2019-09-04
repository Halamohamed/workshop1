package se.ceutbildning.hala;

import org.junit.Before;
import org.junit.Test;

public class CustomerArrayTest {
    private static CustomerArray customerArray;
    private String customerId;
    public Customer[] data() throws Exception {
        Customer[] customers= {
                new Customer("test","testson","test@ec.com"),
                new Customer("test2","test2son","test2@ec.com")};
        return customers;
    }
    @Before
    public void init() throws Exception {
        customerArray = new CustomerArray();
        for (Customer customer: data()){
            customerArray.addCustomer(customer);
        }
        Customer test = new Customer("hala","mohammed","hala@ec.com");
        customerId = test.getId();
    }

    @Test
    public void test_add_customer(){

    }
}
