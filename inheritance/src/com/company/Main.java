package com.company;

public class Main {

    public static void main(String[] args) {

	    IndividualCustomer engin = new IndividualCustomer();
	    engin.customerNumber ="12345";

	    CorporateCustomer hepsiBurada = new CorporateCustomer();
	    hepsiBurada.customerNumber ="78910";

	    SendikaCustomer sendikaCustomer = new SendikaCustomer();
	    sendikaCustomer.customerNumber ="99999";

	    CustomerManager customerManager = new CustomerManager();
	    customerManager.add(hepsiBurada);
	    customerManager.add(engin);
	    customerManager.add(sendikaCustomer);

	    //Customer[] customers = {engin,sendikaCustomer,hepsiBurada};
		//customerManager.addMultiple(customers);

		customerManager.addMultiple(new Customer[]{
				engin,sendikaCustomer,hepsiBurada
		});


	    customerManager.addMultiple2(hepsiBurada,engin,sendikaCustomer);


    }
}

