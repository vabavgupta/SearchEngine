package com.vaibhav.SearchEngine;

import org.springframework.stereotype.Component;

@Component
public abstract class BubbleSort implements Sorting{
	 public  int [] Sort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) 
	                { 
	                    // swap arr[j+1] and arr[i] 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                }
			return arr; 
	    } 

	}


