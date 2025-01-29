
public class Object03 {

	//编写一个main方法
	public static void main(String[] args) {

		// Person p1 = new Person();
		// p1.age = 10;
		// p1.name = "小明";
		// Person p2 = p1; //把p1 赋给了 p2 ,  让p2指向p1
		// System.out.println(p2.age); // 10
		// 
		// 
		Person2 a = new Person2();
		a.age = 10;
		a.name = "小明";
		Person2 b;
		b = a;
		System.out.println(b.age);   //小明
		b.age = 200;
		b = null;
		System.out.println(a.age);	 //200
		System.out.println(b.age);	 //出现异常

	}
}

class Person2 {
	String name;
	int age;
}