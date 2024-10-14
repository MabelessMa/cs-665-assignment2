/*
 * Name: Xinran Ma
 * Course:CS665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: DeliveryNotificationSystem.java
 * Description: This class is responsible for the methods and attributes of a DeliveryNotificationSystem.
 */

package deliveryapp;

import java.util.ArrayList;
import java.util.List;

public class DeliveryNotificationSystem {
	private List<Driver> drivers;
	
	//constructor
	public DeliveryNotificationSystem() {
		drivers = new ArrayList<>();
	}
	
	public void registerDriver(Driver driver) {
		drivers.add(driver);
	}
	
	public void broadcastRequest(DeliveryRequest request) {
		for (Driver driver : drivers) {
			driver.notify(request);
		}
	}
}
