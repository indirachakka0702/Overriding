
public class Entry {

	public static void main(String[] args) 
	{
		/*Overriding:
		  Animal --> print something
		  overriding is done in parent and child class
		  overloading can be done in same class
		 */
       Animal a = new Animal();
      // a.animalSound();
       MakeSound(a);
       Dog d = new Dog();
       //d.animalSound();
       MakeSound(d); //dog reference to -->Animal a
       
       Pig p = new Pig();
       //p.animalSound();
       MakeSound(p);
       
       Animal a1 = new Pig();
       a1.animalSound();
       
     car c = new car();
      // there are two types of polymorphism - poly means many
     // 1. static :example Method overloading, it shown error in compile time
     // 2. Dynamic: example Method overriding  it excute when it call that means dynamic, 
     // run time, 3-5 differences for interview 5 is very good
     
	}
  public static void MakeSound(Animal a)
  {
	  a.animalSound();
  }
}
