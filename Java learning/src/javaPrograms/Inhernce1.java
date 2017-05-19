package javaPrograms;

public class Inhernce1 {

	
	public static void main(String [] args){
		
		babydog b=new babydog();
		b.bark();// inheritance of dog
		b.babydogsleep();
		// inheritance of animals
		b.eat();
		/*Animales an=new Dog();
		an.eat(); // overridding 
		Dog d=new Dog(); // inhertances 
		d.eat(); */
		Animales an1=new Animales();
		an1.eat();
	}
}
