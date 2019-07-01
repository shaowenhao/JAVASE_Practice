package data.orgz.singlelinklist;

public class Node {
   
	int data;
	Node next;
	 
	public Node(int data) {
		this.data = data;
	} 
	
	public void append(Node node) {
		this.next = node;
		
	}
	// 为节点追加节点  追加在最后
	public Node append2(Node node) {
		
		Node currentNode = this;
		while(true) {
			Node nextNode = currentNode.next();
			
			if(nextNode==null) {
				break;
			}
			currentNode = nextNode;
		}
		 currentNode.next = node;
		 return this;
	}
	
	public Node next() {
		return this.next;
	}
	
	public int getData() {
		return this.data;
	}
	
	
	 public void removeNext() {
		 Node newNext = next.next;
		 this.next = newNext;
	 }
	 
	 public void show() {
		 Node currentNode = this;
		 while(true) {
			 System.out.print(currentNode.data+" ");
			 if (currentNode.next == null) {
				 break;
			 }
			currentNode = currentNode.next;
		 }
		 System.out.println();
	 }
	 
	 
	 public void after(Node node) {
		 Node nextNext = this.next;
		 this.next = node;
		 node.next = nextNext;
	 }
}
