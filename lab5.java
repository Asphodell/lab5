import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class lab5 {
    public static void main(String[] arg) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество элементов в массиве:");
            int n = sc.nextInt();
            System.out.println("Введите Х:");
            int X = sc.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.println("Введите " + (i + 1) + "-й" + " элемент массива");
                A.add(sc.nextInt());
            }
            sc.close();
            System.out.println("Оригинальное состояние массива: " + A);
            for (int j = 0; j < A.size(); j++) {
                for (int l = 0; l < A.size() - j; l++) {
                    if (A.get(l) == X) A.remove(A.get(l));
                }
            }
            System.out.println("Итоговое состояние массива: " + A);
            }
        catch(InputMismatchException e){
                System.out.println("Error");
            }
        }
    }