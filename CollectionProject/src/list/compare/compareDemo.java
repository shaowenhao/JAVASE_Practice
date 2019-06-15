package list.compare;

public class compareDemo {

	public static void main(String[] args) {
        RoleBiz  r1 = new RoleBiz();
        Role role1 = new Role("RYAN","Solider",100,80);
        Role role2 = new Role("Kevin","Engineer",200,70);
        Role role3 = new Role("Kevin","Engineer",150,70);
        r1.add(role1);
        r1.add(role2);
        r1.add(role3);
        r1.show();
        
        r1.sort();
        r1.show();
       // r1.delete(role2);
       // r1.delete(new Role("RYAN", "teacher", 200, 70));
       // r1.show();
      //  r1.update(new Role("RYAN", "teacher", 180, 70));
       // r1.show();
	}

}
