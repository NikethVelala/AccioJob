public class SolutionClass {

    public static int distSquare(int a1, int b1, int a2, int b2) {
        return (a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2);
    }

    static String isSquare(int a1, int b1, int a2, int b2, int a3, int b3, int a4, int b4) {
        int dist12 = distSquare(a1, b1, a2, b2);
        int dist13 = distSquare(a1, b1, a3, b3);
        int dist14 = distSquare(a1, b1, a4, b4);
        int maxDist = Math.max(Math.max(dist12, dist13), dist14);
        return (2 * maxDist == dist12 + dist13 + dist14) && (maxDist != 0) ? "Yes" : "No";
    }


    public static void main(String[] args) {
        System.out.println(isSquare(20, 10, 10, 20, 20, 20, 10, 10));
    }

}