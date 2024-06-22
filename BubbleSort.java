// Bubble sorting, method 1:
// Each round finds the biggest value in the subset of values.

// BubbleSort.java 
class BubbleSort 
{ 
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
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
        BubbleSort ob = new BubbleSort(); 
        int arr[] = {67, 34, 11, 12, 22, 90, 25}; 
        System.out.println("Original array:"); 
        ob.printArray(arr); 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array:"); 
        ob.printArray(arr); 
    } 
} 
