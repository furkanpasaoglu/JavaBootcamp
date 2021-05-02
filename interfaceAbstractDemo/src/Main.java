import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setDateOfBirth(new Date(1985,1,7));
        customer1.setFirstName("Engin");
        customer1.setLastName("Demiroğ");
        customer1.setNationalityId("28861499108");

	Customer customer2 = new Customer();
        customer2.setDateOfBirth(new Date(1999,8,6));
        customer2.setFirstName("Furkan");
        customer2.setLastName("Paşaoğlu");
        customer2.setNationalityId("12345678910");

	BaseCustomerManager customerManager1 = new NeroCustomerManager(new CustomerCheckManager());
	customerManager1.save(customer1);
	    
	BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new CustomerCheckManager());
	customerManager2.save(customer2);
    }
}
