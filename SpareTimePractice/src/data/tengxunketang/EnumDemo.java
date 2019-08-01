package data.tengxunketang;

public class EnumDemo {
    public static void main(String[] args){
      System.out.println(Color.BLUE);
      Color[] color =Color.values();
      for(Color c : color){
          System.out.println(c);
      }
     Person[] person = Person.values();
      for(Person p : person){
          System.out.println(p);
      }
      Person p =Person.P2;
      switch(p){
          case P2:
              System.out.println(Person.P2);
              break;
      }
    }
}

//当jvm加载使用枚举类的时候，会预先创建多个枚举类型的对象
// public static final Color RED = new Color();
enum Color{
    //枚举类型的值必须作为第一条语句
    RED,BLUE,BLACK;
    private Color(){
        System.out.println("构造方法调用");
    }

}

enum Person{
   //public static final Person P1 = new Person("张三",30);
    P1("张三",30),P2("李四",20);
    private String name;
    private int age;

    private  Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return  name+"--"+age;
    }
}