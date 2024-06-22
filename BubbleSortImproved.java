// Bubble sorting, method 2:
// Optimized (improved): if there is not a swapping happened in a round,
// it indicates that all elements are already in the right order. 
// Stop to try rest of rounds
// BubbleSortImproved.java 
class BubbleSortImproved 
{ 
    void bubbleSort(int arr[]) 
    {   
        boolean swapped; 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
        {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) { 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                    swapped = true;
                } 
             }
             // IF no two elements were 
             // swapped by inner loop, then break
             if (swapped == false)
                break;
             System.out.println("Round: " + i);
             printArray(arr); 
        }
    } 
  
    /* Prints the array */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BubbleSortImproved ob = new BubbleSortImproved(); 
        int arr[] = {67, 34, 11, 12, 22, 90, 25}; 
        System.out.println("Original array:"); 
        ob.printArray(arr); 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array:"); 
        ob.printArray(arr); 
    } 
} 
