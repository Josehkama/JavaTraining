package advanced;

public class Person {

	private int id,age;
	private String name;
	
	
 Person() {
		
	}
	

 Person(int i,int a,String n){
	 
	 this.id=i;
	 this.name=n;
	 age=a;
	 
 }
 
 public void setName(String x) {
	 
	 this.name=x;
 }
 
 public void setid(int i) {
	 
	 this.id=i;
 }
 
 
 
 public void setAge(int a) {
	 
	 this.age=a;
	 
 }

public String getName() {
	return this.name;
	
	
}
public int getid() {
	return this.id;
	
}


public int getAge() {
	return this.age;
	
}









}
