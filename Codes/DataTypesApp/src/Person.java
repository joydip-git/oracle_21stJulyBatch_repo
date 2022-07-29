
public class Person {
	String name;
	String location;
	int id;
	
	public Person() {}
	
	public Person(String personName, String personLocation, int personId) {
		name = personName;
		location = personLocation;
		id = personId;
	}
	
	public String getInformation() {
		String information = "Name: "+name+", id: "+id+", Location: "+location;
		return information;
	}
}
