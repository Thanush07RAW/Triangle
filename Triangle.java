public class Triangle {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}