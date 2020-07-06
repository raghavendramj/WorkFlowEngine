package WorkFlowEngine;

public abstract class Operation {

    private Operation next;

    public Operation(Operation next){
        this.next = next;
    }

    public abstract  boolean doOperate(int a, int b);

    protected void operate(int a, int b) {

        if(doOperate(a, b))
            return;

        if (next != null)
            next.operate(a, b);
    }
}
