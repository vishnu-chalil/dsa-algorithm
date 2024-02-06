package com.learn.datastructures.stack;

class ManualLinkedList {

    int head;
    int min;
    ManualLinkedList tail;

}

class MinStack {

    int minVal = Integer.MAX_VALUE;
    private ManualLinkedList stack = null;

    public MinStack() {
    }

    public void push(int val) {
        if (stack == null) {
            this.stack = new ManualLinkedList();
            stack.head = val;
            stack.min = val;

        } else {
            ManualLinkedList head = new ManualLinkedList();
            head.head = val;
            if (stack.min < val) {
                head.min = stack.min;
            } else {
                head.min = val;

            }
            head.tail = stack;
            stack = head;
        }

    }

    public void pop() {
        if(stack != null){
            if(stack.tail == null){
                stack = null;
            }
            else{
                stack = stack.tail;
            }
        }
    }

    public int top() {
        return stack.head;
    }

    public int getMin() {
        return stack.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */