class  IfElseStatementVowelOrConsonant
{
	public static void main(String[] args) 
	{
		char ch='g';
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
		{
			System.out.println(ch +" is a Vowel");
		}
		else
		{
			System.out.println(ch+ " is a Consonant");
		}
	}
}