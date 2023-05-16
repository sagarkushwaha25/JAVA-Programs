//Function Overloading
class function
{
             void Btech()
             {
                       System.out.println("Btech from CS");
             }
             void Btech(int x)
             {
                       System.out.println("Btech from ME");
             }
             void Btech(int a,int b)
             {
                       System.out.println("Btech from EC");
             }
             public static void main(String args[])
             {
                        function con=new function();
                        con.Btech(2501);
                        con.Btech();
                        con.Btech(254,668);
             }
}