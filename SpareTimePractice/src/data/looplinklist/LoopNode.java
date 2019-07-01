package data.looplinklist;

import data.orgz.singlelinklist.Node;

public class LoopNode {
	  
		int data;
		LoopNode next =this;  // when one node in loop linklist
		 
		public LoopNode(int data) {
			this.data = data;
		} 
		
	

		public LoopNode next() {
			return this.next;
		}
		
		public int getData() {
			return this.data;
		}
		
		
		 public void removeNext() {
			 LoopNode newNext = next.next;
			 this.next = newNext;
		 }

		 
	   // 插入一个节点作为当前节点的下一个节点
		 public void after(LoopNode node) {
			 LoopNode nextNext = this.next; 
			 this.next = node;
			 node.next = nextNext;
		 }
}
