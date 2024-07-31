package Dependency_Injection_Example;

public class Main {
    public static void main(String[] args) {
       
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

       
        CustomerService customerService = new CustomerService(customerRepository);

        
        Customer customer = customerService.getCustomer(1);
        System.out.println("Customer Details:");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
    }
}
