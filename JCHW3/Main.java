package JCHW3;
import JCHW3.Box.Apple;
import JCHW3.Box.Box;
import JCHW3.Box.Orange;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5};
        swap(arr1, 1, 2);
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Task#2");
        System.out.println("addFruit: ");
        or.addFruit(new Orange(), 8);
        or1.addFruit(new Orange(), 17);
        ap.addFruit(new Apple(), 12);
        ap1.addFruit(new Apple(), 6);
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());
        System.out.println("compare(): ");
        System.out.println("Box 1 equals box 3: " + or.compare(ap));
        System.out.println("Box 2 equals box 4: " + or1.compare(ap1));
        System.out.println("pourTo(): ");
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("getWeight(): ");
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());

    }

    public static void swap(Object[] arr, int n1, int n2) {
        System.out.println("Task1: " + Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
        System.out.println("The result of the replacement: " + Arrays.toString(arr) + "\n================================");
    }
}
