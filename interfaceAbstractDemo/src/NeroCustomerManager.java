public class NeroCustomerManager extends BaseCustomerManager {
    CustomerCheckService _customerCheckService;

    public NeroCustomerManager(CustomerCheckService _customerCheckService) {
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
