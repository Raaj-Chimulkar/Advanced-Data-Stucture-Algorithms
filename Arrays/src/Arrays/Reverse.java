package Arrays;

public class Reverse {
	
	public static void reverse(int [] array)
	{
		int i=0;
		int j=array.length-1;
		int temp;
		
		while(i<=j)
		{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
			
		}
		System.out.println("Reversed array is ::");
		
		for(int k:array)
		{
			
			System.out.println(k);
		}
	}
}
