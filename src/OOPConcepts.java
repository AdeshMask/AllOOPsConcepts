
public class OOPConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java Oops Concepts");
		Implementation impl = new Implementation();
		int c= impl.add(10, 5);
		DAy1Interface day = new Implementation();
		System.out.println("Addition: "+day.add(5, 5));
		System.out.println("Addition of two number is: "+ c);
		AbstractClass impl2 = new AbstractImplementation();
		impl2.display();
		Poly1 poly = new Poly2();
		poly.hello();
		Poly1 poly1 = new Poly1();
		poly1.hello("Adesh Maske");
		Encapsulation encaps = new Encapsulation("Adesh ",50,1);
		System.out.println("Return "+encaps.toString());
		encaps.display();
	}
}
