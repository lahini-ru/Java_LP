package Weight;

public class WeightApp {
	
	private int weight;
	int one,two,five,ten;
	
	public void findWeights(int weight){
		
		this.weight=weight;
		
		try {
			ten=this.weight/10;
			if(this.weight%10>0) {
				five=(this.weight%10)/5;
				
				if((this.weight%10)%5>0) {
					two=((this.weight%10)%5)/2;
					one=((this.weight%10)%5)%2;
				}
			}
		} catch (Exception e) {
			System.out.println("Enter a valid weight");		}
		
		System.out.println("You will need the below weights to measure "+this.weight+"kg");
			System.out.println("10 kg -"+ten);
			System.out.println("5 kg -"+five);
			System.out.println("2 kg -"+two);
			System.out.println("1 kg -"+one);
				
	}

}
