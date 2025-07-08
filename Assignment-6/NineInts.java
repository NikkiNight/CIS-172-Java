public class NineInts {
    public static void main (String args[]) {
        
        int[] numbers = {10, 15, 19, 23, 26, 29, 31, 34, 38};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }       
        
        for (int y = numbers.length - 1; y >= 0; y--) {
                System.out.print(numbers[y] + " ");
        }
    }
}
