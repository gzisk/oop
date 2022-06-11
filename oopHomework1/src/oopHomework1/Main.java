package oopHomework1;

import java.util.*;

public class Main {

	public static void main(String args[]) {	
	ArrayList<Contact> ContactAL= new <Contact> ArrayList();
	showMenu(ContactAL);
	}
	
	public static void addContact(ArrayList<Contact> ContactAL) {
			
		Scanner scan = new Scanner (System.in);
		System.out.println("");
		System.out.println("Main Window--> Add a new contact window: (Enter the following information)");
		System.out.println("==========================================================================");
		System.out.print("Name:");
		String name=scan.nextLine();
		System.out.print("Email:");
		String email=scan.nextLine();
		System.out.print("Phone:");
		String phone=scan.nextLine();
		System.out.print("Notes:");
		String notes=scan.nextLine();
		
		System.out.println("--------------------------------------------------------------------------");
		Contact c1= new Contact(name,email,phone,notes);
//		c1.setName(name);
//		c1.setEmail(email);
//		c1.setPhone(phone);
		ContactAL.add(c1);
	}
	public static void searchContact(ArrayList<Contact> ContactAL) {
		System.out.println("");
		System.out.println("Main Window--> Add a new contact window: (Enter the following information)");
		System.out.println("==========================================================================");
		System.out.println("(1) Search by Name");
		System.out.println("(2) Search by Email");
		System.out.println("(3) Search by Phone");
		System.out.print("Enter Your Choice:");

		Scanner scan = new Scanner (System.in);
		int choice = 0;
		while (choice!=4) {

			choice =scan.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Main Window--> Search for Contact Window --> Search by Name");
				System.out.println("=====================");
				System.out.print("(1)Enter Name:");
				
				String name=scan.next();

				System.out.println("Search Results:");
				System.out.println("---------------------------------------------------------------------");
				System.out.println("ID | Name          | Email              | Phone      | Notes         ");
				System.out.println("---------------------------------------------------------------------");
				for(int i = 0; i< ContactAL.size();i++) {
					Contact c2= ContactAL.get(i);
					if(c2.getName().equals(name)) {
						System.out.format("%-3d|%-15s|%-20s|%-12s|%-15s",ContactAL.get(i).getID(),ContactAL.get(i).getName(),ContactAL.get(i).getEmail(),ContactAL.get(i).getPhone(),ContactAL.get(i).getNotes());
						System.out.println();
					}
				}
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Choose one of these options:");
				System.out.println("(1) To delete a contact");
				System.out.println("(2) Back to Main Window");
				System.out.print("Enter Your Choice:");
				int choice1 = 0;
				choice1=scan.nextInt();
				switch(choice1) {
				case 1:{
					System.out.println("Main Window--> Search for Contact Window --> Search by Name --> Delete a Contact");
					System.out.println("=====================");
					System.out.print("Enter the Contact ID:");
					int deleteId= scan.nextInt();
					if (ContactAL.isEmpty()) {
						System.out.println("Delete failure...Empty ArrayList...Press Enter to go back to main window");

						scan.nextLine();  
						if (scan.hasNextLine()) {
							showMenu(ContactAL);
						}
						break;
					}else {
						int sum=0;
						for(int j = 0; j< ContactAL.size();j++) {
							Contact c21= ContactAL.get(j);
							if(c21.getID()==(deleteId)) {
								ContactAL.remove(j);
								sum++;
								if(sum==0){
					                   System.out.println("Delete failure...Contact does not exist");
					               }
								System.out.println("Deleted...Press Enter to go back to main window");
								scan.nextLine();  
								if (scan.hasNextLine()) {
									showMenu(ContactAL);
								}
								break;
							}
						}
					}
				}
				case 2:{
					
					showMenu(ContactAL);
					
					break;
				} 
				}
			
			} 
			 
			case 2:{
				System.out.println("Main Window--> Search for Contact Window --> Search by Email");
				System.out.println("=====================");
				System.out.print("(1)Enter Email:");
				String email=scan.next();

				System.out.println("Search Results:");
				System.out.println("---------------------------------------------------------------------");
				System.out.println("ID | Name          | Email              | Phone      | Notes         ");
				System.out.println("---------------------------------------------------------------------");
				for(int i = 0; i< ContactAL.size();i++) {
					Contact c2= ContactAL.get(i);
					if(c2.getEmail().equals(email)) {
						System.out.format("%-3d|%-15s|%-20s|%-12s|%-15s",ContactAL.get(i).getID(),ContactAL.get(i).getName(),ContactAL.get(i).getEmail(),ContactAL.get(i).getPhone(),ContactAL.get(i).getNotes());
						System.out.println();
					}
				}
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Choose one of these options:");
				System.out.println("(1) To delete a contact");
				System.out.println("(2) Back to Main Window");
				System.out.print("Enter Your Choice:");
				int choice1 = 0;
				choice1=scan.nextInt();
				switch(choice1) {
				case 1:{
					System.out.println("Main Window--> Search for Contact Window --> Search by Email --> Delete a Contact");
					System.out.println("=====================");
					System.out.print("Enter the Contact ID:");
					int deleteId= scan.nextInt();
					if (ContactAL.isEmpty()) {
						System.out.println("Delete failure...Empty ArrayList...Press Enter to go back to main window");

						scan.nextLine();  
						if (scan.hasNextLine()) {
							showMenu(ContactAL);
						}
						break;
					}else {
						int sum=0;
						for(int j = 0; j< ContactAL.size();j++) {
							Contact c21= ContactAL.get(j);
							if(c21.getID()==(deleteId)) {
								ContactAL.remove(j);
								sum++;
								if(sum==0){
					                   System.out.println("Delete failure...Contact does not exist");
					               }
								System.out.println("Deleted...Press Enter to go back to main window");
								scan.nextLine();  
								if (scan.hasNextLine()) {
									showMenu(ContactAL);
								}
								break;
							}
						}
					}
				}
				case 2:{
					
					showMenu(ContactAL);
					
					break;
				} 
				
				}
				
			
			}case 3:{
				System.out.println("Main Window--> Search for Contact Window --> Search by Phone");
				System.out.println("=====================");
				System.out.print("(1)Enter Phone:");
				String phone=scan.next();

				System.out.println("Search Results:");
				System.out.println("---------------------------------------------------------------------");
				System.out.println("ID | Name          | Email              | Phone      | Notes         ");
				System.out.println("---------------------------------------------------------------------");
				for(int i = 0; i< ContactAL.size();i++) {
					Contact c2= ContactAL.get(i);
					if(c2.getPhone().equals(phone)) {
						System.out.format("%-3d|%-15s|%-20s|%-12s|%-15s",ContactAL.get(i).getID(),ContactAL.get(i).getName(),ContactAL.get(i).getEmail(),ContactAL.get(i).getPhone(),ContactAL.get(i).getNotes());
						System.out.println();
					}
				}
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Choose one of these options:");
				System.out.println("(1) To delete a contact");
				System.out.println("(2) Back to Main Window");
				System.out.print("Enter Your Choice:");
				int choice1 = 0;
				choice1=scan.nextInt();
				switch(choice1) {
				case 1:{
					System.out.println("Main Window--> Search for Contact Window --> Search by Email --> Delete a Contact");
					System.out.println("=====================");
					System.out.print("Enter the Contact ID:");
					int deleteId= scan.nextInt();
					if (ContactAL.isEmpty()) {
						System.out.println("Delete failure...Empty ArrayList...Press Enter to go back to main window");

						scan.nextLine();  
						if (scan.hasNextLine()) {
							showMenu(ContactAL);
						}
						break;
					}else {
						int sum=0;
						for(int j = 0; j< ContactAL.size();j++) {
							Contact c21= ContactAL.get(j);
							if(c21.getID()==(deleteId)) {
								ContactAL.remove(j);
								sum++;
								if(sum==0){
					                   System.out.println("Delete failure...Contact does not exist");
					               }
								System.out.println("Deleted...Press Enter to go back to main window");
								scan.nextLine();  
								if (scan.hasNextLine()) {
									showMenu(ContactAL);
								}
								break;
							}
						}
					}
				}
				case 2:{
					
					showMenu(ContactAL);
					
					break;
				} 
				
				}
				
				
				
				
			}

			default:{
				System.out.println("INVALID INPUT,"
						+ "PLEASE ENTER NUMBER 1-3");
				
				searchContact((ContactAL));
			}


			}

		}
	}
	public static void displayContact(ArrayList<Contact> ContactAL) {
		Scanner scan = new Scanner(System.in);
		if (ContactAL.isEmpty()) {
			System.out.println("Could not display..Empty ArrayList...Press Enter to go back to main window");
			
			if (scan.hasNextLine()) {
				showMenu(ContactAL);
			}
		}else {
			System.out.println("Main Window--> Display All Contacts");
			System.out.println("=====================");

			System.out.println("---------------------------------------------------------------------");
			System.out.println("ID | Name          | Email              | Phone      | Notes         ");
			System.out.println("---------------------------------------------------------------------");
			Collections.sort(ContactAL, new Comparator<Contact>() {
			    public int compare(Contact c1, Contact c2) {
			        return c1.getName().compareTo(c2.getName());
			    }
			});
			for(int i = 0; i< ContactAL.size();i++) {
					System.out.format("%-3d|%-15s|%-20s|%-12s|%-15s",ContactAL.get(i).getID(),ContactAL.get(i).getName(),ContactAL.get(i).getEmail(),ContactAL.get(i).getPhone(),ContactAL.get(i).getNotes());
					System.out.println();
				
			}
			System.out.println("---------------------------------------------------------------------");
			System.out.println();
			System.out.print("Press Enter to go back to main window");
			
			if (scan.hasNextLine()) {
				showMenu(ContactAL);
			}
			
		}
			
		}
	
	
	
	public static void showMenu(ArrayList<Contact> ContactAL)
	{
	System.out.println("Main Window:");
	System.out.println("=============");
	System.out.println("Choose one of the following options:");
	System.out.println("(1) Add a new contact");
	System.out.println("(2) Search for contact");
	System.out.println("(3) Display all contacts");
	System.out.println("(4) Quit");
	System.out.print("Enter Your Choice:");
	Scanner scan = new Scanner(System.in);
	
	int choice = 0;
	try {
		while (choice!=5) {
		choice =scan.nextInt();
		Contact C = new Contact();
			switch(choice) {
			case 1:{
				
				addContact(ContactAL);
				System.out.println("Saved Successfully...... Press Enter to go back to the Main Window");
				scan.nextLine();  
				if (scan.hasNextLine()) {
					showMenu(ContactAL);
				}
				break;
			}
			case 2:{
				searchContact(ContactAL);
				
				break;
			}
			case 3:{
				displayContact(ContactAL);
				
				break;
			}case 4:{
				System.out.println("Exit Successfully!");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("INVALID INPUT,"
						+ "PLEASE ENTER NUMBER 1-4");
				showMenu(ContactAL);
			}
				
			
			}
				
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
