package com.fengchuiguo.StructurePattern.Composite.demo;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");

        System.out.println(tree.root.getName()+"-"+tree.root.getChildren().nextElement().getName()
                +"-"+tree.root.getChildren().nextElement().getChildren().nextElement().getName());
    }
}
