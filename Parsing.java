package java8;

public class Parsing {
	
	
	public Parsing(int i) {
		
	}
	

	public static void main(String[] args) {
		
		 String a = "15";
		
		int i = Integer.parseInt(a);
		
		System.out.println(a+10);  // as string
		
		System.out.println(i+10);  // as int
		
//		Parsing p = new Parsing(); ,,,,,, 
		
//		if you provide your own constructor then default constructor is not provided
		
		Parsing p = new Parsing(10);
		
		
		
		
	}

}
