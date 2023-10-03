class Calculator {
    int a;

    public int add() {
        System.out.println("in add");
        return 0;
    }
}

public class Demo {
    public static void main(String a[]) {
        int n1 = 2;
        int n2 = 9;

        int result = n1 + n2;
        System.out.println(result);

        Calculator obj = new Calculator();
        obj.add();
    }
}
