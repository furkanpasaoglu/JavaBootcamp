import java.util.Date;

public class CustomerCheckManager implements CustomerCheckService{
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        if(customer.getFirstName() =="Engin" && customer.getLastName() =="Demiroğ" && customer.getNationalityId() =="28861499108"){
            return  true;
        }else{
            return false;
        }
    }
}
