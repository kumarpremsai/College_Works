public class HAQuestion04{
public static double[][] addMatrix(double[][] a, double[][] b) {
    // Check if the two matrices have the same dimensions.
    if (a.length != b.length || a[0].length != b[0].length) {
      throw new IllegalArgumentException("The two matrices must have the same dimensions.");
    }
  
    // Create a new matrix to store the sum of the two matrices.
    double[][] sum = new double[a.length][a[0].length];
  
    // Add the corresponding elements of the two matrices.
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        sum[i][j] = a[i][j] + b[i][j];
      }
    }
  
    // Return the sum of the two matrices.
    return sum;
  }
  public static void main(String[] args) {
    double[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    double[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    double[][] c = addMatrix(a, b);
    System.out.println(addMatrix(a, b));
    }
}
  