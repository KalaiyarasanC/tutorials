public class arraysum {
    public static void main(String[] args) {
        int[] array={1,2,3,4,10,11};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
