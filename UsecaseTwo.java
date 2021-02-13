/*
 * The UsecseTwo program implements an application that
 * simply displays estimated waiting time of the patient when clinic has various doctors.
 *
 */

import java.util.*; 
import assignment.CalculateTime;
import assignment.Patient;
import assignment.Doctor; 


public class UsecaseTwo{
	
		public static void main(String[] args) {
			
			
			/*************************************
			 * Use case 2
			 *
			*/
			//Creating user defined class objects  
			Doctor doctor1 = new Doctor("Jenny",3);  
			Doctor doctor2 = new Doctor("Mick",4);  
			Doctor doctor3 = new Doctor("Peter",5); 
			
			//Creating an arraylist with Dctor object
			ArrayList<Doctor> al= new ArrayList<>();		
			al.add(doctor1);
			al.add(doctor2);   
			al.add(doctor3); 
								
			//Creating user defined class objects
			Patient patient1 = new Patient("sama", 11); 
			
			//Creating user defined class objects to calculate waiting time			
			CalculateTime calcu = new CalculateTime();	
			float averageConsultationTime = calcu.display(al);
			
			//set estimated waiting time to the patient object		
			patient1.setestimatedWaitingTime(averageConsultationTime * ( patient1.getposition() - 1));
			
			//Printing output
			System.out.println("\n--- Use case 2 start ---\n");
			System.out.println("Q Position : 11");
			System.out.println("Avarage consultation time for one pateint : "+ averageConsultationTime + "mins");
			System.out.println("Estimated waiting time : "+(int)patient1.getestimatedWaitingTime() + "mins"); 
			System.out.println("\n--- Use case 2 end ---\n");
			

			/*************************************
			 * Use case 2 end 
			 *
			*/			
			

		
		}
}