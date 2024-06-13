package basic07.Class;

public class Point3D extends Point2D{
	private int z;

	public Point3D() {
	
		this(10,20,30); //자신의 생성자를 가져오는 방법
		//super(); //따로 호출 하지 않으면 기본 생성자를 자동으로 호출
		System.out.println("Point3D() 수행 중");

	}
	public Point3D(int x,int y,int z) {
		super(x,y);
		this.z=z;
		System.out.println("Point3D(x,y,z) 수행 중");
	}
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("z="+getZ());
		
	
	}


}
