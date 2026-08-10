package com.ArraysEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 9, 2, 4, 4 };
		int b[] = new int[4];
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.equals(a, b));
		Arrays.fill(b, 10);

		System.out.println(Arrays.toString(b));

		int[] copyOf = Arrays.copyOf(a, 10);
		System.out.println(Arrays.toString(copyOf));

		// reverse an array

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);

		}

		// find largest element

		int max = a[0];

		for (int m : a) {
			if (m > max) {
				max = m;
			}
		}
		System.out.println("max" + max);

		// print duplicates

		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int d : a) {
			if (!set.add(d)) {
				System.out.println(d);
			}
		}

		int target = 5;
		HashSet<Object> hashSet = new HashSet<>();

		for (int n : a) {
			
			hashSet.add(n);
			int d = target - n;
			if(hashSet.contains(d)) {
				System.out.println(n+" "+d);
			}

		}
		int[] arr = {5,2,8,1};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int num : arr)
            System.out.print(num+" ");
    
	}

}
