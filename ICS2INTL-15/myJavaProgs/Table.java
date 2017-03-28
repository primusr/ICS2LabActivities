import java.io.*;
public class Table{
public static void main(String[] args){
	int table[][] = new int[3][3];
	int i, j, num = 0;
	String input = " ";
	BufferedReader in = new BufferedReader(new
			InputStreamReader(System.in));

	for(i = 0; i < 3; i++){

	for(j = 0; j < 3; j++){

	table[i][j] = 0;

	}

}

	for(i = 0; i < 3; i++){
	for(j = 0; j < 3; j++){

	System.out.print("Input table[" + i + "]["+ j +"= ");

	try{

	input = in.readLine();

	}catch(IOException e){}

	num = Integer.parseInt(input);

	table[i][j] = num;

	}

	}

	for(i = 0; i < 3; i++){

	for(j = 0; j < 3; j++){

	System.out.print(table[i][j]);

	}

	System.out.println();

		}

	}

}