package lesson9.lecture.optional_map.usingoptionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Optional Way - Null Check Deals
public class Main1 {
	private static List<Person> persons;
	public static void main(String[] args) {
		loadData();
		System.out.println("Found a person in the list from Fairfield? " 
				+ personFromFairfield(persons));
	}
	private static boolean personFromFairfield(List<Person> persons) {
		for(Person p: persons) {
			if(Optional.ofNullable(p).map(x -> x.getAddress())
				.map(x -> x.getCity())
				.orElse("").equals("Fairfield")) {
					return true;
			}
		}
		return false;
	}
	
	private static void loadData() {
		persons = new ArrayList<>();
		Address address = new Address();
		address.setStreet("111 Main St");
		address.setCity("Fairfield");
		address.setState("IA");
		address.setZip("52556");
		Person p = new Person();
		p.setName("Joe");
		p.setAddress(address);
		persons.add(p);
		
		address = new Address();
		address.setStreet("1402 Channing Ave");
		address.setCity("Palo Alto");
		address.setState("CA");
		address.setZip("94301");
		p = new Person();
		p.setName("Tom");
		p.setAddress(address);
		persons.add(p);
	}
}
