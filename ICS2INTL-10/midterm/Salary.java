import java.util.*;
public class Salary{
public static void main(String[] args){

int salary;
int HRA=0;

Scanner datainput= new Scanner (System.in);


System.out.println("enter salary: " );
 salary =datainput.nextInt();



if ( salary <= 10000 )
{
HRA=(salary * 20)/100;
int DA=(salary * 80)/100;
System.out.println("HRA=20% " +HRA+ "DA=80%" + DA);
}

if( salary < 10000 || salary >= 20000){
HRA=(salary * 25)/100;
int DA=(salary * 90)/100;
System.out.println("HRA=25% ,DA=90%");
}
if( salary >= 20000){
HRA=(salary * 30)/100;
int DA=(salary * 95)/100;
System.out.println("HRA=30% ,DA=95%");
}
}
}


