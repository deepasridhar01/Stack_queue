import java.util.Stack;
public class StackExample {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		boolean result = animals.empty();
		System.out.println("empty:"+result);
	    animals.push("Wolf");
		animals.push("Tiger");
		animals.push("Elephant");
		animals.push("Lion");
		System.out.println("stack:" +animals);
		animals.pop();
		System.out.println("Stack after pop:" + animals);
        String wildanimals = animals.peek();
		System.out.println("Element at top:"+wildanimals);
		int location = animals.search("Elephant");
		System.out.println("location:"+location);
		result= animals.empty();
		System.out.println("empty:"+result    );
	}

}
