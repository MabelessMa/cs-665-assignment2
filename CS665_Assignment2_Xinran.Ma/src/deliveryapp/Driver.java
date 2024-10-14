/*
 * Name: Xinran Ma
 * Course:CS665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: Driver.java
 * Description: This class is responsible for the methods and attributes of a Driver.
 */

package deliveryapp;

public class Driver {
	private String name;
	
	//constructor
	public Driver(String name) {
		this.name = name;
	}
	
	public void notify(DeliveryRequest request) {
		System.out.println(name + " received notification: " + request);
	}
}
