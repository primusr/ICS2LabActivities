import java.util.*;

public class Quarter{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Accept an integer value from 1 to 12: ");
		int month = in.nextInt();

		/* USING SWITCH STATEMENT

		switch(month){
			case 1:
			case 2:
			case 3:	System.out.println("1st Quarter");
				break;

			case 4:
			case 5:
			case 6:	System.out.println("2nd Quarter");
				break;

			case 7:
			case 8:
			case 9:	System.out.println("3rd Quarter");
				break;


			case 10:
			case 11:
			case 12: System.out.println("4th Quarter");
				break;
		*/

		if (month == 1 || month == 2 || month == 3)
			System.out.println("1st Quarter");

		else if (month == 4 || month == 5 || month == 6)
			System.out.println("2nd Quarter");

		else if (month == 7 || month == 8 || month == 9)
			System.out.println("3rd Quarter");

		else
			System.out.println("4th Quarter");

	
		}
	}
}