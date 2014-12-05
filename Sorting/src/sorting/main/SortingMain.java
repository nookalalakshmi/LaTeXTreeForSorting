package sorting.main;

import java.util.ArrayList;

import sorting.heapsort.MyHeapSort;
import sorting.insertionsort.MyInsertionSort;
import sorting.quicksort.MyQuickSort;

public class SortingMain {

	public static void main(String a[]){
        
        MyQuickSort quickSorter = new MyQuickSort();
        
        String m = "1234";
        ArrayList<String> strings = permutations(m);
        ArrayList<int[]> nums = new ArrayList<int[]>();
        
        for(String s: strings)
        {
        	String[] i = (s.split(""));
        	int[] num = new int[4];
        	int count= 0;
        	for(int k=1; k<i.length; k++)
        	{
        		
        			num[count] = Integer.parseInt(i[k]);
        	
        		count++;
        		
        	}
        	nums.add(num);
        }
        
        for(int j = 0; j< nums.size(); j ++)
        {
        	quickSorter.sort(nums.get(j));
        	printOutputArray(nums.get(j));
        }
        
        /*int[] input = {1,2,3,4};
        quickSorter.sort(input);*/
        
        //System.out.println("---QuickSort Output---");
        //printOutputArray(input);
        
       /* MyInsertionSort insertionSort = new MyInsertionSort();
        int[] inputArr = {3,4,1,2};
        insertionSort.insertionSort(inputArr);
        System.out.println("---InsertionSort Output---");
        printOutputArray(inputArr);
        
        MyHeapSort heapSort = new MyHeapSort();
        int[] inputArrHeap = {3,4,1,2};
        heapSort.sort(inputArrHeap);
        System.out.println("---HeapSort Output---");
        printOutputArray(inputArrHeap);*/
    }
	
	static ArrayList<String> permutations(String s) {
        if (s == null) {
            return null;
        }

        ArrayList<String> resultList = new ArrayList<String>();

        if (s.length() < 2) {
            resultList.add(s);

            return resultList;
        }

        int length = s.length();
        char currentChar;

        for (int i = 0; i < length; i++) {
            currentChar = s.charAt(i);

            String subString = s.substring(0, i) + s.substring(i + 1);

            ArrayList<String> subPermutations = permutations(subString);

            for (String item : subPermutations) {
                resultList.add(currentChar + item);
            }
        }

        return resultList;
    }
	
	public static void printOutputArray(int[] a)
	{
		for(int i:a){
            System.out.print(i);
            System.out.print(" ");
        }
		System.out.println();
	}

}
