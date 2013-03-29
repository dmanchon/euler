public class Euler1 
{
    public static void main (String[] args)
    {
	long acc = 0;
	for (int i=0;i<1000;i++)
	    {
		if (i%3==0 || i%5==0)
		    {
			acc +=i;
		    }
	    }
	System.out.println("Result= "+acc);
    }
}
