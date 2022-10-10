package ArrayPrograms;

public class ArrayProgram5 {
	
	
	public void sorting( int a[]) {
		int temp;
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<a.length/2;j++) {
				
				if(a[j]<a[i]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
					
				}
			}
			if(i>=a.length/2) {
				
				for(int j=i+1;j<a.length;j++) {
					
					
					if(a[i]>a[j]) {
						
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
				}
				
				
			}
			
		}
		
		
		for(int b:a);
		
		
	}
	
	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2}; 
		ArrayProgram5 ap5= new ArrayProgram5();
		ap5.sorting(a);
		
		
	}

}
