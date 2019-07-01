package data.orgz.singlelinklist;

import data.looplinklist.LoopNode;

public class TestNode {

	public static void main(String[] args) {
		Node d1 = new Node(1);
     	Node d2 = new Node(2);
//		Node d3 = new Node(3);
//		d1.append(d2);
//        d2.append(d3);
//        System.out.println(d1.getData());
//        System.out.println(d1.next().next().getData());
        
        Node d4 = new Node(4);
		Node d5 = new Node(5);
    //    d1.append2(d4).append2(d5);
	
    //    System.out.println(d1.next().next().getData());
    //    d1.show();
    //    d1.removeNext();
     //   d1.show();  // 1 5
     //   d1.next().after(d2);
     //   d1.show();
		
		LoopNode ld1 = new LoopNode(1);
		LoopNode ld2 = new LoopNode(2);
		LoopNode ld3 = new LoopNode(3);
		ld1.after(ld2);
		ld2.after(ld3);
		System.out.println(ld1.next().next().next().getData());
	}

}
