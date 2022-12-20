package statepattern;

class Order {
 
    OrderState state = new Packaging();
    public void Order(){}
    
    public void setState(OrderState state){
    this.state = state;
    }
    
    public void getCurrentStateMessage(){
    state.getStateMessage(this);
    }
    
}
