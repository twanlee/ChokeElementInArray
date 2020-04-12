import java.util.Scanner;

public class ChokeElementInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Element on array: ");
        for (int x: array) {
            System.out.print(" " + x);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new value: ");
        int value = sc.nextInt();
        System.out.println("Enter index of value: ");
        int index = sc.nextInt();
        array[index] = value;
        int a = index+1;
        int b = array.length-1;
        while (a<b){
            array[b] = array[b-1];
            b--;
        }
        for (int y:array) {
            System.out.print(" " + y);
        }
    }
}
