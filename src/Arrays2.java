public class Arrays2 {
    public static void main(String[] args) {
        int[] arrays = new int[]{92, 12, 38, 74};
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println();
        for (int i = arrays.length -1; i >= 0; i--){
            System.out.println(arrays[i]);

        }
    }
}
