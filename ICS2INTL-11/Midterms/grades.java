import java.io.*;

public class grades {
public static void main(String[] args) {
	   
	   int physicsGrade;
	   String input="";

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
        System.out.print("Enter Physics Grade: ");
	try{
	   input=in.readline();
	}catch(IOException e) {
	System.out.println("Error!");
     	}
	physicsGrade = Integer.parseInt(input);
        
	

	   if(grade >= 90)
	   {
	   System.out.println("Grade A");
	   }
	   if(grade >= 80)
	   {
	   System.out.println("Grade B");
	   }
	   if(grade >= 70)
	   {
	   System.out.println("Grade C");
	   }
	   if(grade >= 60)
	   {
	   System.out.println("Grade D");
	   }
	   if(grade >= 40)
	   {
	   System.out.println("Grade E");
	   }
	   else if(grade <40)
	   {
	   System.out.println("Grade F");
	   }
}
}

	