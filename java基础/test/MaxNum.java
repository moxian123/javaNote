// find the max number in your input the two numbers 
public class MaxNum{
public static void main(String[] args){
	int i;
	int sum=0;
	for(i=1;i<=1000;i++){
		int k=0;
		for(int j=1;j<=i/2;j++){
			if(i%j==0){
				sum+=j;
			}else{
				continue;
			}
		}
		if(sum==i){
			System.out.print(i+"=");
			for(int j=1;j<=i/2;j++){
			if(i%j==0){
				if (k==0){
				k++;
				System.out.print(j);
				}else{
					System.out.print("+"+j);
				}
			}else{
				continue;
			}
		}System.out.println("");
		}
		sum=0;
	}
}
}