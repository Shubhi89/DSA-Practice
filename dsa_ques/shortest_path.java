package dsa_ques;

public class shortest_path {
    public static float short_path(String str) {
        int x = 0, y=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == 'N') {
                y++;
            } else if(str.charAt(i) == 'S') {
                y--;
            } else if(str.charAt(i) == 'E') {
                x++; 
            } else {
                x--;
            }
        }
        int ans = x*x + y*y;
        return (float)Math.sqrt(ans);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(short_path(path));
    }
}
