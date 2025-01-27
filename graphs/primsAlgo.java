package graphs;
import java.util.*;
public class primsAlgo {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s , int d , int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int V;
        int cost;

        public Pair(int v , int c) {
            this.V = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalCost = 0; // MST Cost

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!visited[curr.V]) {
                visited[curr.V] = true;
                finalCost += curr.cost;

                for(int i=0;i<graph[curr.V].size();i++) {
                    Edge e = graph[curr.V].get(i);
                    pq.add(new Pair(e.dest, e.weight));
                }
            }
        }
        System.out.println("final cost = "+ finalCost);
    }
    public static void main(String[] args) {
        int vertex = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);

        prims(graph);
    }
}
