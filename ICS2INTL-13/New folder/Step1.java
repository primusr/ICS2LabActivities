import java.io.*;

public class Step1{
	public static void main(String[] args){
        int start = 0, end = 0,step = 0;
        String input ="";
        BufferedReader in = new BufferedReader (
                new InputStreamReader (System.in));

        try{
            System.out.print("Input starting value= ");
            input = in.readLine();
            start = Integer.parseInt(input);

            System.out.print("Input ending value= ");
            input = in.readLine();
            end = Integer.parseInt(input);

            System.out.print("Input step value= ");
            input = in.readLine();
            step = Integer.parseInt(input);

        }catch (IOException e){
            System.out.println("Error");
        }

        System.out.println("");
        if (start>=end)
        {
            System.out.println("Starting number should be lesser than the ending number.");
        }
        while (start<=end)
        {
            System.out.println(start);
            start = start+step;
        }

        String result ="";
        char y = 'Y';
        char n = 'N';

        BufferedReader it = new BufferedReader (
                new InputStreamReader(System.in));
        try{
            System.out.print("Do you want to retry (Y/N)? ");
            result = it.readLine();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
        start = 0;
        end = 0;
        step = 0;
        input ="";
        BufferedReader in2 = new BufferedReader (
                new InputStreamReader (System.in));
        while ("y".equals(result))
        {
            try{

                System.out.print("Input start value= ");
                input = in2.readLine();
                start = Integer.parseInt(input);

                System.out.print("Input end value= ");
                input = in2.readLine();
                end = Integer.parseInt(input);

                System.out.print("Input step value= ");
                input = in2.readLine();
                step = Integer.parseInt(input);
	    }
             catch (IOException e){
		System.out.println("Error");
            }

	   try{
		System.out.print("Do you want to retry (Y/N)? ");
                result = it.readLine();
            }
            catch (IOException e){
                System.out.println("Error");
            }

            System.out.println("");

            while (start<=end)
            {
                System.out.println(start);
                start = start+step;
            }
        }

        if ("n".equals(result))
            System.exit(0);
	}
  }
}