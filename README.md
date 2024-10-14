# cs-665-assignment2
# github link
https://github.com/MabelessMa/cs-665-assignment2/tree/main
# implementation description
## overview:
The project is a delivery notification system where a collection of retailers collaborates with freelance drivers (van, taxi, scooter) to deliver products to customers. The system follows the Observer Design Pattern, where drivers (observers) get notified of delivery requests (subject) in real-time.
## key components:
Shop (Subject/Observable):
Represents the retailer or shop that creates delivery requests.
It maintains a list of registered drivers (observers) who are notified whenever a new delivery request is generated.
Key methods:
registerDriver(Driver driver): Registers a driver to receive notifications.
removeDriver(Driver driver): Removes a driver from the notification list.
notifyDrivers(DeliveryRequest request): Notifies all registered drivers about the new delivery request.
createDeliveryRequest(String product, String destination): Creates a new delivery request and triggers the notification process.

Driver (Observer):
Represents a freelance driver who receives delivery requests from the shop.
Implements the update(DeliveryRequest request) method, which is triggered when a shop generates a delivery request.
Each driver is notified individually with details about the delivery, such as the product and destination.

DeliveryRequest:
This class encapsulates the delivery details including:
The shop that generated the request.
The product to be delivered.
The destination where the product needs to be delivered.
The request object is passed to each driver when a notification is broadcast.

# Maven
Add a dependency to junit:junit in test scope. (Note: 4.13 is the latest stable version as of the latest edit on this page.)
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13</version>
  <scope>test</scope>
</dependency>
