//parent//super//base
class SunMicroSystem
{
         void JAVA()
         {
                    System.out.println("Java prog...");
         }
}
//child//sub//derived
class Google extends SunMicroSystem
{
            void Android()
            {
                        System.out.println("android app develop...");
            }
}
class Oracle extends Google
{
            void DBMS()
            {
                      System.out.println("Sql...");
            }
            public static void main(String args[])
            {
                         Oracle obj=new Oracle();
                         obj.DBMS();
                         obj.JAVA();
                         obj.Android();
            }
}
//Note - Java does not support multiple inheritance therefore java provide aconcept 
       // of an Interface for implenting multiple inheritance