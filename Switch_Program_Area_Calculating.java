class Switch_Program_Area_Calculating
{
	public static void main(String[] args) 
	{
		int r = 1145; // radius
		int l = 1145; // length
		int side = 40;
		int b = 55.5;
		double pi = 3.14; // pi value
        double Area_c, 
        Area_c= r * r * pi;
        System.out.println("area of a circle = " + Area_c);

		
        double Area_r, 
        Area_r = l * b;
        System.out.println("Area of A rectangle  = " + Area_r);

		 
        int Area_s = side * side;
        System.out.println("Area of a square = " + Area_s);

		int choice=2;
		switch(choice)
		{
			case 1:
				if (num1%2==0 && num2%2==0)
				{
				System.out.println("Both are even ");
				}
			    break;
			case 2:
				if (num1%2!=0 && num2%2!=0)
				{
				System.out.println("Both are odd ");
				}
			    break;
			case 3:
				if (num1%2!=0 && num2%2!=0)
				{
				System.out.println("Both are odd ");
				}
			    break;
			case 4:System.out.println("Division= "+(num1/num2));
			break;
			default:System.out.println("Wrong choice");
		}
	}
}