public class ReverseNumber{

	public static void main(String []args){

	int num=214536;
	int temp=0;
	
	while(num!=0){
	
		temp=temp*10;
		temp=temp+num%10;
		num=num/10;
	}

	System.out.print(temp);
	}
}