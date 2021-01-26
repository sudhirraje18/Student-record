package Shiv;

 class Rectangle
{
   int length , width;
   
   void getdata(int a , int b)
   {
      length=a;
	  width=b;
	}
	
	int rectarea()
	{
		int area= length*width;
		return (area);
	}
}

class Cls_Rect
{
  public static void main(String args[])
  {
    Rectangle R = new Rectangle();
	R.getdata(2,3);
	R.rectarea();
	
	System.out.println(" Area of Rectangle : " +R.rectarea());
  }
}
	

