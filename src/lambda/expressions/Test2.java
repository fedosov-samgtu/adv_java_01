package lambda.expressions;

interface Executable2 {
    int execute(int x, int y);
}

class Runner2 {
    public void run(Executable2 e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}


public class Test2{
    public static void main(String[] args) {

        Runner2 runner2 = new Runner2();

        int a = 1;
        runner2.run(new Executable2() {
            @Override
            public int execute(int x, int y) {
                int a = 2;
                System.out.println("Hello");
                System.out.println("Goodbye");
                return x + y;
            }
        });

        runner2.run((int x, int y) -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
            return x + y;
        });

//        runner2.run((int x) -> x + 5);
//        runner2.run((x) -> x + 5);
//        runner2.run(x -> x + 5);
        runner2.run((int x, int y) -> x + y);

        int s = 2;
//        s = 33;
        runner2.run((int x, int y) -> x + y + s);

//        runner2.run((int x, int y) -> {
//            return x + y + s;
//            int a = 3;
//        });

    }
}
