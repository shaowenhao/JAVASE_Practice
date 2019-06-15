package list.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Business Class include methods

public class RoleBiz {
	
   List<Role> rolList = null;
   
   public RoleBiz() {
	rolList = new ArrayList<Role>();
  }
   
   public void add(Role r) {
	   if(r != null) {
		   rolList.add(r);
	   }
   }
   
   public void delete(Role r) {
	   rolList.remove(r);
   }
   
   public void show() {
	   System.out.println("name\t title\t hp\t attack");
	   Iterator<Role> iterator = rolList.iterator();
	   while(iterator.hasNext()) {
		   Role role = iterator.next();
		   System.out.println(role.getName()+"\t"+role.getTitle()+"\t\t"+role.getHp()+"\t"+role.getAttack());
		   
	   }
   }
   
   public void update(Role r) {
	   int indexOf = rolList.indexOf(r);
	   if(indexOf!=-1) {
		   rolList.set(indexOf, r);
	   }
   }
   
   public void sort() {
	// implement Comparable interface	   
	 //  Collections.sort(rolList); 
	//   Collections.reverse(rolList);	   
	Collections.sort(rolList, new RoleComparator_Attack());
	Collections.sort(rolList, Collections.reverseOrder(new RoleComparator_Attack()));   
   }

}

//Or self define an Comparator use second sort way more agile
class RoleComparator_Attack implements Comparator<Role>{

	@Override
	public int compare(Role role1, Role role2) {
		if(role1.getAttack() > role2.getAttack()) return 1;
		if(role1.getAttack() < role2.getAttack()) return -1;
		return 0;
	}
	
}
   

   

