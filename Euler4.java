public class Euler3
{
    public static void main (String[] args)
    {
	long num = 600851475143L;
	long i  = 1;

        while(num > 1)
	    {
		i++;
		if (num%i == 0)
		    {
			num=num/i;
		    }
	    }
	System.out.println("N="+i);
    }
    
}