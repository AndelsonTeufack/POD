package robot;

import java.util.Random;


public class Figther extends Robot{

	public Figther () {
		this.point = 10;
		this.name = "";
	}
	public Figther (String name) {
		this.point = 10;
		this.name = name;
		System.out.println("Figther: "+name);
	}
	public void fire(Robot R) {
		if(nextBoolean()==true) {
			R.point = R.point;
			System.out.println(R.name+" a ete rate par "+this.name+". vie: "+R.point);
		}else if(nextBoolean()==false) {
			R.point-=2;
			System.out.println(R.name+" a ete rate par "+this.name+". vie: "+R.point);
		}
		
	}
	
	private boolean nextBoolean() {
		Random rand = new Random();
		boolean seed = rand.nextBoolean();
		return seed;
	}
}
