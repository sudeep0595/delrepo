public class Sudeep{
	
	public static void main(String[] args){
		System.out.println("My first program: " + args[0]);
		Car c = new Car();
		c.move();
		c.setTyres(5);
		System.out.println("car tyres: " + c.getTyres());
		Bus b = new Bus();
		b.setTyres(7);
		System.out.println("bus tyres: " + b.getTyres());
		//Vehicle v = new Bus();
	}
}