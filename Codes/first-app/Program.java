class Program{

	 public static void main(String[] args){
		System.out.println("Welcome to Java");

		//creating instance of the class
		//Calculation calcObjAddress = new Calculation();

		//calling the addNumbers method
		int result;
		//result = calcObjAddress.addNumbers(10,20);
		result = Calculation.addNumbers(10,20);
		System.out.println(result);
   } 

}

class Calculation{
	//public int addNumbers(int first, int second){
	public static int addNumbers(int first, int second){
		int additionResult;
		additionResult = first + second;
		return additionResult;
   }
}