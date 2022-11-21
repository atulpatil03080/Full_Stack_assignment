package ClassAndObject;

public class MainClass {
	public static void main(String[] args) {
		Patient patient = new Patient("Atul", 56, 1.8);
		System.out.println("patient:"+patient.getPatientName()+"\nBMI="+patient.computeBMI());
	}
}
