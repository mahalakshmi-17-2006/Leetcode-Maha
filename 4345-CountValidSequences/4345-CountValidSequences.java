// Last updated: 8/11/2026, 2:14:10 PM
class Solution {
    private static final int MOD=1000000007;
    public int countValidSequences(int n, int k) {
        if(n < k){
            return 0;
        }
        long[] fact = new long[n+1];
        long[] inFact = new long[n+1];

        fact[0]=1;
        inFact[0]=1;

        for(int i=1;i<=n;i++){
            fact[i]=(fact[i-1]*i) % MOD;
        }
        inFact[n]=power(fact[n],MOD - 2);
        for(int i=n-1;i>=1;i--){
            inFact[i] = (inFact[i+1]*(i+1)) % MOD;
        }
        long total = ncr(n-1,k-1,fact,inFact);

        long allodd =0;
        if((n-k)%2==0){
            int m=(n-k)/2;
            allodd = ncr(m+k-1,k-1,fact,inFact);
        }
        long ans=(total-allodd+MOD) % MOD;
        return (int) ans;
    }
    private long ncr(int n,int r,long[] fact,long[] inFact){
        if(r<0 || r>n){
            return 0;
        }
        return fact[n]*inFact[r]% MOD * inFact[n-r]%MOD;
    }
    private long power(long base,long exp){
        long res=1;
        base %=MOD;
        while(exp > 0){
            if(exp % 2==1){
                res = (res * base)% MOD;
            }
            base = (base*base) % MOD;
            exp/=2;
        }
        return res;
    }
}