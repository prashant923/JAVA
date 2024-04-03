public class tiles {
    public static void main(String[] args) {
        int N = 5;
        int ans = ways(N);
        System.out.println(ans);
    }

    public static int ways(int N) {
        if (N <= 3) {
            return 1;
        } else {
            // Number of ways when placing a tile vertically + number of ways when placing a tile horizontally
            return ways(N - 1) + ways(N - 4);
        }
    }
}
