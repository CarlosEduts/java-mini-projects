package error_handling.multi_catch;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[7];
            System.out.println(numbers[10]); // Erro ...: ArrayIndexOutOfBounds
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro ...: " + e.getMessage());
        }
    }
}
