public class Solution {
    public static void main(String[] args) {
        int result = solution(2,3);

        System.out.println(result);
    }
    static int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}
