package StringPrograms;

public class StringProgram3 {
	
	public static void main(String[] args) {
		String a="atulpatil";
		String newstring="";
		for(int i =0;i<a.length();i++) {
			char ch=a.charAt(i);
			if((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u')) {
				
				newstring=newstring+ch;
				
			}
			
		}
		System.out.println(newstring);
	}

}
