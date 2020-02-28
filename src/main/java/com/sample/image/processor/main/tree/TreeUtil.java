package com.sample.image.processor.main.tree;

public class TreeUtil {

	public static int height(BNode node) {
		/* base case tree is empty */
		if (node == null)
			return 0;

		/*
		 * If tree is not empty then height = 1 + max of left height and right heights
		 */
		return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
	}

	public static void traverseNodes(StringBuilder sb, String padding, String pointer, BNode node, boolean hasRightSibling) {
		if (node != null) {
			sb.append("\n");
			sb.append(padding);
			sb.append(pointer);
			sb.append(node.getValue());

			StringBuilder paddingBuilder = new StringBuilder(padding);
			if (hasRightSibling) {
				paddingBuilder.append("│  ");
			} else {
				paddingBuilder.append("   ");
			}

			String paddingForBoth = paddingBuilder.toString();
			String pointerRight = "└──";
			String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

			traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
			traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);
		}
	}
	
	public static String traversePreOrder(BNode root) {
		 
	    if (root == null) {
	        return "";
	    }
	 
	    StringBuilder sb = new StringBuilder();
	    sb.append(root.getValue());
	 
	    String pointerRight = "└──";
	    String pointerLeft = (root.getRight() != null) ? "├──" : "└──";
	 
	    traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
	    traverseNodes(sb, "", pointerRight, root.getRight(), false);
	 
	    return sb.toString();
	}

}
