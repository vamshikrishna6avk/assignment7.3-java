package session7;//created package as session7

public class Student{//taken class name as Student
	//here we create the first method
	public int add(int x, int y) {//public is a access modifier
		System.out.println("add with two args called");//prints
		return x +y;
	}
	//here we create the second method
	public int add(int x, int y, int z) {
		System.out.println("add with three args called");
		//here we call the 1st method from the second method
		this.add(x,y);//addsx,y using this keyword
		return x + y + z;//returns

	}

	public static void main(String[] args){
		//here we creating the new object
		Student st = new Student();//created new st using new
		System.out.println(st.add(5,8));
		System.out.println(st.add(5,8,6));//prints
	
	}
}