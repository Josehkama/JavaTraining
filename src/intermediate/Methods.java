package intermediate;

public class Methods {
	
	public char Grader(int m) {
	
	char g = 'A';
		
	switch(m) {
	case 30:
		g='E';
	
	case 40:
		g='D';
			
	case 50:
		g='C';
		break;
	case 60:
		g='B';
		break;
	
		default:
			g='A';
			break;
		
			
	}
	
		return g;
	
	
	}
		


}
