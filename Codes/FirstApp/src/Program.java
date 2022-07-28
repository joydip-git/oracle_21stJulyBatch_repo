public class Program {

	public static void main(String[] args) {
		Calculation calcObjAddress = new Calculation();
		
		//accept two numbers from console 
		//pass those two numbers to addNumbers method
		int output = calcObjAddress.addNumbers(10, 20);
		System.out.println(output);
	}	
}
