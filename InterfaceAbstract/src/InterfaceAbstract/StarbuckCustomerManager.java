package InterfaceAbstract;

public class StarbuckCustomerManager extends BaseCustomerManager{
	ICustomerCheckService  _customerCheckService;
	public void Save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Database kayd� yap�ld�:" + customer.getFirstName() + " " +customer.getLastName()) ;
		}else {
			System.out.println("Not a valid person");
		}
		
	}
   
	

}
