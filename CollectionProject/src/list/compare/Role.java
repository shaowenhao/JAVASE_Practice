package list.compare;

//implements Comparable<Role>
public class Role {
   private String name;
   private String title;
   private int hp;
   private  int attack;
   
   
   
//@Override
//public int compareTo(Role o) {
//	// TODO Auto-generated method stub
//	return hp - o.hp;
//	
//}
public Role(String name, String title, int hp, int attack) {
	this.name = name;
	this.title = title;
	this.hp = hp;
	this.attack = attack;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}
public int getAttack() {
	return attack;
}
public void setAttack(int attack) {
	this.attack = attack;
}

	@Override
	public boolean equals(Object obj) {
		 if(!(obj instanceof Role)) {
			 return false;
		 }
			 Role role = (Role) obj;
		return name.equals(role.getName());
}
  

   
}
