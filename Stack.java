import java.util.ArrayList;

//H - type of elements in the stack
//H - String, Integer, etc.
public class Stack<H>{
    private ArrayList<H> stack;
    //main methods: push,pop, peek, isEmpty, size

    public Stack(){
        stack = new ArrayList<H>();
        // can also do this: stack = new ArrayList<>();
    }

    public void push (H item){
        stack.add(item);
    }
    
    public H pop(){
        if(isEmpty()){
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public H peek(){
        if(isEmpty()){
            return null;
        }
        //starts at 0
        return stack.get(stack.size() -1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }
}
