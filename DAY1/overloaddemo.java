class overloaddemo {
    
    void test()
    {
        System.out.println("No parameters");
    }
    void test(double a)
    {
        System.out.println("a:"+a);
    }
    void test(int a,int b)
    {
        System.out.println(a*b);
    }
   
}
class testhere{
    public static void main(String[] args) {
        overloaddemo op=new overloaddemo();
        op.test();
        op.test(10);
        op.test(20, 10);
        op.test(78.98);
       
    }
    
}
