package com.ashayking.coder.memento;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class MementoClient {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();

		Employee emp = new Employee();
		emp.setName("Ashay Patil");
		emp.setPhone("21323123");
		emp.setAddress("London");

		// Put Into Memento
		System.out.println("Employee before save : " + emp);
		careTaker.save(emp);

		// Update and Put Into Memento
		emp.setPhone("9999999");
		careTaker.save(emp);
		System.out.println("Employee after phone change : " + emp);

		emp.setPhone("234870732"); // Not put into memento

		careTaker.revert(emp);
		System.out.println("Reverting to previous save : " + emp);

		careTaker.revert(emp);
		System.out.println("Reverting to orignal save : " + emp);

	}
}
