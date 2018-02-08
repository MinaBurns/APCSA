import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	Quadratic test = new Quadratic();
   	test.setEquation(5, -8, 3);
   	test.calcRoots();
   	test.print();
   	
   	Quadratic test2 = new Quadratic();
   	test2.setEquation(3, 2, -7);
   	test2.calcRoots();
   	test2.print();
   	
   	Quadratic test3 = new Quadratic();
   	test3.setEquation(9, 6, 1);
   	test3.calcRoots();
   	test3.print();
   }
}
