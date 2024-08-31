package test3;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

	        // Creating a list of strings
	        List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");

	        // Printing the original list
	        System.out.println("Original list: " + listen);

	        // Sorting the list in natural (lexicographical) order
	        Collections.sort(listen);

	        // Printing the sorted list
	        System.out.println("Sorted list: " + listen);
	        
//			Collections.sort(listen, new Comparator<String>() {
//			@Override
//			
//			public int compare(String a, String b) {
//				return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
//			}
//			});
	    }

	}

