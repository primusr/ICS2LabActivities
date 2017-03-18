/*Programmed by: Karen
  Program title: LogicalOperators.java
  Program Date: February 2, 2017*/

public class LogicalOperators{
	public static void main(String[] args) {
	
	System.out.println("The logical NOT");
	System.out.println("!True = " + !true);
	System.out.println("!False = " + !false);

	System.out.println("The logical AND");	
	System.out.println("True && True = " + (true && true));
	System.out.println("True && False = " + (true && false));
	System.out.println("False && True = " + (false && true));
	System.out.println("False && False = " + (false && true));

	System.out.println("The logical inclusive OR");	
	System.out.println("True || True = " + (true || true));
	System.out.println("True || False = " + (true || false));
	System.out.println("False || True = " + (false || true));
	System.out.println("False || False = " + (false || true));

	System.out.println("The logical exclusive OR");	
	System.out.println("True ^ True = " + (true ^ true));
	System.out.println("True ^ False = " + (true ^ false));
	System.out.println("False ^ True = " + (false ^ true));
	System.out.println("False ^ False = " + (false ^ true));
		

       }
}
