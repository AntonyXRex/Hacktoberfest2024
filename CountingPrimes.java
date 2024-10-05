import java.util.Scanner;
class countingPrimes {
    public int countPrimes(int n) {
        if(n==0)return 0;
        if(n==1)return 0;
        int count=0;
        boolean isprime[]=new boolean[n+1];
        for(int i=2;i<=Math.sqrt(n);i++){
            if(!isprime[i]){
            for(int j=i*i;j<=n;j+=i){
                isprime[j]=true;
            }
            }
        }
        for(int i=2;i<n;i++){if(!isprime[i])count++;}
        return count;
    }
    
    public static void main(String[] args) {
        countingPrimes cp = new countingPrimes();
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Number of prime numbers less than or equal to " + n + " : " + cp.countPrimes(n));
    }
}
