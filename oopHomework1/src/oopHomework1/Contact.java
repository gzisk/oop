package oopHomework1;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Contact {

	int ContactID=0;
	String Name;
	String Email;
	String Phone;
	String Notes;
	


	private static AtomicInteger ID_Generator= new AtomicInteger(0);
	
	public Contact() {
	
		ContactID = 0;
		Name = " ";
		Email = " ";
		Phone = " ";
		Notes=" ";
	}

	public Contact(String N, String E, String P,String T){
		ContactID=ID_Generator.incrementAndGet();
		Name=N;
		Email=E;
		Phone=P;
		Notes=T;
	}
	public int getID() {
		return ContactID;
	}

	public String getName() {
		
		return Name;
	}

	public void setName(String name) {
		if (Name.isEmpty()) {
			Name=" ";
					
		}
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		if (notes.isEmpty()) {
			notes=" ";
					
		}
		Notes = notes;
	}

	@Override
	public String toString() {
		return "Contact [ContactID=" + ContactID + ", Name=" + Name + ", Email=" + Email + ", Phone=" + Phone + "]";
	}
	
	
	
}
