/*
Problem: Min Stack
Platform: LeetCode
Level:Easy
Approach: Stack 
Time Complexity: O(1)

*/
class MinStack {
    Stack<Integer> main=new Stack<>();
    Stack<Integer> min=new Stack<>();
      public void push(int value) {
        main.add(value);
        if(min.size()==0){
            min.add(value);
        }
        else{
            if(min.peek()>=value){
                min.add(value);
            }
        }
    }
    
    public void pop() {
        if(main.size()==0 && min.size()==0){
            return;
        }
        int  removed=main.pop();
        if(removed==min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
