package edu.ithaca.dragon.datastructures.tree;

public class BTNodeUtil{

    /**
     * @return the total count of all nodes connected to root (including root)  
     */
    public static <T> int nodeCount(BTNode<T> root){
        throw new RuntimeException("Not implemented");
    }

    /**
     * @return true if itemToFind is in any node connected to root, false otherwise 
     */
    public static <T> boolean contains(BTNode<T> root, T itemToFind){
        throw new RuntimeException("Not implemented");
    }

    /**
     * makes a string with the root, then the subtree left of root, then the subtree right of root
     */
    public static <T> String preOrderString(BTNode<T> root){
        //already implemented for you
        if (root == null){
            return "";
        }
        else {
            return root.getItem().toString() + ", " + preOrderString(root.getLeft()) + preOrderString(root.getRight()); 
        }
    }

    /**
     * makes a string with the subtree left of root, the subtree right of root, then root
     */
    public static <T> String postOrderString(BTNode<T> root){
        throw new RuntimeException("Not implemented");
    }

    /**
     * makes a string with the the subtree left of root, then root, then the subtree right of root
     */
    public static <T> String inOrderString(BTNode<T> root){
        throw new RuntimeException("Not implemented");
    }

    /**
     * @return the height of the given tree as an int
     * height is counted as the longest single chain of edges between the root and any ancestor
     * the height of a tree with a single node is then 0 (no edges)
     * the hieght of an empty tree (no nodes) is -1  
     */
    public static <T> int height(BTNode<T> root){
        throw new RuntimeException("Not implemented");
    }

    
}
