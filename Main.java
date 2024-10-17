class DegioException extends Exception
{
	public DegioException(String string)
	{
		super(string);
	}
}

class A{
	public void show() throws ClassNotFoundException
	{
		Class.forName("Calc");
	}
}

public class Main {
	static {
		System.out.println("Class Loader");
	}
    public static void main(String[] args) {

		A obj = new A();

		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

    }
}