package homework;
public class avg_three {
    public static float avg(int a , int b , int c) {
        float avg = (float)(a+b+c)/3;
        return avg;
    }
    public static void main(String args[]) {
       float avg = avg(3,7,6);
       System.out.println(avg);
    }
}
