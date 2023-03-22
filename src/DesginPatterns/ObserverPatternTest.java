/*
 * A list of observers is maintained with delivery boy to update location to observers .
*/
package DesginPatterns;

import java.util.ArrayList;
import java.util.List;

//ignore subject ..of no use..
interface Subject {
  void register(Observer obj);
  void unregister(Observer obj);
  void notifyObservers();
}

class DeliveryBoy implements Subject {

  private List<Observer> observers;
  private String location;
  
  public DeliveryBoy() {
    this.observers = new ArrayList<>();
  }
  
  @Override
  public void register(Observer obj) {
    observers.add(obj);
  }

  @Override
  public void unregister(Observer obj) {
      observers.remove(obj);
  }

  @Override
  public void notifyObservers() {
    for(Observer obj : observers) {
      obj.update(location);
    }
  }

  public void locationChanged(String newLocation) {
    this.location = newLocation;
    notifyObservers();
  }
  
}


interface Observer {
  public void update(String location);
}

//
//class Seller implements Observer {
//  private String location;
//  
//  @Override
//  public void update(String location) {
//    this.location = location;
//    showLocation();
//  }
//
//  public void showLocation() {
//    System.out.println("Notification at Seller - Current Location: " + location);
//  }
//}

class User implements Observer {
  private String location;
  
  @Override
  public void update(String location) {
    this.location = location;
    showLocation();
  }

  public void showLocation() {
    System.out.println("Notification at User - Current Location: " + location);
  }
}
//
//class DeliveryWarehouseCenter implements Observer {
//  private String location;
//  
//  @Override
//  public void update(String location) {
//    this.location = location;
//    showLocation();
//  }
//
//  public void showLocation() {
//    System.out.println("Notification at Warehouse - Current Location: " + location);
//  }
//}

public class ObserverPatternTest {

  public static void main(String[] args) {
    DeliveryBoy deliveryBoy = new DeliveryBoy();
    
//    Observer obj1 = new Seller();
    Observer obj2 = new User();
//    Observer obj3 = new DeliveryWarehouseCenter();
    
//    DeliveryBoy.register(obj1);
    deliveryBoy.register(obj2);
//    DeliveryBoy.register(obj3);
    
    deliveryBoy.locationChanged("At Bazaar");
    
//    deliveryBoy.unregister(obj3);
    
    System.out.println();
    deliveryBoy.locationChanged("At home");
    
  }
}