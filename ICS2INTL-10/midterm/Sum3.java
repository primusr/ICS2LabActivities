import java.io.*;
public class Accum2{
public static void main(String[] args){

int i, sum=0;

String input=" ";
BufferedReader in= new BufferedReader(new InputStreamReader(System.in));

try{
System.out.println("Input starting number");
input=in.readLine();
 start =Integer.parseInt(input);

for(i=0;i<=10;i++ )
{
if ( i%2==0);{
sum= sum+i;
}
}
System.out.println("the sum of even is:" + sum);
System.out.println("the sum of add is:" + sum);
}
}
















