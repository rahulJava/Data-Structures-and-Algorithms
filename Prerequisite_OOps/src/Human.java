
public class Human extends Earth{
	 static String name;
	int age;
	int heightInInches;
	String eyeColor;
	public Human()
	{
		
	}
	public void speak()
	{
		System.out.println("Hello, my name is:"+name);
		System.out.println("I am:"+age+"years old");
		System.out.println("My eye color is "+eyeColor);
		System.out.println("I am:"+heightInInches+"tall");
		
	}
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	public void eat()
	{
		System.out.println("eating...");
	}
	public void walk()
	{
		System.out.println("waliking...");
	}
	public void work()
	{
		System.out.println("working...");
	}
	

}
