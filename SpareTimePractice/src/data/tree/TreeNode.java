package data.tree;

public class TreeNode {
	int value;
	TreeNode lefTreeNode;
	TreeNode riTreeNode;

	public TreeNode(int value) {
		this.value = value;
	}

	public void setLefTreeNode(TreeNode lefTreeNode) {
		this.lefTreeNode = lefTreeNode;
	}

	public void setRiTreeNode(TreeNode riTreeNode) {
		this.riTreeNode = riTreeNode;
	}

	public void frontShow() {
		//xian bianli dangqian jieidan neirong
		System.out.println(value) ;
		//zuo jiedian
		if (lefTreeNode!=null) {
			lefTreeNode.frontShow();
		}
		//you jiedian
		if (riTreeNode!=null) {
			riTreeNode.frontShow();
		}
	}

	public TreeNode frontSearch(int i) {
		TreeNode target = null;
		if (this.value == i) {
			return this;
		}else {
			if (lefTreeNode!=null) {
				target=lefTreeNode.frontSearch(i);
			}
			if (target!=null) {
				return target;
			}
			if (riTreeNode!=null) {
				target = riTreeNode.frontSearch(i);
			}
		}  
		return target;
	}

	public void delete(int i) {
		TreeNode parent= this;
		if (parent.lefTreeNode!=null && parent.lefTreeNode.value==i) {
			parent.lefTreeNode=null;
			return;
		}
		if (parent.riTreeNode!=null && parent.riTreeNode.value==i) {
			parent.riTreeNode=null;
			return;
		}
		//ru fuo doubushi
		parent = lefTreeNode;
		if (parent!=null) {
			parent.delete(i);
		}
		parent = riTreeNode;
		if (parent!=null) {
			parent.delete(i);
		}
	}
}
