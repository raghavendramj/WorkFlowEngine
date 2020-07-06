package WorkFlowEngine;


public class Input extends Operation{
    public Input(Operation operation){
        super(operation);
    }

    public boolean doOperate(int a, int b){
        System.out.println(" Input from user is a :- "+a+" and b :-  "+b);
        return false;
    }
}
