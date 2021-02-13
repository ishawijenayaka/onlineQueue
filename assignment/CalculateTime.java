/*
 * The UsecaseTwo program implements an application that
 * simply displays estimated waiting time to the patient when clinic has various doctors.
 *
 */

package assignment;

import java.util.*;
import assignment.Doctor;
import assignment.Patient;
 
 public class CalculateTime{
		float averageConsultationTime; 
		float lcmConsultationTime = 1;
		float totalConsultationPatient;
		float patientsPerDoctor;
		
		
		/* 
		 * @param ArrayList<Doctor> all This is the paramter to display method
         * @return float This returns averageConsultationTime.
		 */
		
		public float display(ArrayList<Doctor> all){
			
			Iterator itr=all.iterator();
			 
			/*
			 * traverse elements of ArrayList object to get cunsultationTime of each doctors 
			 * to find least common factor
			 */
			while(itr.hasNext()){  
				Doctor doct = (Doctor)itr.next(); 
				lcmConsultationTime = lcmConsultationTime * doct.cunsultationTime ; 
			}
			
			/*
			 * traverse elements of ArrayList object to get cunsultationTime of each doctors 
			 * to find patient per doctor
			 */
			Iterator itr1 =all.iterator();  
			while(itr1.hasNext()){  
				Doctor doct = (Doctor)itr1.next(); 
				patientsPerDoctor = lcmConsultationTime / doct.cunsultationTime ; 
					
				totalConsultationPatient + = patientsPerDoctor;			
			} 
			
			averageConsultationTime = lcmConsultationTime / totalConsultationPatient;
			return averageConsultationTime;
			
		}
	
}