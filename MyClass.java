public class MyClass implements Cloneable {
    Integer xx;
    public void setxx(Integer xx){
        this.xx=xx;
    }
    
    public MyClass(Integer x){
        this.xx=x;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    public static void main(String args[]) throws CloneNotSupportedException{
      Integer x=10;
      Integer y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + add(x,y));
      System.out.println(x);
      System.out.println(y);
      MyClass newclass= new MyClass(15);
      MyClass oldclass= newclass;
      MyClass olderclass = (MyClass)newclass.clone();
      System.out.println("Sum of x+y = " + add(x,newclass));
      System.out.println(x);
      System.out.println(newclass.xx);
      System.out.println(oldclass.xx);
       System.out.println(olderclass.xx);
       System.out.println("Sum of x+y = " + add(x,olderclass.xx));
       System.out.println(newclass.xx);
      System.out.println(oldclass.xx);
       System.out.println(olderclass.xx);
    }
    public static int add(Integer i, Integer j){
        i=new Integer(9);
        j=2;
        return i+j;
    }
    public static int add(Integer i, MyClass j){
        i=new Integer(9);
        j.setxx(new Integer(10));
        return i+j.xx;
    }
}
