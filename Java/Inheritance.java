public class Inheritance {
    public static void main(String[] args) {
        mul s = new mul();
        s.run1();
        s.run2();
        s.run();

    }

}

class add {
    add() {
    }

    add(int a) {

    }

    void run() {
        System.out.println("this is first class");
    }

}

class sub extends add {
    void run1() {
        System.out.println("this is second class");
    }

}

class mul extends sub {
    void run2() {
        System.out.println("this is third class");
    }

}
