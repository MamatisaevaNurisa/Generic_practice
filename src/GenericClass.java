import java.util.ArrayList;

public class GenericClass <N,A>{
    private N value;
    private A value2;


    public GenericClass(N value, A value2) {
        this.value = value;
        this.value2 = value2;
    }

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }

    public A getValue2() {
        return value2;
    }

    public void setValue2(A value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "value=" + value +
                ", value2=" + value2 +
                '}';
    }

    public static  < N extends Number> void method ( N [] Number ){
 int max = 0;
        for (int i = 0; i <Number.length ; i++) {
            max= Math.max(max , (Integer) Number[i]);
        }
        System.out.println(max);
    }

}
