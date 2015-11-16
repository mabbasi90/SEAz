class Test
{
    public static void main(String[] args)
    {
        testSum();
        testDiv();
        testMul();
        testSub();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }
    private static void testDiv()
    {
        int a = 10;
        int b = 5;
        int expected = 2;
        BasicMath bm = new BasicMath();
        int result = bm.div(a, b);
        if (result == expected)
        {
            System.out.println("Div: OK");
        }
        else
        {
            System.out.println("Div: Failed, expected = " + expected + ", result = " + result);
        }
    }

    private static void testMul() {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.mul(a, b);
        if (result == expected) {
            System.out.println("Mul: OK");
        } else {
            System.out.println("Mul: Failed, expected = " + expected + ", result = " + result);
        }
    }

    private static void testSub() {
        int a = 10;
        int b = 3;
        int expected = 7;
        BasicMath bm = new BasicMath();
        int result = bm.sub(a, b);
        if (result == expected) {
            System.out.println("Sub: OK");
        } else {
            System.out.println("Sub: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
