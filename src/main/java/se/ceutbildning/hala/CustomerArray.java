package se.ceutbildning.hala;

import java.util.Arrays;

public class CustomerArray {
    private  Customer[] customers= new Customer[0];

    public CustomerArray() {
        customers = new Customer[0];
    }

    public void addCustomer(Customer customer) throws Exception {
        cuArray(customer);

    }
    public Customer findByEmail(String email){
        for (Customer customer: customers){
            if(customer.getEmail().equals(email)){
                return customer;
            }
        }return null;
    }


    private void cuArray(Customer cus) {
        for( Customer c : customers)
        if(cus.getEmail().equals(c.getEmail())) {
            System.out.println("email already exist");
        }
        else {
            int offset= customers.length;
            customers = Arrays.copyOf(customers, customers.length + 1);
            customers[offset] = cus;
        }

    }

    public Customer findCustomer(String id){
        for (Customer c: customers){
            if(id == c.getId()){
                return c;
            }

        } return null;
    }
    public void removeCustomer(String id){
        int position= findbyid(id);
        for (int i=0; i<customers.length; i++){
            if(position == i){
                customers[i]= customers[i+1];
            }
        }

    }

    private int findbyid(String id) {
        for(int i=0; i<customers.length; i++){
            if(id.equals(customers[i]))
                return i;
        }
        return -1;
    }


    public void printArray(){
        for (Customer customer: customers){
            System.out.println(customer);
        }
    }
}
