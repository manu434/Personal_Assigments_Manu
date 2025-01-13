package basics;

public class Logical {
  public static void main(String[] args)
  {
	  String username = "manu";
	  String password = "aswe12345";
	  
//AND operator with 2 condition	all cases 
	  System.out.println(username=="manu" && password=="aswe12345");
	  System.out.println(username=="manu" && password=="aswe");
	  System.out.println(username=="anu" && password=="aswe");
//OR operator with 2 condition	all cases 
	  System.out.println(username=="manu" || password=="aswe12345");
	  System.out.println(username=="anu" || password=="aswe12345");
	  System.out.println(username=="gu" || password=="fhfh");
//NOT operator with 2 conditon all cases
	  System.out.println(!(username=="manu"));
	  System.out.println(!(username=="mks"));
	  System.out.println(!(username=="manu") && !(password=="aswe12345"));
	  System.out.println(!(username=="fgh") || !(password=="aswe12345"));
	  
	  
  }
}
