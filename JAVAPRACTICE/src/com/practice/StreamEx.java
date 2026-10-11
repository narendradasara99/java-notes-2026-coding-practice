package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.StreamEx.Employee;

public class StreamEx {

	public static void main(String[] args) {
		List<Employee> of = List.of(new Employee(1, "naren", "IT", 70000l, 31),
				new Employee(2, "ramya", "HR", 20000, 26), new Employee(3, "ramya", "IT", 30000, 2));

		of.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(s -> System.out.println(s));
		of.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))).forEach((f,d)->System.out.println(f+" "+d));
		
		
		
	}
}
