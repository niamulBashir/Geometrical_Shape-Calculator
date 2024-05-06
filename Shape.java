
class Shapeinfo{

 public String  Area(){
  String  g = "Please select specific Area Content ";
  return g;
 }
 public String Perimeter()
 {
   String  h ="Please select Specific Perimeter Circle or Ractangle";
    return h;
 }  
 
 /*public double Circlearea(double r){
    return 3.1416*r*r;
  
   }
   public double CirclePerimeter(double r, double h)
   {
      return 2*3.1416*h;
   } 
   */
  
}

class Circle extends Shapeinfo{
    public double Area(double r){
        return 3.1416*r*r;
      
       }

       public double Perimeter(double r, double h)
       {
          return 3.1415*r*h;
       }  
       
  }

  class Ractangle extends Shapeinfo{
   
    public double Area(double a,double b){
        return a*b;
      
       }

       public double Perimeter(double a, double b)
       {
          return 2*(a*b);
       }  
  }


public class Shape {
    public static void main(String a[])
    {
     Circle obj1 = new Circle();
     Ractangle  obj2 = new Ractangle();


     System.out.println(obj1.Area(100));
     System.out.println(obj1.Area());
    
    }
}