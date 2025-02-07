package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

	public class StreamApi {
		
		public StreamApi () {
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
			List<String> list= Arrays.asList("Meghana","Kaushik","Vinay");
			List<String> stream = list.stream().
				filter (name->name. startsWith("M")).
				collect(Collectors. toList());
				System.out.println(stream);
			List<String> stream1 = list.stream().
				map(String::toUpperCase).collect(Collectors.toList());
				System.out.println(stream1);
		}
}