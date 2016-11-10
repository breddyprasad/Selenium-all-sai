package session1;

public class ConditionExample {
	public static void main(String args[]){
		//forLoop();
		whileLoop();
		//doWhile();
	}
	
	public static void forLoop(){
		int i;
		for (i = 0; i <= 10; i++){
			System.out.println("for Loop -> i = "+ i);
		}
		whileLoop();
	}
	public static void whileLoop(){
		int i = 0;
		while(i <= 10){
			System.out.println("While Loop -> i = "+i);
			i++;
			if(i <= 5){
				continue;
			}else{
				doWhile();
				break;
			}
			
		}
	}
	
	public static void doWhile(){
		int i = 0;
		do{
			System.out.println("do Loop -> i = "+i);
			i++;
		}while(i <= 10);
		
	}

}
