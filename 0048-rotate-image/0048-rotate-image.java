class Solution {
    public void rotate(int[][] matrix) {
      int n = matrix.length;

        int SR = 0;
        int SC = 0;
        int ER = n - 1;
        int EC = n - 1;

        while (SR < ER && SC < EC) {

            for (int i = 0; i < EC - SC; i++) {

                int temp = matrix[SR][SC + i];

                // left -> top
                matrix[SR][SC + i] = matrix[ER - i][SC];

                // bottom -> left
                matrix[ER - i][SC] = matrix[ER][EC - i];

                // right -> bottom
                matrix[ER][EC - i] = matrix[SR + i][EC];

                // top -> right
                matrix[SR + i][EC] = temp;
            }

            SR++;
            SC++;
            ER--;
            EC--;
        }

       
    }
}