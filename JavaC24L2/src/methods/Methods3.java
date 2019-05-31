package methods;

public class Methods3 {

    public static void main(String[] args) {
        long[] grades={10, 20,30};
        long length = arraysLength(grades);
        System.out.println(length);

        System.out.println(sumOfArray(grades));

        long avg = sumOfArray(grades) / arraysLength(grades);

    }

    public static long arraysLength(long[] grades){
        return grades.length;
    }

    public static long sumOfArray(long[] grades) {
        long sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        return sum;
    }
}
