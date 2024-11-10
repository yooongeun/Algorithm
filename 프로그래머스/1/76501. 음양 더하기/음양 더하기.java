class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < signs.length; i++) { // 올바른 반복문
            if (signs[i]) { // boolean 배열은 직접 비교 가능
                sum += absolutes[i];
            } else {
                sum -= absolutes[i]; // 음수 처리
            }
        }
        return sum;
    }
}
