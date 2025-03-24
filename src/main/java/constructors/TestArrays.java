package constructors;

public class TestArrays {
    public static void main(String[] args) {
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        for (int[] target : targets) {
            System.out.println("Координаты: " + target[0] + ", " + target[1]);
        }
    }
}
