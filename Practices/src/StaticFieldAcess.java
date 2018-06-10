public class StaticFieldAcess {																																				
	static String name;
	String lastName;
	
	
	public StaticFieldAcess(String name, String lastName) {
		StaticFieldAcess.name = name;
		this.lastName = lastName;
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return "\n\nName: " + StaticFieldAcess.name + "\nLast Name: " + lastName;
	}
	
	
}

class Test1{
	
	StaticFieldAcess object1;
	
	public Test1(String name, String lastName) {
		object1 = new StaticFieldAcess(name, lastName);
		
		System.out.println(object1.toString());
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return object1.toString();
	}
	
	
}
