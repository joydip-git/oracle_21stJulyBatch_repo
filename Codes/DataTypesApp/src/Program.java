
public class Program {

	public static void main(String[] args) {

		// variables local to the main method (local variables)
		Person anilPersonReference = null;
		int a = 0;
		String anilInformationReference = null;

		a = 1200;
		System.out.println(a);

		anilPersonReference = new Person("Anil", "Bangalore", 1);
		anilInformationReference = anilPersonReference.getInformation();
		System.out.println(anilInformationReference);

	}

}
