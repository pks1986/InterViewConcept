
class Animal{
	
}
class DownCasting extends Animal{
	static void display(Animal a){
		DownCasting d = (DownCasting) a;
		System.out.println("Downcasting performed");
		}
	public static void main(String[] args) {
		Animal a = new DownCasting();
		DownCasting.display(a);
	}

}
