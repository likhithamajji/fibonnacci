class fibonnacci{
    public static void main(String[] args) {
        int n=7;
        fibonnaci(n);
    }
    public static void fibonnaci(int n) {
        int n1=0,n2=1;
        for(int i=0;i<n;i++){
            System.out.print(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }

    }
}