
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = {
                { 1 },
                { 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4, 4 }
        };
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        // i row, j column
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                string.append(array[i][j]);
            }
            string.append("\n");
        }
        return string.toString();
    }

}
