package clase0;
import java.util.Stack;

public class Checker {

	public boolean isCorrect(String text) {

		Stack<Character> queueLifo = new Stack<Character>();
		boolean isCorrect = true;
		int i = 0;

		while ((i < text.length()) && isCorrect) {

			if (text.charAt(i) == '(' || text.charAt(i) == '[' || text.charAt(i) == '{') {
				queueLifo.push(text.charAt(i));
			} else if (text.charAt(i) == ')' && !queueLifo.isEmpty()) {

				if (queueLifo.peek() == '(') {
					
				} else {
					isCorrect = false;
				}
			} else if (text.charAt(i) == ']' && !queueLifo.isEmpty()) {

				if (queueLifo.peek() == '[') {
				
				} else {
					isCorrect = false;
				}

			} else if (text.charAt(i) == '}' && !queueLifo.isEmpty()) {

				if (queueLifo.peek() == '{') {
				
				} else {
					isCorrect = false;
				}
			}else if(queueLifo.isEmpty()){
				isCorrect = false;
			}

			i++;
		}

		return isCorrect;
	}

}
