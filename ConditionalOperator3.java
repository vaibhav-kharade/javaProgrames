class ConditionalOperator3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 41;
        int c = 34;
        int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        // String min = (b % 2 == 0) ? "Even" : "Odd";// 3>4== true====3 false ===4
        System.out.println(min);
    }
}