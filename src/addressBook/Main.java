package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Main {
	private static List<Person> personList;


	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		personList = new ArrayList<Person>();
		Random r = new Random();
		for(int i = 0; i < 100; i++){
			personList.add(new Person(r.nextInt(999999), "Tom", new Address(1234, "Nowhere Road", 12345)));
		}
		String result;
		boolean loopAlive = true;
		while(loopAlive){
			System.out.println("Type \"add\" to add a person to the address book. Type \"search\" to look for someone already in the address book. When you are done, \ntype \"quit\" to end the program.");
			Scanner s = new Scanner(System.in);

			result = s.next();
			s.close();
			switch(result){
			case "add":
				personList.add(Person.addPerson());
				break;
			case "search":
				//TODO
				break;
			case "quit":
				//TODO
				//s.close();
				loopAlive = false;
				break;
			}
		}
	}

}
//create a while loop to make the program alive (asking what number person you want to see)
