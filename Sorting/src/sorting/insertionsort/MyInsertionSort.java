package sorting.insertionsort;

import sorting.tree.TreeNode;

public class MyInsertionSort {
	 
	    public void insertionSort(int array[]) {
	        int n = array.length;
	        for (int j = 1; j < n; j++) {
	            int key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] > key ) ) {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = key;
	        }
	    }
	    
	    private void printNode(TreeNode node, String message)
	    {
	    	System.out.print(message);
	    	if(node != null)
	    	{
	    		System.out.println(" "+node.getB() + " : " + node.getA()+" ");
	    	}
	    }
	    

}
