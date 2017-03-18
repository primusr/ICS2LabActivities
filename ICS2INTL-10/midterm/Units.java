import java.util.*;
public class Units{
public static void main(String[] args){

int Rs;

Scanner datainput= new Scanner (System.in);


System.out.println("units: " );
 unit =datainput.nextInt();



if ( unit == 50)
{
Rs= 0.50/ unit;
System.out.println( + Rs);
}

if ( unit == 100)
{
Rs= 0.75/ unit;
System.out.println( + Rs);
}
if ( unit < 250)
{
Rs= 1.50/ unit;
System.out.println( + Rs);
}
}
}


