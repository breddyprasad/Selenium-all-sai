package InterfaceExample;

public class Exception1 {
	
	public static void main(String arg[]){
		int i =10;
		int j = 0;
		
		try{
			int k = i/j;
		}catch(ArithmeticException e){
			System.out.println("caught exe=-- "+e.getMessage());
			throw e;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("finally block--");
		}
	}

}
