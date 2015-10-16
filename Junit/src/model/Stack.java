package model;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> element = new ArrayList<T>();

    public boolean isEmpty(){
        return element.isEmpty();
    }

    public void push(T t) {
        element.add(t);
    }

    public T pop() {
        if (isEmpty())
            throw new UnsupportedOperationException("cannot pop empty stack");
      
        return  element.remove(element.size()-1);
    }

    public T top() {
        if (isEmpty())
            throw new UnsupportedOperationException("cannot top empty stack");
        return element.get(element.size()-1);
    }

}
