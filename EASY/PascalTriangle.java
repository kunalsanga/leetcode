<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Handle case where numRows is zero
        if (numRows == 0) {
            return triangle;
        }

        // Add the first row with a single element [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Generate rows of Pascal's triangle
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // First element of the row is always 1
            row.add(1);

            // Compute the inner elements of the row
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of the row is always 1
            row.add(1);

            // Add the row to the triangle
            triangle.add(row);
        }

        return triangle;
    }
}

public class PascalTriangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(5);
        System.out.println(result);
    }
}
=======
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Handle case where numRows is zero
        if (numRows == 0) {
            return triangle;
        }

        // Add the first row with a single element [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Generate rows of Pascal's triangle
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // First element of the row is always 1
            row.add(1);

            // Compute the inner elements of the row
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of the row is always 1
            row.add(1);

            // Add the row to the triangle
            triangle.add(row);
        }

        return triangle;
    }
}

public class PascalTriangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(5);
        System.out.println(result);
    }
}
>>>>>>> 58624c13722277a53cfae4fcd995ede343182a21
