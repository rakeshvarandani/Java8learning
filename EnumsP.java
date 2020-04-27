package java8;

public class EnumsP {
	
	// Enum is a data type that contains only those values that we have specified in list
	
	
	public enum stateOfMatter{
		
		Solid,Liquid,Gas
	}
	
	public static void main(String[] args) throws Throwable {
		
		
		EnumsP abc = new EnumsP();
		abc.toString();
	   System.out.println(stateOfMatter.Liquid +" "+ abc.toString()+" "+ abc.hashCode() + " " );
	   abc.finalize();
	   System.out.println(stateOfMatter.Liquid +" "+ abc.toString()+" "+ abc.hashCode() + " " );
	   for(stateOfMatter s : stateOfMatter.values()) {
		   
		   System.out.println(s);
	   }
 
	   
	   }
	   
	}
	


