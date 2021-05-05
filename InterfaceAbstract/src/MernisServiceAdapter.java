import InterfaceAbstract.Customer;
import InterfaceAbstract.ICustomerCheckService;

public class MernisServiceAdapter  implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapClient client=new KPSPublicSoapClient();
		return false;
		
	}

	

} 
