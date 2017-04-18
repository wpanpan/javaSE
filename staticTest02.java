/*
static修饰的变量叫做“静态变量”
	变量分类：
		1.局部变量
		2.成员变量（实例变量，非静态变量）
		3.静态变量（方法区）
	什么时候变量声明成静态变量？
		如果这个属性所有的对象都有，并且这个属性的值是相同的，则该属性声明成静态的属性。
	静态变量在类加载阶段赋值，并且只赋值一次。
	成员变量在创建java对象的时候初始化。
*/

public class staticTest02 {
	public static void main(String[] args) {
		Animal a1 = new Animal("BBB",13);
		Animal a2 = new Animal("AAA",12);
		//静态变量使用 "类名." 访问 
		System.out.println(Animal.type);
		// 也可以使用 “引用.” 访问
		System.out.println(a1.type+"-->"+a1.name);
		System.out.println(a2.type+"-->"+a2.name);
		Animal a3 = null;
		System.out.println(a3.type);
		//静态变量底层访问的时候一定使用的 “类名.” 和对象无关，不会出现空指针异常（空引用访问成员）。
	}
}
//抽象现实生活中的“陆生”动物
class Animal {
	//成员变量，（一个对象一份）
	//成员变量在创建对象的时候初始化，并且存储在堆中的每一个对象中
	String name;
	int age;
	static String type = "陆生";
	Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
