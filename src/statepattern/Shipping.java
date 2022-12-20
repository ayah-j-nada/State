package statepattern;

class Shipping implements OrderState {
    
    @Override
    public void getStateMessage(Order order){
    System.out.println("The order is in Shipping state");
    } 
}
