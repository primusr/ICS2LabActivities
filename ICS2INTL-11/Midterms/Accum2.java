import java.util.*;
 public class Accum2{
     static Scanner console = new Scanner(System.in);
     static final int N = 10;
      public static void main (String[] args){
             int counter;
	     int number;
	     int zeros = 0;
	     int odds = 0;
	     int even = 0;
	     int sumeven = 0;
	     int sumodd = 0;
	     String input = "";

	     System.out.println("Please enter " + N +" integers, positive, " + "negative, or zeros.");
	     for (counter = 1; counter <=N; counter++){
	     number = console.nextInt();
	     System.out.print(number + " ");
	   

	     switch(number%2){
	     case 0:
		 even++;
		 if(number == 0)
		    zeros++;
	     sumeven = sumeven + number;
	     System.out.println("The sum of even numbers are: " + sumeven); 
		 break;
             case 1:
	     case -1:
		odds++;
	     sumodd = sumodd + number;
	     System.out.println("The sum of odd numbers are: " + sumodd);
  }
}
	System.out.println();
	System.out.println("There are " + even + " even, " + "which also includes " + zeros + " zeros");
	System.out.println("Total number of odd is: " + odds);
   }
}
	 
	      