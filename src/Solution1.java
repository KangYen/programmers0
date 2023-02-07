public class Solution1 {
    public static void main(String[] args) {
        int result = solution(2,2);

        System.out.println(result);
    }

    private static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}

