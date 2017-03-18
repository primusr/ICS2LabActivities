import java.io.*;
public class Sum2{
  public static void main(String[] args){
      int start, b=0, sum;
      String input = "";

      BufferedReader in = new BufferedReader(new
                            InputStreamReader(System.in));
    
      
      do{
	sum = 0;
	for(start = 1; start < 10; start++){
	  System.out.println("Input number " + start + " of 9:");
	  try{
	   input = in.readLine();
	  }catch(IOException e){
	   System.out.println("Error!");
	  }
	  b = Integer.parseInt(input);
	  sum = sum + b;
	 }
	 System.out.println
	 System.out.println(“Do you want to try again? (Y/N)”);
         try{
           input = in.readLine();
         }catch(IOException e){}
         again = input.charAt(0);
         }while(again == ‘Y’ || again == ‘y’);
  }
}