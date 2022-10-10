package StringPrograms;

public class StringProgram6 {

	
	public static void main(String[] args) {
		String str=new String("Atul");
		String ans =str.intern();
		System.out.println("Heap memory:"+str);
		System.out.println("String Constunt pool:"+ans);
	}
}
