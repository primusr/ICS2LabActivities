/* Programmed by: Gapuz,Rafael N.
Program title: Accum2.java
Program Date: March 2 ,2017 */
import java.io.*;
public class Accum2{
	public static void main(String[] args){
		int n,i,ctr,o_ctr,e_ctr; 
		e_ctr =0;
		o_ctr =0;
		ctr = 0 ;
		String input = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(i = 0; i<10; i++){
			System.out.print("Input integer number: ");
			try{
				input = in.readLine();
			}catch(IOException e){
				System.out.println("Error!");
			}
			n = Integer.parseInt(input);
			if(n%2==0){
				e_ctr = e_ctr + n;
			}
			else{
				o_ctr = o_ctr + n;
			}
			}
	System.out.println("The total value for EVEN counter is " + e_ctr );
	System.out.println("The total value for ODD counter is " + o_ctr ) ;
	}
	}
	