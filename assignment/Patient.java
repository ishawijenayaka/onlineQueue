 package assignment;
 import java.util.*;
 
 public class Patient{
	String name;		// patient name
	float position;		// patient queue position number 
	float estimatedWaitingTime;		// patient estimated waiting time

	
	public Patient(String name,float position){
	 this.name = name;
	 this.position = position;	
	}
		
	public void setestimatedWaitingTime(float estimatedWaitingTime){
		this.estimatedWaitingTime = estimatedWaitingTime;
	}
	
	public float getestimatedWaitingTime(){
		return this.estimatedWaitingTime;
	}
	
	public float getposition(){
		return this.position;
	}
}