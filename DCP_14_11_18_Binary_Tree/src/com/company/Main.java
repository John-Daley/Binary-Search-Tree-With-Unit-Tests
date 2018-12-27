package com.company;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;
import org.w3c.dom.Node;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//
//    Given the root to a binary tree, implement serialize(root),
// which serializes the tree into a string, and deserialize(s),
// which deserializes the string back into the tree.
//
//    For example, given the following NodeMyClass class
//
//    class NodeMyClass:
//    def __init__(self, val, left=None, right=None):
//    self.val = val
//    self.left = left
//    self.right = right
//    The following test should pass:
//
//    node = NodeMyClass('root', NodeMyClass('left', NodeMyClass('left.left')), NodeMyClass('right'))
//            assert deserialize(serialize(node)).left.left.val == 'left.left'

    public static void main(String[] args) throws IOException {
	// write your code here

        Main myApp = new Main();
        System.out.println(" The" +
                " binary tree contains 6 4 8 3 5 7 9");
        System.out.println("Is the number 6 in the tree");
        myApp.creatingBinaryTree();
        Graph graph = new SingleGraph("myBinaryTree");
        Viewer viewer = graph.display(true);
        graph.display(true);
        if(
        myApp.creatingBinaryTree().containsNode(6)){
            System.out.println("It does! ");
        }
        myApp.creatingBinaryTree().deleteNode(5);
        System.out.println(" the number 5 node was deleted");

        if(
        myApp.creatingBinaryTree().containsNode(5)){
            System.out.println("Your methods dont work bitch ");
        }else{
            System.out.println("Its gone ted ");
        }
    }
private myBinaryTree creatingBinaryTree() throws IOException {
    Path path = Paths.get("C:\\Users\\freeleeks\\IdeaProjects\\Seminar_1_Algorithms_DataStructures_1\\randomNumbers.txt");
    Scanner readTextFile = new Scanner(path);
    myBinaryTree myBinaryTree = new myBinaryTree();
    while(readTextFile.hasNextInt()){
        myBinaryTree.add(readTextFile.nextInt());
    }
    //myBinaryTree myBinaryTree = new myBinaryTree();
//        myBinaryTree.add(6);
//        myBinaryTree.add(4);
//        myBinaryTree.add(8);
//        myBinaryTree.add(3);
//        myBinaryTree.add(5);
//        myBinaryTree.add(7);
//        myBinaryTree.add(9);

    return myBinaryTree;


        /*     myBinaryTree myBinaryTree = new myBinaryTree();
        myBinaryTree.add(6);
    myBinaryTree.add(4);
    myBinaryTree.add(8);
    myBinaryTree.add(3);
    myBinaryTree.add(5);
    myBinaryTree.add(7);
    myBinaryTree.add(9);
*/

    }
}
