package se.ceutbildning.hala;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Customer[] costomers ;
   private static CustomerArray customerArray= new CustomerArray();
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

            Customer hala= new Customer("hala","mohammed","hala@ec.com");
            addCustomer(hala);
            Customer peter= new Customer("peter", "sundberg","peter@ec.com");
            addCustomer(peter);
            customerArray.removeCustomer("259d2781-6d87-43fd-8e1e-022890aaeafb");
            customerArray.printArray();
            System.out.println("customer array:" ); customerArray.printArray();
            //System.out.println(customer.getId());
            customerArray.findCustomer("259d2781-6d87-43fd-8e1e-022890aaeafb");

        }catch (Exception e){
            System.out.println("not correct email or "+ e.getMessage());
        }




    }




    private static void addCustomer(Customer customer) throws Exception {
        customerArray.addCustomer(customer);
    }
}
