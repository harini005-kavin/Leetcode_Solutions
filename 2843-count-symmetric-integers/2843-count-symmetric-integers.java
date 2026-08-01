class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            int digits = (int) Math.log10(i) + 1; // number of digits
            if (digits % 2 == 0) { // only even-digit numbers
                int half = digits / 2;
                int leftSum = 0, rightSum = 0;
                int num = i;

                // get right half sum
                for (int j = 0; j < half; j++) {
                    rightSum += num % 10;
                    num /= 10;
                }
                // get left half sum
                for (int j = 0; j < half; j++) {
                    leftSum += num % 10;
                    num /= 10;
                }

                if (leftSum == rightSum) {
                    count++;
                }
            }
        }
        return count;
    }
}
