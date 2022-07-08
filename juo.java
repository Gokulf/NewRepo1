package Maths;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class juo {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	set.add("1");
	set.add("2");
	set.add("3");
	HashMap<String, Integer> map = set.stream().collect(Collectors.toMap(x -> x, 0));
	System.out.println(map);
}
}
