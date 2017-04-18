public class BaseClass {
	public int x;
	protected int y;
	private int z;
	public BaseClass() {
		this(0,0);
		System.out.println("这是在无参的构造函数中");
	}
	public BaseClass(int x,int y) {
		this.x = x;
		this.y = y;
		System.out.println("这是在有两个参数的构造函数中");
	}
	private void privatefun() {
		System.out.println("这是在privatefun函数中");
	}
	protected void protectedfun() {
		System.out.println("这是在protected函数中");
	}
	public void publicfun() {
		System.out.println("这是在publicfun函数中");
	}
}
