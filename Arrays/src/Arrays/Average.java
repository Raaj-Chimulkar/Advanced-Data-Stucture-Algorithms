package Arrays;

public class Average {
	 public static double average(int []array)
	 {	
		 int sum=0;
		 int avg=0;
		 for(int i=0;i<array.length;i++)
		 {
			 sum=sum+array[i];
		 }
		 avg=sum/(array.length);
		 return avg;
	 }
}
