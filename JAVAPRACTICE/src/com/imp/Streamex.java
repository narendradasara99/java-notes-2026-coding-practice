package com.imp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamex {

	public static void main(String[] args) {
		List<Employee> l = List.of(new Employee(1, "naren", "IT", 70000l, 31),
				new Employee(2, "ramya", "HR", 20000, 26), new Employee(3, "ramya", "IT", 30000, 2));

		List<Employee> list = l.stream()
				.sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary)).toList();
		
		 Optional<Entry<String, Long>> max = l.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).entrySet().stream().max(Entry.comparingByValue());
		
		System.out.println(max);
	}

}
