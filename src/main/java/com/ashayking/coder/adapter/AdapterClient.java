package com.ashayking.coder.adapter;

import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class AdapterClient {

	public static void main(String[] args) {
		EmployeeGenerator client = new EmployeeGenerator();

		List<Employee> employees = client.getEmployeeList();

		System.out.println(employees);
	}

}