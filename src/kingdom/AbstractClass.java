package kingdom;

public abstract class AbstractClass
{
	private static int maxId = 0;
	public  int id;
	public String name;
	public int year;

	// default contructor  - every animal will need name and year discoverd
	public AbstractClass(String name, int year)
	{
		maxId++;
    	id = maxId;
    	this.name = name;
    	this.year = year;
	}

	String food()
	{
		return "food";
	}


	int getId()
	{
		return id;
	}

	// idk if we need you - maybe set you up as an abstract one IDKK

	String getName()
	{
		return name;
	}

	int getYear()
	{
		return year;
	}

	// abstract one for the aminmals 

	abstract String move();
	abstract String breath();
	abstract String birth();

	@Override
	public String toString()
	{
		return "Name: " + name + "Id: " + id + " Year Discovered: " + year + "\n";
	}
}