package methodCalling;

public class StaticMethodOverride {

 static String district ;
int  a=12;
	// int 123name=10; //In java method or variable name can not start with numbers.
//String @name="90";// In java method and Variable name should not start with special character.
//String na me="Priya"; // In java method and Variable name should not contain any space.


public  void nonStaticMethod() {
	
	
	/*-------------------------------------Learning----------------------------------------------------------------------
	 * 1. in non static method we can call both static and non static variables and methods
	*/
	// In non static method we can call static variable
	 System.out.println(district);//we are calling static variable without using class name,because it is declared and called within same class.
	 System.out.println(StaticMethodOverride.district);//generally we should call static variables using the class name
	// (Syntax-> className.variableName)
	 
	 // In non-static method we can call the non-static Variable
	 System.out.println(a);
	 
	
}
public static void main(String arg[]) {
	
	
  
}
}




