package javaclasses.gcfinalize;

class A {}
class B extends A {}
class C extends B {
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //depricated метод, замедляет работу
    }
}

public class LearnMainFinalize {
    public static void main(String[] args) {
        C c = new C();
        c = null;
        System.gc(); //первый способ
        Runtime.getRuntime().gc();// второй способ
    }
}
