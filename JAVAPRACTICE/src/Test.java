import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<String> a = Arrays.asList("java", "sb", "sb", "ms");

		a.stream().map(String::toUpperCase).forEach(System.out::println);
		a.stream().filter(s -> s.startsWith("s")).forEach(System.out::println);
		a.stream().filter(s -> s.length() > 4).forEach(System.out::println);
		a.stream().sorted().forEach(System.out::println);
		String collect = a.stream().collect(Collectors.joining(","));
		System.out.println(collect);
		a.stream().distinct().forEach(System.out::println);

		String[] a1 = "helloh".split("");
		Arrays.stream(a1).filter(y -> "aeiou".indexOf(y) != -1).forEach(System.out::println);

		LinkedHashMap<String, Long> collect2 = Arrays.stream(a1)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		System.out.println(collect2);

		Set<Entry<String, Long>> entrySet = collect2.entrySet();

		System.out.println(entrySet);

		entrySet.stream().filter(s -> s.getValue() == 1).map(En -> En.getKey()).findFirst()
				.ifPresent(System.out::println);
	
	HashSet<Object> hashSet = new HashSet<>();
	
	 List<String> list = Arrays.stream(a1).filter(ne->!hashSet.add(ne)).toList();
	 System.out.println(list);
	
	
	
	}
}