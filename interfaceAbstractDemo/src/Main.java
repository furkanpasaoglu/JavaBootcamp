import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setDateOfBirth(new Date(1985,1,7));
        customer1.setFirstName("Engin");
        customer1.setLastName("Demiroğ");
        customer1.setNationalityId("28861499108");

	    BaseCustomerManager customerManager = new NeroCustomerManager(new CustomerCheckManager());
	    customerManager.save(customer1);
    }
}
