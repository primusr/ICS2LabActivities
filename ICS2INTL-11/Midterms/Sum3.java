import java.io.*;
public class Sum3{
  public static void main(String[] args){
      int start = 1, end = 10, step = 2, sum=0;
      String input = "";

      BufferedReader in = new BufferedReader(new
                            InputStreamReader(System.in));
    
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
	do{
	   sum = start + (step + 2);
	}while(start <= end);

	System.out.println("Sum = " + start);
	System.out.println("Sum = " + (start + step));
   }
}