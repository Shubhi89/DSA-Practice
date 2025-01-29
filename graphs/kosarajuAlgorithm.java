package graphs;
import java.util.*;
public class kosarajuAlgorithm {
    static class Edge {
        int src;
        int dest;

        public Edge(int s , int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge> graph[] ,int curr , boolean visited[] , Stack<Integer> s) {
        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                topSort(graph, e.dest, visited, s);
            }
        }
        s.push(curr);
    }

    public static void DFS(ArrayList<Edge> graph[] , int curr , boolean visited[]) {
        visited[curr] = true;
        System.out.print(curr+" ");

        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                DFS(graph, e.dest, visited);
            }
        }

    }

    public static void kosaraju(ArrayList<Edge> graph[] , int V) { //O(V+E)
        // step 1
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++) {
            if(!visited[i]) {
                topSort(graph, i, visited, s);
            }
        }

        // step 2
        @SuppressWarnings("unchecked")
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i=0;i<graph.length;i++) {
            visited[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for(int i=0;i<V;i++) {
            for(int j=0;j<graph[i].size();j++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src)); // reverse edges
            }
        }

        // step 3
        while(!s.isEmpty()) {
            int curr = s.pop();
            if(!visited[curr]) {
                System.out.print("SCC = ");
                DFS(transpose, curr, visited);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        kosaraju(graph, V);
    }
}
