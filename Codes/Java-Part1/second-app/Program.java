class Program{

	 public static void main(String[] args){

		System.out.println("Welcome to Java");

		//int result = Program.addNumbers(10,20);
      Program programObjAddress = new Program();
		int result = programObjAddress.addNumbers(10,20);
		System.out.println(result);
    } 

	//public static int addNumbers(int first, int second){
	public int addNumbers(int first, int second){	
		int additionResult;
		additionResult = first + second;
		return additionResult;
   }
}