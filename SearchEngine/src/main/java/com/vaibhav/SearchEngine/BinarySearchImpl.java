package com.vaibhav.SearchEngine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private Sorting sorting; 

	public BinarySearchImpl(Sorting sorting) {
		super();
		this.sorting = sorting;
	}

	public int binarysearch (int arr[],int x){
		int res []=sorting.Sort(arr);
		 int l = 0, r = res.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	            // Check if x is present at mid 
	            if (res[m] == x) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (res[m] < x) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	  
	        // if we reach here, then element was 
	        // not present 
	        return -1; 
		

	}

}
