# javaSE
public abstract class absClass {
	private int x;
	private int y;
	public absClass() {
		this(0,0);
	}
	public absClass(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void absFun1();//抽象方法
	public abstract void absFun2(int x,int y);
}
