public class ArrayCalculations {
    public static double averageArray(int[][] nums) {
        double sum = 0;
        for(int row = 0; row < nums.length; row++) {
            for(int col = 0; col < nums[0].length; row++) {
                sum += nums[row][col];
            }
        }
        return (sum/(nums.length * nums[0].length));
    }
    
    public static int[] sumColumns(int[][] nums) {
        int[]newArray = new int[nums.length];
        int sumOfCol = 0;
        for (int row = 0; row < nums.length; row++) {
            for(int col = 0; col < nums[0].length; col++) {
                sumOfCol += nums[row][col];
            }
            newArray[row] = sumOfCol;
            sumOfCol = 0;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        return newArray;
    }
    
    public int[][] squareArray(int[][] nums) {
        int[][]squaredArray = new int[nums.length][nums[0].length];
        int squaredNum = 0;
        for (int row = 0; row < nums.length; row++) {
            for(int col = 0; col < nums[0].length; col++) {
                squaredNum = (nums[row][col])^2;
                squaredArray[row][col] = squaredNum;
            }
            squaredNum = 0;
        }
        return squaredArray;
    }
}
