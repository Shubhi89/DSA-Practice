package graphs;
import java.util.*;
public class topologicalSortingDFS { 
    static class Edge {
        int src;
        int dest;

        public Edge(int s , int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static void topSort(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<graph.length;i++) {
            if(!visited[i]) {
                topSortUtil(graph ,i, visited , s);
            }
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph ,int curr, boolean visited[] , Stack<Integer> s) {
        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                topSortUtil(graph, e.dest, visited, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int vertex = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        topSort(graph);
    }
}
