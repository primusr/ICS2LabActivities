import java.io.*;
public class start{
 public static void main(String[] args){
	int i,k;
	char again;
	String input = "";

	BufferedReader in = new BufferedReader(new
			      InputStreamReader(System.in));	

	for(i=1;i<=10;i+2){
	    for(k=1;k<=10;k+2){
		System.out.println(k);
	   }
     	   System.out.println(“Do you want to try again? (Y/N)”);
	   try{
	   input = in.readLine();
 	   }catch(IOException e){}
 	   again = input.charAt(0);{
	   }while(again == ‘Y’ || again == ‘y’);
  
 }
}
}