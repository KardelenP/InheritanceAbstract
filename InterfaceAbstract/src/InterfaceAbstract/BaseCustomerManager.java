package InterfaceAbstract;

public abstract class BaseCustomerManager implements ICustomerServise{
     
	public void Save(Customer customer){
		System.out.println("Saved to db : " + customer.firstName);
		
	}

}
