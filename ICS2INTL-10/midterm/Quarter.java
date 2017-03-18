import java.io.*;
public class Quarter{
public static void main(String[] args){

int months ;
String input=" ";
BufferedReader in= new BufferedReader(new InputStreamReader(System.in));



System.out.println("imput months 1 to 12: " );

try{
input=in.readLine();
}catch(IOException e){
System.out.println("error: ");
}

months =Integer.parseInt(input);

switch(months){
case 1 : 
case 2 : 
case 3 :
System.out.println("1st quarter");
break;
case 4 : 
case 5 : 
case 6 : 
System.out.println("2nd quarter");
break;
case 7 : 
case 8 : 
case 9 : 
System.out.println("3rd quarter");
break;
case 10 : 
case 11 : 
case 12 : 
System.out.println("4th quarter");
break;
}
}
}



















