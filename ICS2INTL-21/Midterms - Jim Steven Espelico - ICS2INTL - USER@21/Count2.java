import java.io.*;
public class Count2{
	public static void main(String[] args){
		int i, n, p_ctr, n_ctr;
		String input = " ";
		p_ctr = 0;
		n_ctr = 0;
		
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		
		for (i = 1; i <= 10; i++){
			System.out.print("Input Integer number: ");
			try{
				input = in.readLine();
			}catch(IOException e){
				System.out.println("Error!");
			}
			
			n = Integer.parseInt(input);
			
			if( n%2 == 0 ){
			p_ctr = p_ctr +1;
			}
			else {
			n_ctr = n_ctr +1;
			}
		}
		System.out.println("ODD: " + p_ctr);
		System.out.println("EVEN: " + n_ctr);
		}
		}