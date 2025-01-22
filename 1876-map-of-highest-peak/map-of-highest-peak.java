class Solution {
    public int[][] highestPeak(int[][] wat) {
        if (wat.length == 0 || wat[0].length == 0) {
            return wat;
        }

        int m = wat.length, n = wat[0].length;
        var res = new int[m][n];
        var maxRange = m * n;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (wat[i][j] == 1) {
                    res[i][j] = 0;
                } else {
                    var left = j > 0 ? res[i][j - 1] : maxRange;
                    var up = i > 0 ? res[i - 1][j] : maxRange;
                    res[i][j] = Math.min(left, up) + 1;
                }
            }
        }

        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                if (wat[i][j] == 1) {
                    res[i][j] = 0;
                } else {
                    var right = (j < n - 1) ? res[i][j + 1] : maxRange;
                    var down = (i < m - 1) ? res[i + 1][j] : maxRange;
                    res[i][j] = Math.min(Math.min(right, down) + 1, res[i][j]);
                }
            }
        }

        return res;
    }
}