import java.io.*;
public class Count{
 public static void main(String[] args){
 int i, n, Ctr;
 String input = " ";
 Ctr = 0;
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 for(i = 1; i<=10; i++){
System.out.print("Input integer number: ");

try{
 input = in.readLine();
}catch(IOException e){
 System.out.println("Error!");
}

n = Integer.parseInt(input);

if(n >=0){
 Ctr = Ctr + 1;
 }
 }
 System.out.println("The total value for counter is " + Ctr);
}
}