import java.io.*;
public class Quarter{
 public static void main (String[] args) {
	int quarter;
	String input = " ";

 	BufferedReader in = new BufferedReader (new InputStreamReader (System.in));

System.out.print("Input a number from 1 to 4:");

try{
    input = in.readLine();
}catch(IOException e){
 System.out.println("Error!");
}

quarter = Integer.parseInt(input);

switch(quarter){
	case 1: System.out.println("1st Quarter");
	break;
	case 2: System.out.println("1st Quarter");
	break;
	case 3: System.out.println("1st Quarter");
	break;
	case 4: System.out.println("2nd Quarter");
	break;
	case 5: System.out.println("2nd Quarter");
	break;
	case 6: System.out.println("2nd Quarter");
	break;
	case 7: System.out.println("3rd Quarter");
	break;
	case 8: System.out.println("3rd Quarter");
	break;
	case 9: System.out.println("3rd Quarter");
	break;
	case 10: System.out.println("4th Quarter");
	break;
	case 11: System.out.println("4th Quarter");
	break;
	case 12: System.out.println("4th Quarter");
	break;
}

	}
}


	
