/*
实现单例模式（同类型的对象只创建一个,节省内存开销）
单例模式要领：
	1.私有的静态变量
	2.私有的构造函数
	3.对外提供一个公开的静态的返回当前类型值的方法
单例模式分为两种：
	1.饿汉式:在类加载阶段创建对象
	2.懒汉式：在用到对象时才会创建对象（推介使用）以下例子即为懒汉式
*/
public class Test01 {
	public static void main(String[] arggs) {
		singleton s1 = singleton.getInstance();
		singleton s2 = singleton.getInstance();
		singleton s3 = singleton.getInstance();
		//若等号两边是基本数据类型，则比较的是它们的数据类型是否相同
		//若是引用数据类型，比较的是内存地址
		System.out.println(s2==s1);//true
		System.out.println(s2==s3);//true说明它们保存的内存地址是一样的，指向同一空间
	}
}
class singleton {
	private static singleton s1;
	private singleton(){}
	public static singleton getInstance() {
		if(s1==null) {
			s1 = new singleton();//此处创建对象
		}
		return s1;
	}
}
