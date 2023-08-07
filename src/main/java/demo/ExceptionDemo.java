package demo;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		System.out.println("Hi");
		System.out.println(1/0);
		System.out.println("Bye");
		}
		catch(Exception e){
			System.out.println("i am in catch block");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("i am in finally block");
		}

	}

}
