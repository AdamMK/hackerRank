import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array2DTest {

    @Test
    void anArrayOfZeroReturnsZero() {
        int[][] inputArray = new int[6][6];
        assertEquals(0, Array2D.hourglassSum(inputArray));
    }

    @Test
    void firstHourGlassOfOnesReturns7() {
        int[][] inputArray = new int[6][6];
        addHourGlassAtX0Y0With(1, inputArray);
        prettyPrintArray(inputArray);
        assertEquals(7, Array2D.hourglassSum(inputArray));
    }

    void addHourGlassAtX0Y0With(int digit, int[][] arr) {
        arr[0][0] = digit;
        arr[0][1] = digit;
        arr[0][2] = digit;
        arr[1][1] = digit;
        arr[2][0] = digit;
        arr[2][1] = digit;
        arr[2][2] = digit;
    }

    @Test
    void twoHourGlassesReturnsTheBiggestWhichHasSumOf14() {
        int[][] inputArray = new int[6][6];
        addHourGlassAtX0Y0With(1, inputArray);
        addHourGlassAtX0Y3With(2, inputArray);
        prettyPrintArray(inputArray);
        assertEquals(14, Array2D.hourglassSum(inputArray));
    }

    void addHourGlassAtX0Y3With(int digit, int[][] arr) {
        arr[0][3] = digit;
        arr[0][4] = digit;
        arr[0][5] = digit;
        arr[1][4] = digit;
        arr[2][3] = digit;
        arr[2][4] = digit;
        arr[2][5] = digit;
    }

    @Test
    void threeHourGlassesReturnsTheBiggestWhichHasSumOf21() {
        int[][] inputArray = new int[6][6];
        addHourGlassAtX0Y0With(1, inputArray);
        addHourGlassAtX0Y3With(2, inputArray);
        addHourGlassAtX3Y3With(3, inputArray);
        prettyPrintArray(inputArray);
        assertEquals(21, Array2D.hourglassSum(inputArray));
    }


    void addHourGlassAtX3Y3With(int digit, int[][] arr) {
        arr[3][3] = digit;
        arr[3][4] = digit;
        arr[3][5] = digit;
        arr[4][4] = digit;
        arr[5][3] = digit;
        arr[5][4] = digit;
        arr[5][5] = digit;
    }

    @Test
    void failingHRtest() {
        String input =
                "-1 -1  0 -9 -2  -2 " +
                "-2 -1 -6 -8 -2 -5 " +
                "-1 -1 -1 -2 -3 -4 " +
                "-1 -9 -2 -4 -4 -5 " +
                "-7 -3 -3 -2 -9 -9 " +
                "-1 -3 -1 -2 -4 -5 ";
        int[][] inputArray = createArrayFromInputString(input);
        prettyPrintArray(inputArray);
        assertEquals(-6,Array2D.hourglassSum(inputArray));
    }

    private int[][] createArrayFromInputString(String input) {
        String[] items = input.split("\\s+");
        int itemCount = 0;
        int[][] arr =  new int[6][6];
        for (int x = 0; x <= 5; x++) {
            for (int y = 0; y <= 5; y++) {
                arr[x][y] = Integer.parseInt(items[itemCount++]);
            }
        }
        return arr;
    }

    private void prettyPrintArray(int[][] inputArray) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.format("%3d", inputArray[i][j]);
            }
            System.out.println();
        }
    }
}

