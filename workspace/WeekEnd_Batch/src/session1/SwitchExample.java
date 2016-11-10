package session1;

public class SwitchExample {
	public static void main(String a[]){
		int i = 5;
		int j = 2;
		int k = 1;
		
		switch((i+j)/k){
		case 1:
			System.out.println("value of exp = "+1);
			break;
		case 2:
			System.out.println("value of exp = "+2);
			break;
		case 3:
			System.out.println("value of exp = "+3);
			break;
		case 7:
			System.out.println("value of exp = "+7);
			break;
		default:
			System.out.println("value of exp = "+"some default value");
			break;
		}
	}

}
