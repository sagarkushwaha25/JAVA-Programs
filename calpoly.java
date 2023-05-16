//Example function overloading
class calpoly
{
            void area(int a)
            {
                     int sq=a*a;
                     System.out.println("Area of square:"+sq);
            }
            void area (int l,int b)
            {
                      int rq=l*b;
                      System.out.println("area of rectangle:"+rq);
            }
            public static void main(String args[])
            {
                       calpoly obj = new calpoly();
                       obj.area(10,5);
                       obj.area(10);
            }
}
