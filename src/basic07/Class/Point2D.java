package basic07.Class;

public class Point2D {
	
		private int x; //외부에서 접근 못하고 method를 통해서만 접근 가능 
		private int y;
		public Point2D() {
			this(1,2); //자기자신의 오버로딩 생성자를 호출
			System.out.println("Point2D() 수행중");
		}
		public Point2D(int x,int y) {
			this.x = x;
			this.y= y;
			System.out.println("Point2D(x,y) 수행중");
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		public void print() {
			System.out.println("x="+getX());
			System.out.println("y="+getY());
		
		}


	

}
