package statepattern;

public class StatePattern {

    public static void main(String[] args) {
        Order order = new Order();
        order.getCurrentStateMessage();
        
        Shipping shippingState = new Shipping();
        order.setState(shippingState);
        order.getCurrentStateMessage();
        
        Packaging packagingState = new Packaging();
        order.setState(packagingState);
        order.getCurrentStateMessage();
      
    }
    
}
