/*
Создайте и заполните массив случайными числами и выведете
максимальное, минимальное и среднее значение.
 */
public class Main2 {
    public static void main(String[] args) {

        int n = 100;
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }

        double min = arr[0];
        double max = arr[0];
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
            avg += arr[i] / arr.length;

        }
        System.out.println("max= " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
