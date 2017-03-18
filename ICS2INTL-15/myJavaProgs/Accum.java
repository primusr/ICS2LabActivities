import java.io.*;
public class Accum{
 	public static void main(String[] args){
	int i, n, k, j, sum = 0;
	String input = " ";
 	BufferedReader in = new BufferedReader(new
		InputStreamReader(System.in));
 	for(i = 0; i%2; i++){
 	System.out.print("Input integer number: ");
 	try{
 	input = in.readLine();
 	}catch(IOException e){
 	System.out.println("Error!");
}
 	n = Integer.parseInt(input);
 	sum = sum + n;
	
	
}
	System.out.println("The number of even numbers are " + sum);
	System.out.println("The number of odd numbers are " + sum);
 }
}