import java.io.*;
public class Count2{
 public static void main(String[] args){
 int i;
 String input = " ";ja
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

try{
 input = in.readLine();
}catch(IOException e){
 System.out.println("Error!");
}

for(i = 1; i<=10; i++){
if(i%2==0){
System.out.println( + i);
i = i + 1;
}
if(i%2!=0){
System.out.println( + i);
i = i + 1;
}
}
System.out.println("the even number are :" + i + " the add number are :"+ i);
}
}

