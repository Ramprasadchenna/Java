package sample;
import java.util.Enumeration;
import java.util.Stack;
public class Stackdemo {

	public static void main(String[] args) {
	Stack s=new Stack();
	s.push("patcummins");
	s.push("Rohit Sharma");
	s.push("Sachin");
	s.push("Ramprasad");
	s.push("Bumrah");
	System.out.println("stack elements"+s);
	System.out.println("First element:"+s.peek());
	System.out.println("stack elements:"+s);
	System.out.println("PoppingOut:"+s.pop());
	System.out.println("stack elements:"+s);
	s.push("java");
	System.out.println("after adding:"+s);
	System.out.println("PoppingOut:"+s.pop());
	System.out.println("stack elements"+s);
	System.out.println("First element:"+s.peek());
	Enumeration e=s.elements();
	System.out.println("elements are:");
	while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
	}
	}
}

