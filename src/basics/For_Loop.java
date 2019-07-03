package basics;

public class For_Loop {

	public  void  loopfor() {
String names []=  {"Joseh","Ken","Nick","Tony","Edwin"};
String [] majina = {"Mary","James","John","Jack","Mark"};
		
		
		
	for( int i = 0 ; i <3; i++ ) {

		System.out.println(majina.length);
		
		System.out.println(names [i ]);
        System.out.println("");
	
		}
	
	for (String name : names) {
		
		
		System.out.println(name);
	}
	
}
}