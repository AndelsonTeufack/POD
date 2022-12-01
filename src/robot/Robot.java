package robot;

public class Robot {
	protected int point;
	protected String name;
	
	public Robot() {
		this.name = "";
		this.point = 10;
		System.out.println("ROBOT: "+ this.name+ "\nPoints: "+this.point);
	}
	public Robot(String name) {
		this.name = name;
		this.point = 10;
		System.out.println("ROBOT: "+ this.name+ "\nPoints: "+this.point);
	}
	
	public void setName(String n) {
		this.name = n;
	}
	public void setPoint(int point) {
		this.point -= point;
	}
	public int getPoint() {
		return this.point;
	}
	public String getName() {
		return this.name;
	}
	public void fire(Robot R){
		R.setPoint(2);
		R.getPoint();
		System.out.println("Robot "+this.name+" a toucher Robot "+R.name);
		System.out.println("Robot "+R.name+" a maintenant "+R.point+" points.");
	}
	public void IsDead() {
		int a = getPoint();
		if(a==0) {
			System.out.println(getName()+" est mort.");
		}
	}
}
