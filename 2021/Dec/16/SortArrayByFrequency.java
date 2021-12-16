/**
 * Link: 
 * Date: 
 * Code #
*/

import java.lang.*;
import java.io.*;

class SortArrayByFrequency
 {
	public static void main (String[] args) {
	    Scanner kb = new Scanner(System.in);
	    
	    int t = kb.nextInt();
	    
	    while(t-- > 0) {
	        int n = kb.nextInt();
	        int[] arr = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            arr[i] = kb.nextInt();
	        }
	        
	        solve(arr, n);
	    }
	    
	 }
	 
	 public static void solve(int[] array, int n) {
	     Map<Integer, Integer> map = new HashMap<>();
		List<Integer> outputArray = new ArrayList<>();

		// Assign elements and their count in the list and map
		for (int current : array) {
			int count = map.getOrDefault(current, 0);
			map.put(current, count + 1);
			outputArray.add(current);
		}

		// Compare the map by value
		SortComparator comp = new SortComparator(map);

		// Sort the map using Collections CLass
		Collections.sort(outputArray, comp);

		// Final Output
		for (Integer i : outputArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	 }
}


// Implement Comparator Interface to sort the values
class SortComparator implements Comparator<Integer> {
	private final Map<Integer, Integer> freqMap;

	// Assign the specified map
	SortComparator(Map<Integer, Integer> tFreqMap)
	{
		this.freqMap = tFreqMap;
	}

	// Compare the values
	@Override
	public int compare(Integer k1, Integer k2)
	{

		// Compare value by frequency
		int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));

		// Compare value if frequency is equal
		int valueCompare = k1.compareTo(k2);

		// If frequency is equal, then just compare by value, otherwise -
		// compare by the frequency.
		if (freqCompare == 0)
			return valueCompare;
		else
			return freqCompare;
	}
}