package assignments;

import java.util.Collections;

public class HarvardLawyer extends Lawyer {
	
	//Increase vacation days by 3
	public int getVacationDays() {
		return super.getVacationDays() + 3;
	}
	
	//Increase salary by 20%
	public double getSalary() {
		return super.getSalary() + ((super.getSalary() / 100)*(20)); // $40,000.00
	}
	
	//Just do a string repeat function on vacationForm. not sure if they wanted me to edit the lawyer file?..
	public String getVacationForm() {
		 String repeat = String.join("", Collections.nCopies(4,super.getVacationForm()));
		 return repeat;
	}
}
