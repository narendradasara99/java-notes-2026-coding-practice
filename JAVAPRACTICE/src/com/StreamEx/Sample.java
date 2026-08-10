package com.StreamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {

		List<Employee> of = List.of(new Employee(1, "naren", "IT", 70000l, 31),
				new Employee(2, "ramya", "HR", 20000, 26), new Employee(3, "ramya", "IT", 30000, 2));

	of.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(s->System.out.println(s));
	
	}
}
