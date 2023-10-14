import java.util.*;
public class pattern{

// Function to move all 'x' in the end
static void moveAtEnd(String s, int i, int l)
{
	if (i >= l)
		return;

	// Store current character
	char curr = s.charAt(i);

	// Check if current character is not 'x'
	if (curr != 'x')
		System.out.print(curr);

	// recursive function call
	moveAtEnd(s, i + 1, l);

	// Check if current character is 'x'
	if (curr == 'x')
		System.out.print(curr);

	return;
}

// Driver code
public static void main(String args[])
{
	String s = "geekxsforgexxeksxx";

	int l = s.length();

	moveAtEnd(s, 0, l);
}
}

// This code is contributed by Code_Mech
