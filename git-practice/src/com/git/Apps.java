package com.git;

import java.util.Arrays;
import java.util.List;

public class Apps {

	public static void main(String[] args) {
		Arrays.asList(new Customer("C1","AAA"), new Customer("C2","BBB"), new Customer("C3","CCC")).forEach(System.out::println);
	}

}
