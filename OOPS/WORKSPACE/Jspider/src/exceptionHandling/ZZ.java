package exceptionHandling;

class Myexcetion extends ClassNotFoundException {

	public Myexcetion(String message) {
		super(message);
	}

}

public class ZZ {

	public static void main(String[] args) {
		
		try {
			throw new MyException("All the best this is Exception");
			
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
		}

	}
}