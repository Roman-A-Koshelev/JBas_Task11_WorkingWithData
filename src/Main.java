import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое целое число:    ");
        String str_num_1 = in.nextLine();
        int num_1 = Integer.parseInt(str_num_1);

        System.out.print("Введите второе целое число:    ");
        int num_2 = in.nextInt();

        int max = Math.max(num_1, num_2);
        System.out.println("Наибольшее из введённых чисел: " + max);

        double min = Math.min(num_1, num_2);
        System.out.println("Наименьшее из введённых чисел: " + min);
    }
}