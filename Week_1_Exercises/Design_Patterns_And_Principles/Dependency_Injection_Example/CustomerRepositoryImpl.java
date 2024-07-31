package Dependency_Injection_Example;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(int id) {
      
        return new Customer(id, "HARSHINI S", "harshini@example.com");
    }
}
