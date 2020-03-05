import java.util.*;

class Solution{

	public static void main(String []argh){
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();

			//static method call method call
			System.out.println(isBalanced(input));

		}
	}
public static boolean isBalanced(String inputString) {

	if(inputString.length() == 0){
		return true;
	}

	if(inputString.length() % 2 != 0){
		return false;
	}

	int mid = inputString.length() / 2;

	//Check the [A] and [B] match
	for (int j=0; j <= mid; j++){
		for (int k = inputString.length() - 1; k > 0; k--){
			if(inputString.charAt(j) == inputString.charAt(k)){
					return true;

			}
		}
	}
	//reached the end of the processing, string must not be a match
	return false;
}
}
