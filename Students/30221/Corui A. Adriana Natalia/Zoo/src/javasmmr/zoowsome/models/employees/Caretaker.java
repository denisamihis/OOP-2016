package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Interface.Caretaker_I;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	private double workingHours;
	public Caretaker(String name, BigDecimal salary) {
		super(name, salary);
	}
	public double getWorkingHours()
	{
		return workingHours;
	}
	public void setWorkingHours(double workingHours)
	{
		this.workingHours=workingHours;
	}
	@Override
	public String takeCareOf(Animal a) {
		if(a.kill())
		{
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if(this.workingHours < a.getMaintCosts())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}

}
