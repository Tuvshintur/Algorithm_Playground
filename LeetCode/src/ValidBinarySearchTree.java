
public class ValidBinarySearchTree {

	public static void main(String[] args) {
		Node node = new Node(5);
		node.left = new Node(4);
		node.right = new Node(7);
		// 5
		// / \
		// 4 7
		System.out.print(validBSTHelper(node, Integer.MIN_VALUE, Integer.MAX_VALUE));

		node.right.left = new Node(2);
		// 5
		// / \
		// 4 7
		// /
		// 2
		System.out.print(validBSTHelper(node, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	public static boolean validBSTHelper(Node n, int lower, int higher) {
		if (n == null)
			return true;
		int value = n.val;
		if (value > lower && value < higher && validBSTHelper(n.left, lower, value)
				&& validBSTHelper(n.right, value, higher)) {
			return true;
		}
		return false;
	}
}

class Node {
	int val;
	Node left, right;

	Node(int val) {
		this.val = val;
	}
}