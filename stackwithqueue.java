class Stack{
   int array[] = new int[5];
   int top; 
	Stack(){
this.top = -1;
}
	void push(int data){
		if(top == 4){
			System.out.print("stack full");
			return;
		}
     array[++top] = data;
	}
	int pop(){
     if(Empty()){
     	System.out.println("stack empty");
     	return -1;
     }
     return array[top--];
    
	}
	int top(){
  return array[top];
	}
	boolean Empty(){
 return top==-1;
	}
}
class StackUsingQueue{
	Stack s1 = new Stack();
	Stack s2 = new Stack();

	void enqueue(int data){
		while(!s1.Empty()){

		s2.push(s1.pop());

	}
    s1.push(data);
    while(!s2.Empty()){
    	s1.push(s2.pop());
    }
	}

	int dequeue(){
		int s = s1.pop();
		return s;
	}
	int top(){
		return s1.pop();
	}
	boolean Empty(){
		return s1.Empty();
	}
}
class main{
	public static void main(String arg[]){
		StackUsingQueue stack = new StackUsingQueue();
		stack.enqueue(23);
		stack.enqueue(24);
		stack.enqueue(25);
		stack.enqueue(26);
		stack.enqueue(27);
		stack.enqueue(27);
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
		System.out.println(stack.dequeue());
	System.out.println("top: "+stack.top());
	System.out.println("is Empty: "+stack.Empty());
	}
}