public abstract class Vehicle{
	private int tyres;
	/*public Car(){
		System.out.println("car constructor");
	}
	public Car(int tyres){
		System.out.println("car param constructor");
		this.tyres = tyres;
	}*/
	public abstract void move(); // NO IMPLEMENTATION
	public void setTyres(int tyres){
		this.tyres = tyres;
	}
	public int getTyres(){
		return tyres;
	}
}