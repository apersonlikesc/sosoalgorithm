import java.util.Stack;

public class solution155 {
    private Stack<Integer> stackdata;
    private Stack<Integer> stackMin;
    public solution155() {
        this.stackdata = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int x) {
        if(this.stackMin.isEmpty()){
            this.stackMin.push(x);
        }else if(x <= this.getMin())
        {
            this.stackMin.push(x);
        }
        this.stackdata.push(x);
    }

    public void pop() {
        if(this.stackdata.isEmpty())
        {
            throw new RuntimeException("1");
        }
        int value = this.stackdata.pop();
        if(value == this.getMin())
        {
            this.stackMin.pop();
        }
    }

    public int top() {
        if(this.stackdata.isEmpty())
        {
            throw new RuntimeException("2");
        }
        return this.stackdata.peek();
    }

    public int getMin() {
        if(this.stackMin.isEmpty())
        {
            throw new RuntimeException("3");
        }
        return this.stackMin.peek();
    }
}
