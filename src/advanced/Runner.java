package advanced;

public class Runner {

	public static void main(String[] args) {
	
		Person p = new Person(1, 45, "Joseh");
		
		
		Person j =new Person();
		j.setid(1);
		j.setName("Ken");
		j.setAge(60);
		
	System.out.println("This is my id "  + j.getid() + "This is my name" + j.getName() + "This is my age" +  j.getAge() );
				
	}

}
