package ArrayPrograms;

public class ArreyProgram2 {
	public void printRepeatedNumber(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int num=arr[i];
			count=1;
			if(num>0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(num==arr[j])
					{
						count++;
						arr[j]=-1;
					}
				}
				System.out.println(num+" :"+count);
			}

		}
	}
	public static void main(String[] args) {
		ArreyProgram2 program=new ArreyProgram2();
		int arr[]={1,4,2,4,2,1,1};
		program.printRepeatedNumber(arr);

	}

}
