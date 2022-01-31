package HackerRank;

import java.util.LinkedList;

public class QueStack {
    LinkedList myStack;
    LinkedList myQueue;

    QueStack(){
        myStack = new LinkedList();
        myQueue = new LinkedList();
    }
    void push(char a){
    	myStack.add(a);
    }
    void enqueue(char a){
    		myQueue.add(a);
    }

    char popCharacter() {
    	return (char)myStack.removeLast();
    }

    char dequeueCharacter(){
        return (char)myQueue.removeFirst();
    }
}
