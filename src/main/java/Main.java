import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int firstName = scanner.nextInt();
            int lastName = scanner.nextInt();
            char c = scanner.next().charAt(0);
            for (int i = 0; i < 50; i++) {
                System.out.println();

            }
            System.out.println("Привет");

            if (c == '+') {

                int rez = firstName + lastName;
                System.out.println(rez);

            } else if (c == '-') {
                int rez = firstName - lastName;
                System.out.println(rez);

            } else {
                System.out.println("Не ");
            }
        } catch (Exception e){
            System.out.println("Ошибка");
        }
    }
}
