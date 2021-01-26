package Shiv;


class Box
{
	double width, lenght , height;
	
	
	Box()
	{
		System.out.println(" Constructor has Started");
		
		width=2;
		lenght=3;
		height=4;
	}
	
	void Volume()
	{
		double vol= width* lenght*height;
		System.out.println(" Volume of Box :"+vol);
	}
}

public class Constructr1
{
	public static void main(String[] args)
	{
		Box b= new Box();
		b.Volume();
	}

}
