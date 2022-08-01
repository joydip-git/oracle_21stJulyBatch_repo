
public class Program {
	// static polymorphism
	/*
	static void printInformation(Trainer trainerObjRef) {
		String trainerInfo = trainerObjRef.showInformation();
		System.out.println(trainerInfo);
	}

	static void printInformation(Trainee traineeObjRef) {
		String traineeInfo = traineeObjRef.showInformation();
		System.out.println(traineeInfo);
	}
    */
	
	// to this method, you can pass reference of either the same class instance 
	//or the instance of it's child classes
	//no other class instance reference can be passed
	static void printInformation(Person personRef) {
		String personInfo = personRef.showInformation();
		System.out.println(personInfo);
	}
	public static void main(String[] args) {
		String subjects[] = new String[] { "Java", "JavaScript" };

		Trainer joydipTrainerRef = new Trainer("Joydip", "Mondal", "Bangalore", 10000, "Web", subjects);
		Trainee akshatTraineeRef = new Trainee("Akshat", "Ved", "Mumbai", 20000, "Dev", "CITA", "Oracle");

		// up-casting (storing the address of a child class instance in a variable of
		// base class)
		//Person nehaTrainerRef = new Trainer("Neha", "Singhal", "Bangalore", 10000, "Web", subjects);
		//Person falakTraineeRef = new Trainee("Falak", "Rajput", "Mumbai", 20000, "Dev", "CITA", "Oracle");
		
		Trainer nehaTrainerRef = new Trainer("Neha", "Singhal", "Bangalore", 10000, "Web", subjects);
		Trainee falakTraineeRef = new Trainee("Falak", "Rajput", "Mumbai", 20000, "Dev", "CITA", "Oracle");

		// initially calling printInformation(Trainer trainerObjRef)
		// now, calling printInformation(Person personRef)
		printInformation(joydipTrainerRef);
		printInformation(nehaTrainerRef);

		// initially calling printInformation(Trainee traineeObjRef)
		// now, calling printInformation(Person personRef)
		printInformation(akshatTraineeRef);
		printInformation(falakTraineeRef);

		/*
		 * String joydipInfo = joydipTrainerRef.showInformation(); String akshatInfo =
		 * akshatTraineeRef.showInformation();
		 * 
		 * System.out.println(joydipInfo); System.out.println(akshatInfo);
		 * 
		 * String nehaInfo = nehaTrainerRef.showInformation(); String falakInfo =
		 * falakTraineeRef.showInformation();
		 * 
		 * System.out.println(nehaInfo); System.out.println(falakInfo);
		 */
	}
}
