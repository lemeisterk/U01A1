public class AdditionTest {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        int c = Addition.add(a, b);

        System.out.println(c);
        System.out.println(Addition.add(1, 3));
        System.out.println(Addition.add(2, -4));

        System.out.println(Division.division(a, b));
        System.out.println(Division.division(4, 2));
        System.out.println(Division.division(9, -5));
    }
}
