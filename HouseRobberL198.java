public class HouseRobberL198 {

    // tabulation - bottom to top approach
    static int maxRobberyTab(int[] arr){
        int n=arr.length;
        int[] dp=new int[n+1];

        dp[0]=0;
        dp[1]=Math.max(arr[0],dp[0]);

        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2]+arr[i-1],dp[i-1]);
        }

        return dp[n];
    }
    
    // memoization - top to bottom approach
    static int maxRobberyMemo(){

        return 0;
    }



    public static void main(String[] args) {
        int[] arr={80,10,90,50,40,5,100};
        System.out.println(maxRobberyTab(arr));
    }
}
