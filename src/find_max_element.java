import java.sql.SQLOutput;
import java.util.Scanner;

public class find_max_element {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Size shoud not exceed 20");
            }
        }
        while (size>20);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Enter element " + i+1 + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j <array.length ; j++) {
            if(array[j]>max){
                max = array[i];
                index = j+1;
        }
        }
        System.out.println("The largest property value in the list is " + max + " at the positon: "+ index);
    }
}
