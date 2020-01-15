public class MultiplicationTable{

	public static void main(String []args){
		
		for(int x=0;x<10;x++)
			System.out.print(x+"\t");
			System.out.println();
		for(int x=0;x<10;x++)
			System.out.print("_"+"\t");	

		for(int i=1;i<10;i++){
			System.out.println();
			System.out.print(i+" |"+"\t");

			for(int x=1;x<10;x++){
				System.out.print((x*i)+"\t");

			}
		}

	}
}