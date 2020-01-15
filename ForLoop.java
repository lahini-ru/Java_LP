public class ForLoop{

	public static void main(String []args){


		for(int i=0;i<15;i++){
			for(int x=i;x<15;x++)
				System.out.print(" ");
			for(int y=0;y<(i*2)-1;y++)
				System.out.print("*");
		System.out.println();
		}

		for(int i=0;i<15;i++){
			for(int x=0;x<i;x++)
				System.out.print(" ");
			for(int y=(i*2)-1;y<28;y++)
				System.out.print("*");
		System.out.println();
		}
	}

}