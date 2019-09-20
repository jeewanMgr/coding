import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class SortingAlg {
	
	
	// Generating Random number of array
	 public void RandNumber(int num[]){   
			
			Random r = new Random();
			
				for(int i=0; i<num.length; i++){
				
					num[i] = r.nextInt(100);
			}
			System.out.print(" \n");
			
		} 
	//displaying the Array()
	 static void Display(int array[]) 
	    { 
	        int n = array.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(array[i] + " "); 
	        System.out.println(); 
	    } 
	
	// MergeSorting Algorithms 
	public void mergSort(int array[], int left, int right) {
		
			 int n = array.length;
	   
	   if (n == 1){
		   return;
	   }
	   
	   else if (left < right) { 	            
         int middle= (int) Math.ceil((left + right)/2);	
         
         mergSort(array, left, middle); 
         mergSort(array , middle + 1, right); 	  	     
         ConnectArray(array, left, middle, right); 
     } 
		  
	}
	
	public void ConnectArray(int arr[], int l, int m, int r)
	{
		 int obj1 = m - l + 1; 
	        int obj2 = r - m; 	  
	 
	        int LEFT[] = new int [obj1]; 
	        int RIGHT[] = new int [obj2]; 
	  
	        for (int i=0; i < obj1; ++i) 
	            LEFT[i] = arr[l + i]; 
	        
	        for (int j=0; j < obj2; ++j) 
	            RIGHT[j] = arr[m + 1 + j]; 
	  
	  	      
	        int i = 0; int j = 0; int k = l; 
	        
	        
	        while (i < obj1 && j < obj2) { 
	            if (LEFT[i] <= RIGHT[j]) { 
	                arr[k] = LEFT[i]; 
	                i++; 
	            } 
	            else{ 
	                arr[k] = RIGHT[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	       
	        while (i < obj1) { 
	            arr[k] = LEFT[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        
	        while (j < obj2) { 
	            arr[k] = RIGHT[j]; 
	            j++; 
	            k++; 
	        } 
	}
	
	//insertion Sorting
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
}
