package InterfaceAbstract;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroCustomerManager();
	    customerManager.Save(new Customer("Engin","Demiroðlu",LocalDate.of(1985,1,6),"6545665"));
	    
	}

}
