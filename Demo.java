package pack1;
class Demo{
    public static void main(String s[]){
       A a1 = new A();
    
       a1.m1();
       a1.m2();

       B b1 = new B();
       b1.m3();
      // b1.m4();     // has private access in B
    }
}