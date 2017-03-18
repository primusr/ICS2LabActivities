import java.io.*;
public class Start{
public static void main(String[] args){

int start=1, end=10,i, step=2;
char again=' ';
String input=" ";
BufferedReader in= new BufferedReader(new InputStreamReader(System.in));

try{
System.out.print("Input starting valuer=");
input=in.readLine();
 start =Integer.parseInt(input);

System.out.print("Input ending value=");
input=in.readLine();
  end =Integer.parseInt(input);

System.out.print("Input step value=");

}catch(IOException e){
System.out.println("error: ");
}

System.out.println(+ step);
System.out.println(+ end );
do{

for(i=start;i <=end;i++)
{
System.out.println( + i);
 i= start + step;
  start= step;
   end = i;
}
} while (again == 'Y' || again == 'y'); 
System.out.print("do you want to try again(y/N)?");
System.out.print("Y");
}
}


 











