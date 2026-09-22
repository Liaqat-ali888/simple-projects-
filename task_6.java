

class Node{
	String url;
	Node next;
	Node (String url){
		this.url = url;
		this.next = null;
	}
}
class Stack{
  Node top;
  Stack(){
  	this.top = null;
  }

  void push(String url){
  Node newurl = new Node (url);
  newurl.next = top;
  top = newurl;

  	}

String pop(){
	if(isEmpty()){
		return null;
	}
	String url = top.url;
	top = top.next;
	return url;
} 
boolean isEmpty(){
	return top == null;
}
void display(){
	if(isEmpty()){
		System.out.println("[ ]");
		return;
	}
	Node tem = top;
	while(tem!=null){
		System.out.print( tem.url+" ");
		tem = tem.next;
	}
	System.out.println();
}}
class Browser{
	Stack backStack;
	Stack forwardStack;
	String current ;
	Browser(){
		backStack = new Stack();
		forwardStack = new Stack();
		current = "Home";

	}
	void visitPage(String url){
		backStack.push(current);
		current = url;
		while(!forwardStack.isEmpty()){
			forwardStack.pop();
		} 
		System.out.println("visited " + current);
	}
void goBack(){
	if(backStack.isEmpty()){
		System.out.println("no page");
		return;
	}
	forwardStack.push(current);
	current = backStack.pop();
	System.out.println("Back " + current);
}

void goForward(){
	if(forwardStack.isEmpty()){
		System.out.println("no page");
		return;
	}
	backStack.push(current);
	current =forwardStack.pop();
	System.out.println("\n"+current);
}
void currrentPage(){
	System.out.println(("current "+ current));
}
// void displayHistory() {
//  System.out.print("Back Stack: ["); 
//  displayStack(backStack());
//   System.out.println();
//    System.out.println("Current Page: " + current);
//     System.out.print("Forward Stack: [");
//      displayStack(forwardStack());
//       System.out.println();
//        }


}

class Main { 
	public static void main(String[] args) { 
    Browser browser = new Browser();
 System.out.println("===== BROWSER HISTORY ====="); 
 System.out.println("\nInitial State:"); 
// browser.displayHistory(); 
 browser.visitPage("Google"); 
  browser.visitPage("YouTube");
    browser.visitPage("GitHub");
   browser.goBack(); 
  browser.goBack(); 
  System.out.println("fprward");
  browser.goForward(); 
browser.visitPage("Facebook");
 }
}