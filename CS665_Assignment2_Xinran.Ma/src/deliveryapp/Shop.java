/*
 * Name: Xinran Ma
 * Course:CS665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: Shop.java
 * Description: This class is responsible for the methods and attributes of a Shop.
 */

package deliveryapp;

public class Shop {
	private String name;
	
	//constructor
	public Shop(String name) {
		this.name = name;
	}
	
	public DeliveryRequest createDeliveryRequest(String product, String destination) {
		return new DeliveryRequest(this.name, product, destination);
	}
}
