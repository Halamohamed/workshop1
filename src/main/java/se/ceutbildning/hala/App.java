package se.ceutbildning.hala;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //uppgift 1
       /*
        try {
            Customer customer= new Customer("hala","mohammed","hala@ec.com");
            System.out.println(customer);
        }catch (Exception e){
            System.out.println("not correct email or "+e.getMessage());
        }*/

       //uppgift 2
        try {

            Customer customer= new Customer("hala","mohammed","hala@ec.com");
        CustomerArray customerArray= new CustomerArray();
      customerArray.addCustomer(customer);
        customerArray.printArray();
        }catch (Exception e){
            System.out.println("not correct email or "+ e.getMessage());
        }




    }
}
