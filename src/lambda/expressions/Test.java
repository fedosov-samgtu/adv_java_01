package lambda.expressions;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}


class ExecutableImplementation implements Executable {

    @Override
    public void execute() {
        System.out.println("Hello");
    }
}


public class Test {
    public static void main(String[] args) {

        System.out.println("test1");

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        });
//
//        Thread thread2 = new Thread(() -> System.out.println("Hello"));

        Runner runner = new Runner();

        runner.run(new ExecutableImplementation());

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });

        runner.run(() -> System.out.println("Hello"));

        System.out.println("test2");

    }
}
