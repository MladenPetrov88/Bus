import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pasaggersStart = Integer.parseInt(scanner.nextLine());
        int busStops = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= busStops ; i++) {
            int passagersLeft = Integer.parseInt(scanner.nextLine());
            int passagersUp = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                pasaggersStart = pasaggersStart - passagersLeft + passagersUp - 2;
            } else {
                pasaggersStart = pasaggersStart - passagersLeft + passagersUp + 2;
            }

        }
        System.out.printf("The final number of passengers is : %d", pasaggersStart);
    }
}
