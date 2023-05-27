 class getterstter {
     //only methods can use these private access modifier
     private int a;
     private int b;

     public int getA() {
         return a;
     }

     public int getB() {
         return b;
     }

     public void setA(int a) {
         this.a = a;
     }

     public void setB(int b) {
         this.b = b;
     }
 }
  public class getterssetters{
         public static void main(String[] args) {
             getterstter gs1=new getterstter();
             gs1.setA(2);
             System.out.println( gs1.getA());

     }
 }