//polymorphism // Example of function overloading

class GLA
{
	void Btech()
	{
		System.out.println("btech from CS");
	}
	void Btech(int account)
	{
		System.out.println("btech from EC");
	}
	void Btech(int a,int b)
	{
		System.out.println("btech from Mach....");
	}
	public static void main(String args[])
	{
		GLA con = new GLA();
		con.Btech(1000,1500);
	}
}

/*
		-------------Polymorphism --------
	*******One thing many forms that is called polymorphism **********

		type1			type2
			
		Static			Dynamic

	I		II		I		II

	Function		Operator		Virtual 		late 
	Overloading	Overloading	function		Binding

C++	Yes		Yes		Yes		-----

JAVA	Yes		No		No		Yes		



-------------------------------------------------------------------------------------------------------------
Function Overloading :-
	-when a class contains more than one function which having a same name 
	along with different argument's that is called function overloading 

	-------------
	In a function overloading :-

		* Function name must be same 
		* Function argument must be different
		* Function return type may be same or not 

	Ex.
		void func(int a,int b)
				
		* void----------- function return type 
		* func ---------- function name (user friendly)
		* (int a,int b)---function argument / parameter / signature 
*/




