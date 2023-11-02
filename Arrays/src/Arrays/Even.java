package Arrays;

public class Even {
	
	public static int even(int []array)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i]);
			}
		}
		return 0;
	}
}
