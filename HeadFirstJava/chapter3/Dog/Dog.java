class Dog {
	String name;
	public static void main (String[] args) {

		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";

		Dog[] myDogs = new Dog[3]; //making a Dog array

		// and put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		// now access the Dogs using the array references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		//What is myDogs[2] name?
		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);

		//now loop through the array and tell all dogs to bark
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}

	}

	public void bark() {
		System.out.println(name + " says Ruff!");
	}

}