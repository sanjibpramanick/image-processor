package com.sample.image.processor.main.tree;

public class CodeRunner {

	public static void main(String[] args) {

		BTree bt = new BTree();

		bt.add(10);
		bt.add(20);
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);
		bt.add(6);
		
		System.out.println(TreeUtil.traversePreOrder(bt.getRoot()));
		
		System.out.println(TreeUtil.height(bt.getRoot()));
		
		BTreePrinter.printNode(bt.getRoot());
		
		TreeRotator.rotateRight(bt.getRoot());
		BTreePrinter.printNode(bt.getRoot());

	}

}
