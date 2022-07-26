class ConstructorOverloading
{
	int id;
	String name;
	int age;
	ConstructorOverloading(int i,String n,int a)
	{
		id = i;
		name = n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String args[])
	{
		ConstructorOverloading s1 = new ConstructorOverloading(16,"Ram",42);
		ConstructorOverloading s2 = new ConstructorOverloading(17,"Ratan",27);
		s1.display();
		s2.display();
	}
}
