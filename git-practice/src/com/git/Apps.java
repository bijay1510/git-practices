package com.git;

import java.util.Arrays;
import java.util.List;

public class Apps {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer("C1","AAA"), new Customer("C2","BBB"), new Customer("C3","CCC"));
		customers.forEach(System.out::println);
	}

}
