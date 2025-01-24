package graphs;
import java.util.*;
public class dijkstrasAlgo {
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
        int node;
        int path;

        public Pair(int n , int p) {
            this.node = n;
            this.path = p;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // path based sorting in ascending order
        }
    }

    public static void dijkstras(ArrayList<Edge> graph[] , int src) { // O(V + ElogV)
        int dist[] = new int[graph.length];
        for(int i=0;i<graph.length;i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // without pq O(V^2)
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!visited[curr.node]) {
                visited[curr.node] = true;

                for(int i=0;i<graph[curr.node].size();i++) {
                    Edge e = graph[curr.node].get(i);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;

                    if(dist[u]+wt < dist[v]) { // update dist of src to v
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // print shortest paths
        for(int i=0;i<dist.length;i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int vertex = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);

        int src = 0;
        dijkstras(graph, src);
    }
}
