package package1;

public class Fun {
    public void haveFun() {
        int n = 100;
        System.out.println("Having fun! "+n);
        MoreFun moreFun = new MoreFun();
        moreFun.haveMoreFun();
        System.out.println("Finishing fun "+n);
    }
}
