package week1.day1;

public class OddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i =1 ; i<=100; i++)
		{
			if(i%2 != 0 )
			{
				//System.out.print(i);
				
				sum= sum + i;	
				
			}
			
				
		}
		
		System.out.println(sum);

	}

}
