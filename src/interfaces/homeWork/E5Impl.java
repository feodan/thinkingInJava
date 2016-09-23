package interfaces.homeWork;

import interfaces.homeWork.e5.E5interface;

public class E5Impl implements E5interface {
    @Override
    public void met1() {
        System.out.println("met1");
    }

    @Override
    public void met2() {
        System.out.println("met2");
    }

    @Override
    public void met3() {
        System.out.println("met3");
    }

    public static void main(String[] args) {
        E5Impl e5 = new E5Impl();
        e5.met1();
        e5.met2();
        e5.met3();
    }
}
