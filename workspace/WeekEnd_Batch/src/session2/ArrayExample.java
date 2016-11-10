package session2;

public class ArrayExample {
	public static void main(String arg[]){
		int [] i = {2,5,1,8,0};
		
		for(int j = i.length-1; j >= 0; j--){
			System.out.println(i[j]);
		}
		for(int j:i){
			System.out.println("for each => "+j);
		}
		int j = 0;
		while(j < i.length){
			System.out.println("While => "+i[j]);
			j++;
		}
		if(i[0] < i[1]){
			
		}
	}
}
