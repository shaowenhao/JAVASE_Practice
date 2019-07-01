package data.tree;

public class TestBinaryTree {
  public static void main(String[] args) {
	  
	BinaryTree binaryTree = new BinaryTree();
	TreeNode root = new TreeNode(1);
	// Ba genjiedian fugei shu
	binaryTree.setRoot(root);
	
	// chuangjian yige zuo jiedian 
	TreeNode rootL= new TreeNode(2);
	//Ba xinchuangjian de jieidan shezhiwei genjiedian de zijiedian
	root.setLefTreeNode(rootL);
	TreeNode rootR= new TreeNode(3);
	root.setRiTreeNode(rootR);
	
	rootL.setLefTreeNode(new TreeNode(4));
	rootL.setRiTreeNode(new TreeNode(5));
	
	rootR.setLefTreeNode(new TreeNode(6));
	rootR.setRiTreeNode(new TreeNode(7));
	
	//qian xu bianli 1 245 367
	binaryTree.frontShow();	
	
	TreeNode result= binaryTree.frontSearch(5);
	System.out.println(result);
	
	// shanchu yige zishu
	binaryTree.delete(5);
	binaryTree.frontShow();
  }
}
