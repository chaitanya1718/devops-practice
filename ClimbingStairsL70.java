import java.util.Scanner;
class ClimbingStairsL70{

    // memoization - top down approach
    static int totalWaysMemo(int x,int[] dp){
        if(x<=1) return 1;

        if(dp[x]!=0) return dp[x];

        dp[x]= totalWaysMemo(x-1, dp) + totalWaysMemo(x-2, dp);
        return dp[x];
    }

    // tabulation - bottom top approach
    static int totalWaysTab(int x){
        int[] dp=new int[x+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[x];

    }


    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();

        System.out.println(totalWaysMemo(n, new int[n+1]));
        System.out.println(totalWaysTab(n));
        
    }

}