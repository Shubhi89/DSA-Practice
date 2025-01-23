package graphs;

import java.util.*;

public class connectedComponents {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -> vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 -> vertex
        graph[4].add(new Edge(4, 2, 2));
    }

    public static void BFS(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++) {
            if(!visited[i]) {
                BFSutil(graph, visited);
            }
        }
    }

    public static void BFSutil(ArrayList<Edge>[] graph , boolean visited[]) { // O(V+E)
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0); // source = 0

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++) {
            DFSutil(graph, i, visited);
        }
    }

    public static void DFSutil(ArrayList<Edge>[] graph , int curr , boolean visited[]) { //O(V+E) v = vertex , e = edges
        System.out.print(curr+" ");
        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                DFSutil(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        /*
         * (5)
         * 0 ----------- 1
         * / \
         * (1) / \ (3)
         * / \
         * 2 ----- 3
         * | (1)
         * |
         * (2) |
         * |
         * 4
         */

        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
    }
}
