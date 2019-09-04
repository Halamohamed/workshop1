package se.ceutbildning.hala;

import org.junit.Assert;
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
        customerArray.addCustomer(test);
    }

    @Test
    public void test_add_customer() throws Exception {
        Customer peter = new Customer("peter","sundberg","peter@ec.com");
        customerArray.addCustomer(peter);
    }
    @Test
    public void test_findById(){
        Customer result = customerArray.findCustomer(customerId);

        Assert.assertEquals(customerId, result.getId());
    }
}
