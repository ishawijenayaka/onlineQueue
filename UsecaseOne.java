/*
 * The UsecseOne program implements an application that
 * simply displays estimated waiting time of the patient when clinic has only one doctor.
 *
 */

import java.util.*; 
import assignment.CalculateTime;
import assignment.Patient;
import assignment.Doctor; 


public class UsecaseOne{
	
		public static void main(String[] args) {
			
			//Creating user defined class objects  
			Doctor doctor1 = new Doctor("Jenny",3);  
			
			//Creating an arraylist with Doctor object
			ArrayList<Doctor> al= new ArrayList<>();		
			al.add(doctor1);
											
			//Creating user defined class objects
			Patient patient1 = new Patient("John", 6); 
			
			//estimated waiting time calculation	
			CalculateTime calc = new CalculateTime();	
			float averageConsultationTime = calc.display(al);
			
            //set estimated waiting time to the patient object			
			patient1.setestimatedWaitingTime(averageConsultationTime * ( patient1.getposition() - 1));
			
		    //Printing output
			System.out.println("\n--- Use case 1 start ---\n");
			System.out.println("Q Position : 6");
			System.out.println("Avarage consultation time for one pateint : "+ averageConsultationTime + " mins");
			System.out.println("Estimated waiting time : "+(int)patient1.getestimatedWaitingTime() + "mins"); 
			System.out.println("\n--- Use case 1 end ---\n");
			
			}
}