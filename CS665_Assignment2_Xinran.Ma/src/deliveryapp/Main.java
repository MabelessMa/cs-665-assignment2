package deliveryapp;

public class Main {

	public static void main(String[] args) {
		// Create a shop
		Shop shop = new Shop("Trader Joe's");
		
		//Create a deliver notification system
		DeliveryNotificationSystem system = new DeliveryNotificationSystem();
		
		//Create five drivers and register on the system
		Driver driver1 = new Driver("Driver 1");
		Driver driver2 = new Driver("Driver 2");
		Driver driver3 = new Driver("Driver 3");
		Driver driver4 = new Driver("Driver 4");
		Driver driver5 = new Driver("Driver 5");
		
		system.registerDriver(driver5);
		system.registerDriver(driver4);
		system.registerDriver(driver3);
		system.registerDriver(driver2);
		system.registerDriver(driver1);
		
		// Shop creates a deliver request
		DeliveryRequest request = shop.createDeliveryRequest("Orange Juice", "850 Commonwealth Avenue");
		
		//Broadcast the request to all drivers
		system.broadcastRequest(request);
	}

}
