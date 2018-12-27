package com.company;

import org.graphstream.graph.implementations.SingleGraph;
import org.junit.jupiter.api.Test;
import org.graphstream.graph.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class myBinaryTreeTest {

    @Test
    void add() {
//        myBinaryTree myBinaryTree = new myBinaryTree();
//        myBinaryTree.add(6);
//        myBinaryTree.add(4);
//        myBinaryTree.add(8);
//        myBinaryTree.add(3);
//        myBinaryTree.add(5);
//        myBinaryTree.add(7);
//        myBinaryTree.add(599);
    }

    @Test
    void containsNode() throws IOException{
        myBinaryTree myBinaryTree = creatingBinaryTree();
        assertTrue(myBinaryTree.containsNode(8));

    }
// {array = (AnyType[]) [ new Comparable[DEFAULT_CAPACITY]  default is deafult cap
    @Test
    void deleteNode() throws IOException{

        myBinaryTree myBinaryTree = creatingBinaryTree();
        assertTrue(myBinaryTree.containsNode(9));
        myBinaryTree.deleteNode(9);
        assertFalse(myBinaryTree.containsNode(9));
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
    Graph graph = new SingleGraph("myBinarTreeTest");
        graph.display();
        return myBinaryTree;

    }
    @Test
    void traverseinOrderDepth() throws IOException {
        myBinaryTree myBinaryTree = creatingBinaryTree();
      //  myBinaryTree.traverseinOrderDepth( );
        myBinaryTree.traverseinOrderDepth(myBinaryTree.root);
    }
@Test
    void traversePreOrderedDepth() throws IOException{
        myBinaryTree myBinaryTree =creatingBinaryTree();
        myBinaryTree.traversePreOrderedDepth(myBinaryTree.root);
}
@Test
    void traversPostOrderDepth() throws IOException{
        myBinaryTree myBinaryTree = creatingBinaryTree();
        myBinaryTree.traversPostOrderDepth(myBinaryTree.root);
}
 @Test
    void traverseLevelOrderBreadth() throws IOException{
        myBinaryTree myBinaryTree = creatingBinaryTree();
        myBinaryTree.traverseLevelOrderBreadth();
 }
}
