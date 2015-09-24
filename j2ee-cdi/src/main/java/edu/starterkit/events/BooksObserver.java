package edu.starterkit.events;

import javax.enterprise.event.Observes;

import edu.starterkit.to.BookTo;

public class BooksObserver {
	
	public void onAnyBookToEvent(@Observes BookTo book) { 
		System.out.println("Event event");
	}

}
