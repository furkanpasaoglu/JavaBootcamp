public class Main {

    public static void main(String[] args) {
        Logger[] loggers = { new SmsLogger(), new DatabaseLogger(), new EmailLogger() };
        CustomerManager customerManager = new CustomerManager(loggers);

        Customer customer1 = new Customer(1, "Customer 1", "Customer 1");
        customerManager.add((customer1));
        customerManager.delete((customer1));
    }
}
