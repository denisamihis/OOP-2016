package javasmmr.zoowsome.services;

public class EmployeeFactory {
	
	public EmployeesFactory getEmployeesFactory(String type)
	{
		if(Constants.Employees.Caretaker.equals(type))
		{
			return new CaretakerFactory();
		}
		//else if(Constants.Employees.Investor.equals(type)) // we'll need this later on
		//{
			//return new InvestorFactory();
		//}
		//else if(Constants.Employees.Manager.equals(type)) // we'll need this later on
		//{
			//return new ManagerFactory();
		//}
		else
		{
			return null;
		}
	}

}
