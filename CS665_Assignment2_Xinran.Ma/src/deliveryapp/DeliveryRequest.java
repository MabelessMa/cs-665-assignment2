/*
 * Name: Xinran Ma
 * Course:CS665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: DeliveryRequest.java
 * Description: This class is responsible for the methods and attributes of a DeliveryRequest.
 */

package deliveryapp;

public class DeliveryRequest {
	private String shopName;
	private String product;
	private String destination;
	
	//constructor
	public DeliveryRequest(String shopName, String product, String destination) {
		this.shopName = shopName;
		this.product = product;
		this.destination = destination;
	}
	
	//getter for shopName
	public String getShopName() {
		return shopName;
	}
	
	//getter for product
	public String getProduct() {
		return product;
	}
	
	//getter for destination
	public String getDestination() {
		return destination;
	}
	
	@Override
	public String toString() {
		return "Delivery Request from: " + getShopName() + " Deliver " + getProduct() + " to " + getDestination();
	}
}
