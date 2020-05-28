package com.paro.Structural_Patterns.DecoratorPattern.Type1;

public class AbstractDecorator extends Component{
    protected Component component;
    public void setComponent(Component c){
        component=c;
    }
    @Override
    public void makeHouse() {
        if(component!=null) {
            component.makeHouse();
        }
    }
}
