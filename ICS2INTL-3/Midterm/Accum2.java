import java.io.*;

public class Accum2{
	public static void main(String[] args){
		int i, n, sumEven = 0, sumOdd = 0;
		String input = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (i = 0; i < 10; i++){
			System.out.print("Input integer number: ");
			try{
				input = in.readLine();
			}catch(IOException e){
				System.out.println("Error!");
			}

			n = Integer.parseInt(input);
			if (n % 2 == 0)
				sumEven = sumEven + n;
			else
				sumOdd = sumOdd + n;
		}
		System.out.println("The sum of the EVEN INTEGERS is " + sumEven);
		System.out.println("The sum of the ODD INTEGERS is " + sumOdd);
	}
}
