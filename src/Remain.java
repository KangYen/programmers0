class Remain {
    public static void main(String[] args) {
        int result = solution(4, 4);
        System.out.println(result);
    }

    static int solution(int num1, int num2) {
     int answer = num1 % num2;
     return answer;
    }
}
