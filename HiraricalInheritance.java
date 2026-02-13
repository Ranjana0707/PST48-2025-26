package PST2;

public class HiraricalInheritance {

	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.cat();
		Vegitable obj1 = new Vegitable();
		obj1.carrot();
	}

}
class Flower{
	void lilly() {
		System.out.print("lilly is a flower");
	}
}
class Animal extends Flower{
	void cat() {
		System.out.print("cat is a animal");
}
}
class Vegitable extends Flower{
	void carrot() {
		System.out.print("carrot is a vegitable and lilly is flower");
	}
}
