package guild;

public class Tests {

	public static void main(String[] args) {
		//Count test:
		System.out.println("************Guild capacity*******************");
		System.out.println("count: "+Warrior.count);
		Warrior w1 = new Warrior();
		System.out.println("count: "+Warrior.count);
		Warrior w2 = new Warrior();
		System.out.println("count: "+Warrior.count);
		Warrior w3 = new Warrior();
		System.out.println("count: "+Warrior.count);
		Warrior w4 = new Warrior();
		System.out.println("count: "+Warrior.count);
		Warrior w5 = new Warrior();
		System.out.println("count: "+Warrior.count);
		
		//Names:
		System.out.println("************Names*****************************");
		System.out.println("name: "+w1.name);
		System.out.println("name: "+w2.name);
		System.out.println("name: "+w3.name);
		System.out.println("name: "+w4.name);
		System.out.println("name: "+w5.name);

	}

}
