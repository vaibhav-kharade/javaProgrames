class Switch_ProgramChar1_1
{
	public static void main(String[] args) 
	{
		int num1=39;
		int num2=67;
		int choice=2;
		switch(choice)
		{
			case 1:System.out.println("Addition= "+(num1+num2));
			    break;
			case 2:System.out.println("Substraction= "+(num1-num2));
			    break;
			case 3:System.out.println("Substraction= "+(num1-num2));
			    break;
			case 4:System.out.println("Division= "+(num1/num2));
			break;
			default:System.out.println("Wrong choice");
		}
	}
}