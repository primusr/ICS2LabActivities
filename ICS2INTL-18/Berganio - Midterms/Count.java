import java.io.*;
public class Count{
	public static void main(String args[]){
	int i, n, ctr_pos, ctr_neg;
	String input= "";
	ctr_pos = 0 ;
	ctr_neg = 0 ;
	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	
	for (i = 1 ; i<=10; i++){
		System.out.println("Input Integer Number: ") ;
		try{
			input = in.readLine();
		}catch(IOException e){
			System.out.println(" Error !!!");
		}
		n = Integer.parseInt(input);
		
		if(n >=0){
			ctr_pos = ctr_pos + 1;
		}else{
			ctr_neg = ctr_neg + 1;
		}
		System.out.println("The Total Value for Counter Positive is " + ctr_pos);
		System.out.println("the total value for Counter Negative is " + ctr_neg);
		}
	}
}	