public class ClassExample{
    int raduis ;
    //constructor without argument 
    public ClassExample(){

    }
    //constructer with argument 
    public ClassExample(int r){
        raduis=r;
    }

    //method
  public double getArea(){
      double area=Math.PI*raduis*raduis;
      return area;
  }
  public double getCircumference(){
      double circumference=2*Math.PI*raduis;
      return circumference;
    }
    public void setRaduis(int r){
        raduis=r;
    }

    //manin function 
    public static void main(String[] args){
        ClassExample c1= new ClassExample();
        ClassExample c2= new ClassExample(30);

        System.out.print("the raduis of c1 is: "+ c1.raduis +"\n");
        System.out.print("the raduis of c2 is : " + c2.raduis + "\n");
        System.out.print("the area of circle c1 is :"+ c1.getArea()+"\n");
        System.out.print("the area of circle c2 is :"+ c2.getArea()+"\n");
//after calling the setRaduis method
        c1.raduis=10;
         System.out.print("the raduis of c1 is: "+ c1.raduis +"\n");
         System.out.print("the area of circle c1 is :"+ c1.getArea()+"\n");
    }
}