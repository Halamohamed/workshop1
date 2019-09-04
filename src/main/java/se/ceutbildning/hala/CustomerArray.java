package se.ceutbildning.hala;

import java.util.Arrays;

public class CustomerArray {
    private  static Customer[] customers= new Customer[0];
    int offset= customers.length;


    public void addCustomer(Customer cust) throws Exception {
        Customer customer= new Customer("firstName", "lastName", "email@ec.com");
        cuArray(customer);
        Customer customer1= new Customer("hala","mohammed","hala@ec.com");
        cuArray(customer1);
        Customer customer2= new Customer("peter", "sundberg","peter@ec.com");
       cuArray(customer2);

    }

    private void cuArray(Customer cus) {

        customers = Arrays.copyOf(customers,customers.length+1);
        customers[offset] = cus;

    }


    public void printArray(){
        for (Customer c : customers){
            System.out.println(c);
        }
    }
}
