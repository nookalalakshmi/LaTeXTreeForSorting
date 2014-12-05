package sorting.tree;

public class BinaryTree {

    Node root;
    BinaryTree left_child;
    BinaryTree right_child;

    public BinaryTree(){

    }
    public BinaryTree(Node root, BinaryTree left_child, BinaryTree right_child){
        this.root = root;
        this.left_child = left_child;
        this.right_child = right_child;
    }

    public BinaryTree insertElement(int element){
        if (root==null)
            return new BinaryTree(new Node(element, true), null, null);
        else {
            if (root.isLeaf()){
                root.setLeaf(false);
                if (element < root.getValue())
                    return new BinaryTree(root, new BinaryTree(new Node(element, true), null, null), null);
                else
                    return new BinaryTree(root, null, new BinaryTree(new Node(element, true), null, null));
            } else {
                if (element < root.getValue())
                    if (left_child!=null)
                        return new BinaryTree(root, left_child.insertElement(element), right_child);
                    else
                        return new BinaryTree(root, new BinaryTree(new Node(element, true), null, null), right_child);
                else
                    if (right_child!=null)
                        return new BinaryTree(root, left_child, right_child.insertElement(element));
                    else
                        return new BinaryTree(root, left_child, new BinaryTree(new Node(element, true), null, null));
            }
        }
    }

    public BinaryTree getLeftChild(){
        return left_child;
    }

    public BinaryTree getRightChild(){
        return right_child;
    }

    public void setLeftChild(BinaryTree tree){
        this.left_child = tree;
    }

    public void setRightChild(BinaryTree tree){
        this.right_child = tree;
    }

    public BinaryTree buildBinaryTree(int[] elements){
        if (elements.length==0)
            return null;
        else{
            BinaryTree tree = new BinaryTree(new Node(elements[0], true), left_child, right_child);
            for (int i=1;i<elements.length;i++){
                tree = tree.insertElement(elements[i]);
            }
            return tree;
        }
    }

    public void traversePreOrder(){
        if (root!=null)
            System.out.print(root.getValue() + " ");
        if (left_child!=null)
            left_child.traversePreOrder();
        if (right_child!=null)
            right_child.traversePreOrder();
    }

    public void traverseInOrder(){
        if (left_child!=null)
            left_child.traverseInOrder();
        if (root!=null)
            System.out.print(root.getValue() + " ");
        if (right_child!=null)
            right_child.traverseInOrder();
    }
    public void traversePostOrder(){
        if (left_child!=null)
            left_child.traversePostOrder();
        if (right_child!=null)
            right_child.traversePostOrder();
        if (root!=null)
            System.out.print(root.getValue() + " ");
    }

    public static void main(String[] args){
        int[] elements = new int[]{5,7,2,1,4,6,8};
        BinaryTree tree = new BinaryTree();
        tree = tree.buildBinaryTree(elements);
        tree.traversePreOrder();
        System.out.println();
        tree.traverseInOrder();
        System.out.println();
        tree.traversePostOrder();
        System.out.println();
    }

}
