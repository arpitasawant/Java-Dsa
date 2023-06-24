public class binomialfun {
    public static int factorialfun(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
f=f*i;

        }
        return f;
    }
    public static int binomailfun1(int n,int r) {
        int fac_n = factorialfun(n);
        int fac_r=factorialfun(r);
        int fac_nr = factorialfun(n-r);
        int bino = fac_n/(fac_r*fac_nr);
        return bino;
        
    }
    public static void main(String[] args) {
        System.out.println(factorialfun(4));
        System.out.println(binomailfun1(5, 3));
    }
}
