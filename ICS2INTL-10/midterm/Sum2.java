import java.io.*;
public class Sum2{
public static void main(String[] args){

int start=0, end = 0, sum;

String input=" ";
BufferedReader in= new BufferedReader(new InputStreamReader(System.in));

try{
System.out.println("Input starting number");
input=in.readLine();
 start =Integer.parseInt(input);

System.out.println("Input ending number");
input=in.readLine();
  end =Integer.parseInt(input);
}catch(IOException e){
System.out.println("error: ");
}

if (start >= end ){
System.out.println("starting number should be less");
System.out.println("than the ending number.");
System.out.println("Try again");
System.exit(0);
}

if (start%2 == end )
{
start= start +1;
}
 sum = 0;
for(start = start; start <= end; start = start + 2){
 sum = sum +start;
}
System.out.println("sum=" + sum);

}
}
















