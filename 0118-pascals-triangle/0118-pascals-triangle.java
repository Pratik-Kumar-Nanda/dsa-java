class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> pascal_triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pascal_triangle.get(i - 1).get(j - 1) + pascal_triangle.get(i - 1).get(j));
                }
            }

            pascal_triangle.add(row);
        }

        return pascal_triangle;
    }
}