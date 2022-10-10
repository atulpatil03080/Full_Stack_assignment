package ArrayPrograms;

public class Arrayprogram4 {

	public void checkPrime(int arr[])
	{
		int countPrime=0;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			boolean flag=true;
			if(num==1)
				flag=false;
			for(int j=2;j<num/2;j++)
			{
				if(num%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				countPrime++;
			}
		}
		System.out.println("Prime="+countPrime);
	}
	public void checkEven(int arr[])
	{
		int countEven=0,countOdd=0;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			if(num%2==0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}
		}
		System.out.println("Even="+countEven+"\nOdd="+countOdd);
	}
	public void checkPerfect(int arr[])
	{
		int countPerfect=0;
		int sumPerfect=0;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			sumPerfect=0;
			for(int j=1;j<=num/2;j++)
			{
				if(num%j==0)
				{
					sumPerfect=sumPerfect+j;
				}
			}

			if(sumPerfect==num)
			{
				countPerfect++;
			}
		}
		System.out.println("Perfect="+countPerfect);
	}
	public static void main(String[] args) {
		Arrayprogram4 program=new Arrayprogram4();
		int arr[]={13,15,1,6,28,21,11,21,22};
		program.checkEven(arr);
		program.checkPerfect(arr);
		program.checkPrime(arr);

	}

}
