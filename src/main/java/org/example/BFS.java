package org.example;

import java.util.*;

public class BFS {
    public static void main(String[] args) {

    }
    public static void bfsTraversal(Node startNode){
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println(current.value + " ");
            for (Node neighbor : current.neighbors) {
                if(!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    class Node {
        int value;
        List<Node> neighbors;
        Node(int value) {
            this.value = value;
            neighbors = new ArrayList<>();
        }
    }
}
