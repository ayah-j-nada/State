package statepattern;

class Packaging implements OrderState{
    
    @Override
    public void getStateMessage(Order order){
    System.out.println("The order is in Packaging state");
    } 
}
