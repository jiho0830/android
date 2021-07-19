
public class no1test extends point {
	public static void main(String[] args) {

		point p1 = new point(5, 10);
		System.out.println(p1.toString());
	}

}

class point {
	protected int x, y;

	
	public point() {
		this.x=0;
		this.y=0;
	}

	public point(int z, int t) {
		this.x = z;
		this.y = t;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
