package se.ceutbildning.hala;

import java.util.Arrays;

public class CustomerArray {
    private  Customer[] customers= new Customer[0];

    public CustomerArray() {
        customers = new Customer[0];
    }

    public void addCustomer(Customer customer) throws Exception {
        for( Customer c : customers)
            if(customer.getEmail().equals(c.getEmail())) {
                System.out.println("email already exist");
            }
            else {
                int offset= customers.length;
                customers = Arrays.copyOf(customers, customers.length + 1);
                customers[offset] = customer;
            }

    }
    public Customer findByEmail(String email){
        for (Customer customer: customers){
            if(customer.getEmail().equals(email)){
                return customer;
            }
        }return null;
    }

    public Customer findCustomer(String id){
        for (Customer c: customers){
            if(c.getId().equals(id)){
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
