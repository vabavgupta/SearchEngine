package com.vaibhav.SearchEngine;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SearchEngineApplication {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			int y=s.nextInt();
			arr[i]=y;
		}
		int x=s.nextInt();
		ApplicationContext applicationcontext = 
				SpringApplication.run(SearchEngineApplication.class, args);
		BinarySearchImpl binary =applicationcontext.getBean(BinarySearchImpl.class);
		int result =binary.binarysearch(arr, x);
	}

}
