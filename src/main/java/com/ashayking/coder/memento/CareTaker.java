package com.ashayking.coder.memento;

import java.util.Stack;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class CareTaker {

	private Stack<EmployeeMemento> empHistory = new Stack<>();
	
	public void save(Employee emp) {
		empHistory.push(emp.save());
	}
	
	public void revert(Employee emp) {
		EmployeeMemento reveringMem = empHistory.pop();
		emp.revert(reveringMem);
	}
}
