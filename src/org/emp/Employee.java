package org.emp;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
public void empId() {
	
			

		
	int a[]= {1,2,3,4,5,6};
	Arrays.sort(a);
	for (int i = a.length-1; i >=0; i--) {
		if(a[i]==a[a.length-1]) {
			System.out.println(a[i]);
		}
	}
}
}
