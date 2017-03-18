/* Programmed by: Karen
   Program title: RelationalOperators.java
   Program Date: February 4, 2017 */

public class RelationalOperators{
	public static void main(String[] args){

	boolean a, b, c, d, e, f;
	int x, y;

	x = 17;
	y = 20;

	a = ((x - y) > (y - x));
	b = ((++x) == (x+1));
	c = ((y%x) <= (y-x));
	d = ((x%y) > (y%x));
	e = ((x * 2) != (2 * x));
	f = ((x-1) > (--x));

	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
 	System.out.println("d = " + d);
	System.out.println("e = " + e);
	System.out.println("f = " + f);

	}
}