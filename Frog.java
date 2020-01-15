package FrogJohn;

import java.util.Scanner;

public class Frog {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("To enter the distance press 1");
			System.out.println("To enter the time press 2");
			
			int x=sc.nextInt();
			
			if(x==1) {
				
				System.out.println("Enter the distance that John has to jump");
			
				int dis=sc.nextInt();
				if(dis>5) {
					int divD=(dis-5)/9;
					int remD=(dis-5)%9;
							
					int time1=divD*8;
					int time2=0;
				
					if(remD>0&&remD<=3)
						time2=1;
					else if(remD==4)
						time2=3;
					else if(remD>4&&remD<9)
						time2=8;
					else
						time2=0;
					
					System.out.println("John will take "+(time1+time2)+"s to jump "+dis+"m");
				}
			
				else
					System.out.println("John will take 0s to jump "+dis+"m");
			}
			
			else if(x==2) {
				System.out.println("Enter the time john has to jump");
				
				int time=sc.nextInt();
				if(time>0) {
					int divT=(time)/8;
					int remT=(time)%8;
							
					int dis1=divT*9;
					int dis2=0;
				
					if(remT==1)
						dis2=5;
					else if(remT>1&&remT<=3)
						dis2=8;
					else if(remT>3&&remT<8)
						dis2=9;
					else
						dis2=0;
					
					System.out.println("John can jump "+(dis1+dis2)+"m in "+time+"s");
				}
			
				else
					System.out.println("John can jump 5m 0s");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
