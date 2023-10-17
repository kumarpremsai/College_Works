public class Q3 {
    public static void rotate(int[] arr, int k) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[(i + k) % arr.length] = arr[i];
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        rotate(arr, k);
        
        System.out.println("\nRotated Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
