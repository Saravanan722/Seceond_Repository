
public class Genric {
    public static void main(String[] args) {
        GenricExample1<String,String> x = new GenricExample1<String,String>("aaaa","aaaaa");
        System.out.println(x.getShow());
        System.out.println(x.show1());

        Integer.valueOf(12);

        int t = 0;
    }

}

class GenricExample<T> {
    T t;

    public GenricExample(T a) {

        t = a;

    }

      T getShow() {
         return t;
        
    }
}

class GenricExample1<T,d> extends GenricExample<T> {
    T d;

    public GenricExample1(T a,T Type1) {
        super(a);
        this.d = Type1;
    }

     T show1() {
        return d;
    } 
}
