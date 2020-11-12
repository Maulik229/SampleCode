import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph1{
    int vertex;
    ArrayList<ArrayList<Integer>> graph;
    Graph1(){};
    Graph1(int vertex){
        this.vertex = vertex;
        this.graph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<vertex; i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int source, int dest){
        graph.get(source).add(dest);
        graph.get(dest).add(source);

    }

    void printGraph(){
        for (int i = 0; i< vertex; i++){
            System.out.print("Node: "+i);
            for (int x: graph.get(i)){
                System.out.print(" -> " + x);
            }
            System.out.println();
        }
    }

    void dfsUtil(int node, boolean[] visited){
        visited[node] = true;
        System.out.print(node +" ");

        for(int i: graph.get(node)){
            if(!visited[i]){
                dfsUtil(i,visited);
            }
        }
    }

    void DFS(int start){
        boolean[] visited = new boolean[vertex];
        System.out.println("DFS Traversal for node: " + 4);
        dfsUtil(start,visited);
        System.out.println();
    }

    void BFS(int start){
        boolean[] visited = new boolean[vertex];
        Queue<Integer> q = new LinkedList<>();
        System.out.println("BFS Traversal for node: " + start);
        q.add(start);
        visited[start]= true;

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node + " ");
            for(int i: graph.get(node)){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }

    }
}
public class Graph {
    public static void main(String[] args) {
        Graph1 g = new Graph1(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(3,4);

        g.printGraph();
        g.DFS(4);
        g.BFS(0);
    }
}
