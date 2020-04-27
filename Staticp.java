package java8;


// static properties can be used by all without creation of objects

class TryStatic{
	
	static int i=15;
	
	public int j= 20;
	
	public static int myint() {
		
		//properties inside static methods can be static or final only
		
		return 10 + i;
		
		// return 10+j; .......not valid as j is non-static
	}
	
}

public class Staticp {

	public static void main(String[] args) {
	

		System.out.println(TryStatic.myint());
		
		
		
	}

}
