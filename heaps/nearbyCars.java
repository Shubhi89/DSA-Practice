package heaps;
import java.util.*;
public class nearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x , int y , int distSq , int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq; // ascending order
        }
    }
    public static void main(String[] args) {
        int points[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0;i<points.length;i++) {
            int distSq = (points[i][0] * points[i][0] ) + (points[i][1] * points[i][1]); //(x^2 + y^2)
            pq.add(new Point(points[i][0], points[i][1], distSq , i));
        }

        // nearest K cars
        for(int i=0;i<k;i++) {
            System.out.println("C"+pq.remove().idx);
        }
    }
}
