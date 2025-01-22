package graphs;
import java.util.*;
public class create {
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

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -> vertex
        graph[0].add(new Edge(0,1,5));

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

    public static void BFS(ArrayList<Edge>[] graph) { // O(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean visted[] = new boolean[graph.length];

        q.add(0); // source = 0

        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!visted[curr]) {
                System.out.print(curr+" ");
                visted[curr] = true;

                for(int i=0;i<graph[curr].size();i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph , int curr , boolean visited[]) { //O(V+E) v = vertex , e = edges
        System.out.print(curr+" ");
        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                DFS(graph, e.dest, visited);
            }
        }
    }

    // has path ques
    public static boolean hasPath(ArrayList<Edge>[] graph , int src , int dest , boolean visited[] ) {
        if(src == dest) {
            return true;
        }

        visited[src] = true;
        for(int i=0;i<graph[src].size();i++) {
            Edge e = graph[src].get(i); // e.dest = neighbour
            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*
                      (5)
                0 ----------- 1
                             / \
                        (1) /   \ (3)
                           /     \
                          2 ----- 3  
                          |   (1)
                          |
                     (2)  |
                          |
                          4
         */

        
        // ex: 2's neighbors
        // for(int i=0;i<graph[2].size();i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }
        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);

        BFS(graph);
        System.out.println();
        DFS(graph, 0, new boolean[vertex]);
        System.out.println();
        System.out.println(hasPath(graph, 0, 4, new boolean[vertex]));
    }
}
