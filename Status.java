class Status
{
	public static void main(String[]args)
		{
			int age = 55;
			if(age<18)
				System.out.println("minor");
			else if(age>=18)
				System.out.println("major");
			else if(age>=60)
				System.out.println("Senior Citizen");
			else 
				System.out.println("Invalid");
		}
}