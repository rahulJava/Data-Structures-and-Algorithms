package Merge;


public class MergeSort {
     
    public  void sort(int inputArray[]){
        sort(inputArray, 0, inputArray.length-1);
    }
     
    public  void sort(int inputArray[], int start, int end){
        if(end <= start){
            return; // we're done traversing the array
        }
         
        int mid = (start + end)/2;
        sort(inputArray, start, mid); // sort left half
        sort(inputArray, mid+1, end); // sort right half
        merge(inputArray, start, mid, end); // merge sorted results into the inputArray
    }
     
    public  void merge(int inputArray[], int start, int mid, int end){
    	int temp [] = new int[end-start+1];
    	
    	int leftSlot=start;
    	int rightSlot = mid+1;
    	int k=0;
    	while(leftSlot<=mid&&rightSlot<=end)
    	{
    		if(inputArray[leftSlot]<inputArray[rightSlot])
    		{
    		 temp [k]= inputArray[leftSlot];
    		 leftSlot= leftSlot+1;
    		 k=k+1;
    		}
    		else
    		{
    			temp[k]=inputArray[rightSlot];
    			rightSlot=rightSlot+1;
    			k=k+1;
    		
    		}
    	}
    	
    	if(leftSlot<=mid)
    	{
    		while(leftSlot<=mid)
    		{
    			temp[k]=inputArray[leftSlot];
    			leftSlot=leftSlot+1;
    			k=k+1;
    		}
    	}
    	if(rightSlot<=end)
    	{
    		while(rightSlot<=end)
    		{
    			temp[k]=inputArray[rightSlot];
    			rightSlot=rightSlot+1;
    			k=k+1;
    		}
    	}
    	
    	for(int i=0;i<temp.length;i++)
    	{
    		inputArray[start+i]=temp[i];
    	}
    }
}
 
     