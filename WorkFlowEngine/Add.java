package WorkFlowEngine;

public class Add extends Operation{
    public Add(Operation operation){
        super(operation);
    }

    public boolean doOperate(int a, int b){
        System.out.println(" Addition result of  (a + b) => ("+a+" + "+b+") is: "+ (a+b));
        return false;
    }
}
