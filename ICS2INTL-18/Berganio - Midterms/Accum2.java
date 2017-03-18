import java.io.*;
public class Accum2{
public static void main(String[] args){
	int i = 0;
	int n = 0;
	int osum = 0;
	int esum = 0;
	int even = 0;
	int odd = 0;
	String input = "";
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	for(i = 0; i < 10; i++){
		System.out.print("Input integer number: ");
		try{
			input = in.readLine();
		}catch(IOException e){
			System.out.println("Error!");
		}
		
		n = Integer.parseInt(input);
			if(n % 2 == 0){
				esum = esum + n;
			}else{
				osum = osum + n;
			}
		}
		System.out.println("the sum of all even numbers are: " + esum);
		System.out.println("the sum of all odd numbers are: " + osum);
	}
}	