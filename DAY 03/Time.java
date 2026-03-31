import java.util.Arrays;

class Time{
    public static void main(String[] args){
        long start_time = System.nanoTime();
        int n = 100000, sum = 0;

        for(int i = 1; i < n; i++){
            sum += i;
        }

        long end_time = System.nanoTime();
        System.out.println("Time: " + (end_time - start_time) + "ns");
    }
}