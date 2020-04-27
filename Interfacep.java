package java8;

interface MyInterface{
	
	public void printp();
	
	default public void printq() {
		
		System.out.println("Q called");
	}
	
	static void printr() {
		
		System.out.println("r called");
	}
	
}

public class Interfacep implements MyInterface{
	
	public void printp() {
		System.out.println("p called");
	}
	
//	public void printq() {
//		System.out.println("qq called");
//	}
//	
	void printr() {
		System.out.println("RR called");
	}
	
public static void main(String[] args) {
	
	Interfacep in = new Interfacep();
	
	in.printp();
	in.printq();
	in.printr();
	
	
}
}
