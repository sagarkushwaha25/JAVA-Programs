class demo
{
	void func()
	{
		System.out.print("first program ...");
	}
	public static void main(String args[])	
	{
		demo obj = new demo(); // object creating 
		obj.func();		// function calling 
	}
}

/*
public ----- for access outside a class 
static ------ bind with the class name 
	(bcoz static fucntion calls from the class_name)
void-------- no return type of main() method
main()----- reserved function 
	its use for when the translator to read the program for the execution 
String args[]-----command line argument 
	String ---- predefined class
	args------name of array (user friendly )
	[]------ array 
func()------- user defined function 
System-----predefined class (Console/ CMD)
out--------predefined variable/object
print()----predefined function (for write something .....)
class -------- keyword 
demo -------class name (userfriendly )
obj --------object/ reference name 
new --------keyword 
demo()-----default constructor
obj.func()------------function calling 
{ ---------open brace
}---------closing brace 
""--------- double quotes 
; ------semicolon ------ for terminate the statement 
*/



