package basics;

public class WhileLoop {

	public static void main(String[] args) {
	int i = 0;
	
	
	// System.out.println(++i) increments then it prints the value
	//System.out.printl(i++) prints before increment

	String names []=  {"Joseh","Ken","Nick","Tony","Edwin"};
	
	
	
	while (i < 5) {
	
		System.out.println(names[i++]);
		i+=1;
		i++;
		i = i+1;
		++i;
		
	}
	
//	do {
//		
//		System.out.println(names[i]);
//		i++;
//	}while(i<3);
//	
//	
//	
//	
	}

}
