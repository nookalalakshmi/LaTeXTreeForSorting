package sorting.tree;

public class TreeNode {

	private int a;
	private int b;
	private TreeNode predecessor;
	private boolean isLeft;
	
	public TreeNode()
	{
		
	}
	
	public TreeNode(int i, int pivot) {
		this.setA(i);
		this.setB(pivot);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public TreeNode getPredecessor() {
		return predecessor;
	}
	public void setPredecessor(TreeNode predecessor) {
		this.predecessor = predecessor;
	}
	public void setIsLeft(boolean l)
	{
		this.isLeft = l;
	}
	public boolean getIsLeft()
	{
		return isLeft;
	}
	
}
