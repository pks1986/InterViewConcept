
public class ThisConst {
	int id;
	String name;
	String school;
	ThisConst(String school){
		this.school = school;
	}
	ThisConst(int id, String name, String school){
		this(school);
		this.id = id;
		this.name = name;
		System.out.println(this);
	}
	void display(){
		System.out.println(id + "	" + name + "	" + school);
	}
	public static void main(String[] args) {
		ThisConst ts = new ThisConst(101, "Sumit", "WCTM");
		ts.display();
		ThisConst ts2 = new ThisConst(102, "Surender", "WCTM");
		ts2.display();
		ThisConst ts3 = new ThisConst(103, "Saurabh", "WCTM");
		ts3.display();
		System.out.println(ts);
		
	}

}
