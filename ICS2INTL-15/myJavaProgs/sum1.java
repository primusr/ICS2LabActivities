import java.io.*;
public class Sum1{
	public static void main (String[] args){
	int start = 0, end = 0, sum;
	String input = " ";

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	try{
	    System.out.print("Input starting number: ");
		input = in.readLine();
		start = Integer.parseInt(input);

	    System.out.print("Input ending number: ");
	    input = in.readLine();
	    end = Integer.parseInt(input);
	 }catch(IOException e){
		System.out.println("Error!");
	}

	if (start >= end){
	   System.out.print("Starting number should be lesser");
	   System.out.println("than the ending number. ");
	   System.out.println("Try again.");
	   System.exit(0);
	}

	if (start2%2 ==0){
	{
		start = start + 1;
	}

	sum = 0;
	while(start <= end)
	{
		sum = sum + start;
		start = start + 2;
	}
	System.out.println("Sum = " + sum);
	
      }
}
