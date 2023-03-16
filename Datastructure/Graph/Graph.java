package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Graph {
int numberOfNodes=0;
HashMap<Integer,ArrayList<Integer>> adjacentlist=new HashMap();

public void addVertex(int node){
    adjacentlist.put(node, new ArrayList<>());
    numberOfNodes++;
}

public void addEdge(int node1,int node2){
    adjacentlist.get(node1).add(node2);
    adjacentlist.get(node2).add(node1);
}

public void showConnections(){
    adjacentlist.forEach((key,value)-> System.out.println( +key +"--->" +value));
}

    /* int numberOfNodes;
    Hashtable<Integer ,ArrayList<Integer>> adjacentlist=new Hashtable<>();

    public void addVertex(int node){
        adjacentlist.put(node, new ArrayList<>());
        numberOfNodes++;
    }

    public void addEdge(int node1,int node2 ){
        //for undirected graph  
      // System.out.println(adjacentlist.get(node1));
       adjacentlist.get(node1).add(node2);
       adjacentlist.get(node2).add(node1);
       
    }

    public void showConnections(){
        Object[] keys = adjacentlist.keySet().toArray();
       
        for(Object key: keys)
        System.out.println(key + "----->" +adjacentlist.get(Integer.parseInt(key.toString())));

       /*  for(Entry m:adjacentlist.entrySet()){
            System.out.println(m.getKey() + "====>" +m.getValue());
        } */
    

 
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(3, 1); 
        graph.addEdge(3, 4); 
        graph.addEdge(4, 2); 
        graph.addEdge(4, 5); 
        graph.addEdge(1, 2); 
        graph.addEdge(1, 0); 
        graph.addEdge(0, 2); 
        graph.addEdge(6, 5);
        graph.showConnections();
    }
   
    
}
