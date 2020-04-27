package java8;

//Anonymouc class is an inner class without any name
//generally in abstract class or interfacce we have to 
//implement using a class and that class can have object 
//to define abstract class or int method
//but in anonymous class we can skip to implement
//and directly create object and provide method implememtation


//here traditionally charlie approach is followed
//but in java 8 alpha nd bravp are also correct

abstract class alpha{
	
  abstract  public void printalpha();
   
}

interface bravo{
	
	public void printbravo();
}


class charlie implements bravo{
	
	public void printbravo(){
		
		System.out.println("Bravo says hello from charlie");
		
	}
}
public class Anonymous {

	public static void main(String[] args) {
		
	alpha a = new alpha() {
		public void printalpha() {
			System.out.println("alpha says hello");
		}
	};
	
	a.printalpha();
	
	bravo b = new bravo() {
		public void printbravo() {System.out.println("bravo says hello anonymously");}
	};
	
	b.printbravo();
	
	charlie c = new charlie();
	c.printbravo();
	}

}
