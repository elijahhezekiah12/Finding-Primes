import java.util.ArrayList;


public class SOE {

	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();	
		
		// Numbers starting from 2 up to 100
		for(int i = 2; i <= 100; i++)
		{
			numbers.add(i);
		}

		// Select prime number from the list
		for(int i = 0; i < numbers.size(); i++)
		{
			// Check if selected number is divisible with the prime number
			for(int x = 0; x < numbers.size(); x++)
			{
				if((numbers.get(x) % numbers.get(i) == 0) && numbers.get(x)!= numbers.get(i))
				{
					// Remove from prime numbers list
					numbers.remove(x);
				}
			}
		}
		System.out.println("Primes: ");
		int tab_count = 0;
		for(int number : numbers)
		{
			
			if(tab_count % 10 == 0)
			{
				System.out.println("");
			}
			System.out.print(number + "\t");	
			tab_count++;
		}
		
	}
	
}
