package robot;

public class Arena {
	
	public Robot fight(Robot R1, Robot R2) {
		
		do {
		
			R1.fire(R2);
			R2.fire(R1);
			
			if(R1.getPoint()<0) {
				System.out.println("\nLe robot "+R2.getName()+" a gagne!");
				return R2;
			}
			else if(R2.getPoint()<0) {
				System.out.println("\nLe robot "+R1.getName()+" a gagne!");
				return R1;
			}
			
			R2.IsDead();
			R1.IsDead();
			
		}while(R1.getPoint()>0 && R2.getPoint()>0);
		
		return R1;
}
}
