public class StarbucksCustomerManager extends BaseCustomerManager{
    private CustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
        this._customerCheckService = _customerCheckService;
    }

    @Override
    public void save(Customer customer){
        if(_customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }else{
            System.out.println("Not a valid customer");
        }
    }
}
