package graphs;
import java.util.*;
public class cycleDetection { // for undirected graph
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -> vertex
        graph[0].add(new Edge(0, 1));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

        // 4 -> vertex
        graph[4].add(new Edge(4, 2));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++) {
            if(!visited[i]) {
                if(detectCycleUtil(graph , visited, i , -1)) {
                    return true;
                }            
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph , boolean visited[] , int curr , int par) {
        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            // case 3
            if(!visited[e.dest]) {
                if(detectCycleUtil(graph , visited , e.dest , curr)) {
                    return true;
                }
               
            }
            // case 1
            else if(visited[e.dest] && e.dest != par) {
                return true;
            }
            // case 2 do nothing 
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

        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
