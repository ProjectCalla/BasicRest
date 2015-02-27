package logic.calendar.main;

import java.util.ArrayList;

public class Calendar {
	public int _id = -1;
	private ArrayList<Event> events;
	
	public Calendar(){
		
	}
	public Calendar(ArrayList<Event> events){
		this.events = events;
	}
}
