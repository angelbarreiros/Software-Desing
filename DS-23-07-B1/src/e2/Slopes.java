package e2;


public class Slopes {

    private static void checkExceptions(char[][] slopeMap, int right, int down) {
        int i, j;
        if (right < 1 || right >= slopeMap.length) {
            throw new IllegalArgumentException("right >= number of columns or right < 1");
        }
        if (down < 1 || down >= slopeMap[0].length) {
            throw new IllegalArgumentException("down >= number of columns or down < 1");
        }
        for (i = 0; i < slopeMap.length; i++) {
            if (slopeMap[i].length != slopeMap.length) {
                throw new IllegalArgumentException("The matrix is not square");
            }
            for (j = 0; j < slopeMap[i].length; j++) {
                if (slopeMap[i][j] != '.' && slopeMap[i][j] != '#') {
                    throw new IllegalArgumentException("It has characters other than \".\" and \"#\"");
                }
            }
        }
    }

    public static int downTheSlope(char[][] slopeMap, int right, int down) {
        int i, r = 0, d = 0, aux, count = 0;
        checkExceptions(slopeMap, right, down);

        while (d < slopeMap.length) {
            aux = r + right;

            if (aux >= slopeMap[d].length) {
                aux -= slopeMap[d].length;
                for (i = r; i < slopeMap[d].length; i++) {
                    if (slopeMap[d][i] == '#') {
                        count++;
                    }
                }
                r = 0;
            }
            for (i = r; i < aux; i++) {
                if (slopeMap[d][i] == '#') {
                    count++;
                }
                r++;
            }

            aux = d + down;
            if (aux < slopeMap.length) {
                for (i = d; i < aux; i++) {
                    if (slopeMap[i][r] == '#') {
                        count++;
                    }
                    d++;
                }
            } else {
                for (i = d; i < slopeMap.length; i++) {
                    if (slopeMap[i][r] == '#') {
                        count++;
                    }
                }
                d = slopeMap.length;
            }
        }
        return count;

    }

    public static int jumpTheSlope(char[][] slopeMap, int right, int down) {
        int count = 0, d = 0, r = 0;
        checkExceptions(slopeMap, right, down);

        while (d < slopeMap.length - 1) {

            if (slopeMap[d][r] == '#') {
                count++;
            }

            if (d + down <= slopeMap.length - 1) {
                d += down;
                if (r + right < slopeMap[d].length) {
                    r += right;
                } else {
                    r = r + right - slopeMap[d].length;
                }
            } else {
                d = slopeMap.length - 1;
            }

        }
        if (slopeMap[d][r] == '#') {
            count++;
        }

        return count;

    }
}