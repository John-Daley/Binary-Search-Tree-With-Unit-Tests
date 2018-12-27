package com.company;

import java.util.LinkedList;
import java.util.Queue;
import org.w3c.dom.Node;

public class myBinaryTree {
NodeMyClass root;

public void add(int value){
    root =addRecursive(root,value);
}
private NodeMyClass addRecursive(NodeMyClass current, int value){
    if(current ==null ){
        return new NodeMyClass(value);
    }
    if(value< current.value){
       // I added the casting of the nodeMyClass change this incase it doesnt work
        current.left =addRecursive((NodeMyClass) current.left,value);
    }else if(value>current.value){
        current.right = addRecursive((NodeMyClass) current.right, value);
    }else{
        // There is a already this value
        return current;
    }
    return current;
}
private boolean containsNodeRecursive(NodeMyClass current,int value){
    if(current==null){
        return false;
    }if(value ==current.value){
        return true;
    }return value < current.value
           // need to know what the? means and more about casting
            ? containsNodeRecursive((NodeMyClass) current.left, value)
            : containsNodeRecursive((NodeMyClass) current.right, value);
}
public boolean containsNode(int value){
    return containsNodeRecursive(root,value);
}
public void deleteNode(int value){
    root = deleteRecursive(root ,value);
}
private NodeMyClass deleteRecursive(NodeMyClass current, int value){
    if(current==null){
        return null;
    }
    if(value == current.value){
        //code for deleting a node will go here in the future
        // code for deleting without child
        if(current.left == null && current.right == null){
            return null;
        }
     // code for deleting with 1 child
        if(current.right == null){
            return (NodeMyClass)current.left;
        }
        if(current.left == null){
            return (NodeMyClass) current.right;
        }
        // code for deleteing more then one child
        int smallestValue = findSmallestValue((NodeMyClass) current.right);
        current.value =smallestValue;
        current.right = deleteRecursive((NodeMyClass) current.right, smallestValue);
        return current;
    }
    if(value< current.value){
        current.left = deleteRecursive((NodeMyClass) current.left , value);
        return current;
    }
    current.right = deleteRecursive((NodeMyClass) current.right, value);
    return current;
}
// there are three cases Node with no children, Node with one child, Node with 2 children
    //First case NO CHILDREN
private int findSmallestValue(NodeMyClass root){
    return root.left == null ? root.value : findSmallestValue(
            (NodeMyClass) root.left);
}
    public void traverseinOrderDepth(NodeMyClass nodeMyClass) {
        if (nodeMyClass != null) {
            traverseinOrderDepth((NodeMyClass) nodeMyClass.left);
            System.out.println(" " + nodeMyClass.value);
            traverseinOrderDepth((NodeMyClass) nodeMyClass.right);
        }
    }
public void traversePreOrderedDepth(NodeMyClass nodeMyClass) {
if(nodeMyClass != null){
    System.out.println(" " + nodeMyClass.value);
    traversePreOrderedDepth((NodeMyClass) nodeMyClass.left);
    traversePreOrderedDepth((NodeMyClass)nodeMyClass.right);
}
}
// left tree then right tree then root
public void traversPostOrderDepth(NodeMyClass nodeMyClass){
    if(nodeMyClass != null){
        traversPostOrderDepth((NodeMyClass) nodeMyClass.left);
        traversPostOrderDepth((NodeMyClass) nodeMyClass.right);
        System.out.println(" "+ nodeMyClass.value);
    }
}
public void traverseLevelOrderBreadth(){
    if(root == null){
        return;
    }
    Queue<NodeMyClass> nodeMyClassQueue = new LinkedList<>();
    ((LinkedList<NodeMyClass>) nodeMyClassQueue).add(root);

    while (!nodeMyClassQueue.isEmpty()){
        NodeMyClass nodeMyClass = nodeMyClassQueue.remove();
        System.out.println(" " + nodeMyClass.value + " Testing changing test ");
        if(nodeMyClass.left != null){
            ((LinkedList<NodeMyClass>) nodeMyClassQueue).add((NodeMyClass) nodeMyClass.left);
        }
        if(nodeMyClass.right !=null){
            ((LinkedList<NodeMyClass>) nodeMyClassQueue).add((NodeMyClass) nodeMyClass.right);
        }
    }
}
}


