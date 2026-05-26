package basic.advance;

class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Runtime {
	
	    public static void main(String[] args) {
	    	
	        Animal a;

	        a = new Dog();   // Dog object
	        a.sound();       // Calls Dog's sound()

	        a = new Cat();   // Cat object
	        a.sound();       // Calls Cat's sound()
	    }
}
