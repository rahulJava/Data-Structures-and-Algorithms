package Merge;

public class App {
 
    public static void main(String[] args) {
         
        int[] inputArray = { 9,8,7,6,5,3};
        MergeSort sorter = new MergeSort();
 
         sorter.sort(inputArray);
 
        for(int i = 0; i < inputArray.length; i++){
            System.out.println(inputArray[i]);
        }
         
    }
}