public static int risky(int x) {
    try {
        if (x == 0) throw new ArithmeticException("Zero");
        return 10 / x;
    } catch (Exception e) {
        return 99;
    } finally {
        System.out.println("Finally always runs");
        return 88;   // This overrides previous return!
    }
}