package addressBook;

import java.util.Scanner;

public class Person {
	private Address address;
	private String name;
	private int ssn;


	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public Person(int ssn, String name, Address address){
		this.ssn = ssn;
		this.name = name;
		this.address = address;

	}
	public Person(){
		this.ssn = (int) (Math.random()*(1*10^9));
		this.name = "Tom";
		this.address = new Address(1234, "Nowhere Road", 11111);
	}
	public static Person addPerson(){
		Scanner s = new Scanner(System.in);
		Address a = new Address(1,"i",1);
		Person p = new Person();
		System.out.println("What is this person's name?");
		p.setName(s.next());
		System.out.println("What is " + p.getName() + "'s social security number?");
		p.setSsn(s.nextInt());
		s.nextLine();
		System.out.println("What is " + p.getName() + "'s zip code?");
		a.setZipCode(s.nextInt());
		s.nextLine();
		System.out.println("What is " + p.getName() + "'s street number?");
		a.setStreetNumber(s.nextInt());
		s.nextLine();
		System.out.println("What is " + p.getName() + "'s street name?");
		a.setRoadName(s.nextLine());
		p.setAddress(a);
		s.close();
		return p;
	}
}
