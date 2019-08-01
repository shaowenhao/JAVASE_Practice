package data.basic.chapter4;

public class IntegerDemo {
 public static void main(String[] args) {
   int data1 = 30;
   int data2 = 20;
   Integer i1 = new Integer(data1);
   Integer i2 = new Integer(data2);
   System.out.println(data1 / 3);
   System.out.println(i1.doubleValue() / 3);
   System.out.println(i1.compareTo(i2));
   
  Integer i3= Integer.valueOf(100);
  System.out.println(i3.intValue());
 }
}
