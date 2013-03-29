public class Euler2
{
    public static void main (String[] args)
    {
	long acc = 0;
	long fib1 = 1;
	long fib2 = 2;
	while(fib1<4000000)
            {
		long aux = fib2;
		fib2 = fib1+fib2;
		fib1 = aux;
		if (fib1%2==0)
                    {
			acc +=fib1;
                    }
            }
	System.out.println("Result= "+acc);
    }
}
