package com.StreamEx;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class EmpStream {
	public static void main(String[] args) {
		List<Employee> of = List.of(new Employee(1, "naren", "IT", 70000l, 31),
				new Employee(2, "ramya", "HR", 20000, 26), new Employee(3, "ramya", "IT", 30000, 2));
		// 🔥 1️⃣ Find Highest Paid Employee
		of.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(s -> System.out.println(s));
		of.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(s -> System.out.println(s));
		// 🔥 2️⃣ Find Second Highest Salary Employee
		of.stream().sorted(((c1, c2) -> c1.getSalary() > c2.getSalary() ? 1 : -1)).skip(1).findFirst()
				.ifPresent(s -> System.out.println(s));
		List<Employee> list = of.stream().sorted(((c1, c2) -> c1.getSalary() < c2.getSalary() ? 1 : -1)).toList();
		System.out.println(list);
		List<Employee> list2 = of.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();

		System.out.println(list2);
//🔥 3️⃣ Group Employees by Department
		Map<String, List<Employee>> collect = of.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		System.out.println(collect);
		// 🔥 4️⃣ Department Wise Highest Salary
		Map<String, Optional<Employee>> collect2 = of.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println(collect2);
		// 🔥 5️⃣ Count Employees in Each Department
		Map<String, Long> collect3 = of.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(collect3);
		// 🔥 6️⃣ Find Average Salary of Each Department
		Map<String, Double> collect4 = of.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect4);
//🔥 7️⃣ Partition Employees (Salary > 50K)
		Map<Boolean, List<Employee>> collect5 = of.stream()
				.collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));

		System.out.println(collect5);
//🔥 8️⃣ Find Youngest Employee
		Employee employee = of.stream().min(Comparator.comparing(Employee::getAge)).get();
		System.out.println(employee);
		// 🔥 9️⃣ Get Names of All Employees Sorted by Salary
		List<String> list3 = of.stream().sorted(Comparator.comparing(Employee::getSalary)).map(Employee::getName)
				.toList();
		System.out.println(list3);

		HashSet<Object> hashSet = new HashSet<>();
		// 🔥 🔟 Find Duplicate Employee Names

		List<String> list4 = of.stream().map(Employee::getName).filter(e -> !hashSet.add(e)).toList();

		System.out.println(list4);

		// 🔥 1. Find Nth Highest Salary (Dynamic)
		int n = 3;

		Employee employee2 = of.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(n - 1)
				.findFirst().get();
		System.out.println(employee2);
		
		//🔥 9. Sort by Department then Salary
		
		List<Employee> list5 = of.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary)).toList();
	System.out.println(list5);
	
	//✅ 1️⃣ Find employee names joined by comma
	
	String collect6 = of.stream().map(Employee::getName).collect(Collectors.joining(","));
	System.out.println(collect6);
	
	//✅ 2️⃣ Find department having maximum employees
	
	Optional<Entry<String, Long>> max = of.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).entrySet().stream().max(Entry.comparingByValue());
	System.out.println(max);
	
	//✅ 3️⃣ Get employees between age 25–35
	
	List<Employee> list6 = of.stream().filter(e->e.getAge()>=25&&e.getAge()<=35).toList();
	System.out.println(list6);
	
	//✅ 4️⃣ Find total salary of employees older than 30
	
	Stream<Employee> filter = of.stream().filter(e->e.getAge()>30);
	DoubleStream mapToDouble = filter.mapToDouble(Employee::getSalary);
	System.out.println(mapToDouble.sum());
	
	
	}
}
