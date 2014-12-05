package sorting.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import sorting.tree.TreeNode;

public class MyQuickSort {
    
    private int array[];
    private int length;
    private LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    private TreeNode iParent;
    private TreeNode jParent;
    int pivot = 0;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
    	
        
        System.out.println("New quicksort");
    	//printNode(root);
        quickSort(0, length - 1, null);
    }
 
    private void quickSort(int lowerIndex, int higherIndex, TreeNode root) {
         
        int i = lowerIndex;
        int j = higherIndex;
       
        int pivot = array[(lowerIndex + higherIndex)/2];
        int pivotIndex = (lowerIndex + higherIndex)/2;
        System.out.println(Arrays.toString(array));
        System.out.println("Pivot: " + pivot + " i: " + i + " j: " + j);

        TreeNode parent = null;
     
        parent = null;
       
        while (i <= j) 
        {
       
            while (array[i] < pivot)
        	{
        		addNode(i, pivotIndex, true, parent, "i");
        		i++;
        	}
	            	

        	while(array[j] > pivot)
        	{
    			addNode(j, pivotIndex, true, parent, "j");
                j--;
        		
        	}
        	
            	
            if (i <= j) {  
            	System.out.println("i: " + i + " j: " + j);
                exchangeNumbers(i, j);            	
                i++;
                j--;
                System.out.println(Arrays.toString(array));
            }
        }
        
        if (lowerIndex < j)
        {
        		quickSort(lowerIndex, j, parent);
        }
        if (i < higherIndex)
        {
        	
            quickSort(i, higherIndex, parent);
        }
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private TreeNode addNode(int index, int pivot, boolean isLeft, TreeNode parent, String message)
    {
    	TreeNode firstChild = new TreeNode();
        firstChild.setA(index + 1);
        firstChild.setB(pivot + 1);
        firstChild.setIsLeft(isLeft);
        firstChild.setPredecessor(parent);
		printNode(firstChild, message);
		
		return firstChild;
    }
    
    private void printNode(TreeNode node, String message)
    {
    	System.out.print(message);
    	if(node != null)
    	{
    		System.out.println(" "+node.getB() + " : " + node.getA()+" ");
    	}
    }
    
    private void quickSort(int lowerIndex, int higherIndex) {
        
        int i = lowerIndex;
        int j = higherIndex;
 
        int pivot = array[(lowerIndex + higherIndex)/2];
        
        while (i <= j) {

            while (array[i] < pivot)
            	{
            		i++;
            	}
           
        	while(array[j] > pivot)
            	{
            		j--;
            		
            	}
            	
            if (i <= j) {            	
                exchangeNumbers(i, j);            	
                i++;
                j--;
            }
        }
        
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
    
}