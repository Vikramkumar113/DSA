public class ThreadExample {
    private static boolean[] flag = new boolean[2];
    private static int turn = 0;

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            while (true) {
                flag[0] = true;
                turn = 1;
                while (flag[1] && turn == 1) {
                    // Wait
                }
                // Critical Section
                System.out.println("Hello");
                flag[0] = false;
            }
        });

        Thread threadB = new Thread(() -> {
            while (true) {
                flag[1] = true;
                turn = 0;
                while (flag[0] && turn == 0) {
                    // Wait
                }
                // Critical Section
                System.out.println("World");
                flag[1] = false;
            }
        });

        threadA.start();
        threadB.start();
    }
}

