package sorting.tree;

public class Node {

    private int value;
    private boolean isLeaf;

    public Node (int value, boolean isLeaf){
        this.value = value;
        this.isLeaf = isLeaf;
    }

    public int getValue(){
        return value;
    }

    public void setLeaf(boolean value){
        this.isLeaf = value;
    }
    public boolean isLeaf(){
        return isLeaf;
    }

}
