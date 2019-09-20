import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TestingAlg {

	private static Scanner input;

	public static void main(String args[]) {
		SortingAlg obj = new SortingAlg();
		input = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int data = input.nextInt();
		int array[] = new int[data];
		int array1[]= new int[data];
		obj.RandNumber(array);
		System.out.println("------------------------------------------");
		System.out.println("Unsorted list: ");
		SortingAlg.Display(array);
		System.out.println("------------------------------------------");
		
		Instant start = Instant.now();
		obj.insertionSort(array);
		Instant finish = Instant.now();
		long finaltime = Duration.between(start, finish).toMillis(); // in millis
		System.out.println(" ");
		System.out.println("Sorted the Element by Insertin Sort: ");
		System.out.println("------------------------------------------");
		SortingAlg.Display(array);
		System.out.println("------------------------------------------");
		/*
		 * double endingTime = System.nanoTime(); double actalTime = (endingTime -
		 * startingTime) / 1000000000;
		 */
		System.out.println(" ");
		System.out.println("Insertion Sort Time: " + finaltime + " " + " mili second");

		System.out.println("================================================================================");
		obj.RandNumber(array1);
		System.out.println("------------------------------------------");
		System.out.println("Unsorted list: ");
		SortingAlg.Display(array1);
		System.out.println("------------------------------------------");
		
		Instant startmerg = Instant.now();
		int right;
		right = data/2;
		obj.mergSort(array1, right,data-right);
		Instant finishmerg = Instant.now();
		long FinalTime = Duration.between(startmerg, finishmerg).toMillis(); // in millis
		System.out.println("------------------------------------------");
		SortingAlg.Display(array1);
		System.out.println("------------------------------------------");
		System.out.println("MergeSort Sort Time: " + FinalTime + " " + " mili second");
		
	}

}
