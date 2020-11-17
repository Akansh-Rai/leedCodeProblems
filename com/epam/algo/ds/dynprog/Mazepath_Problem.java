public static void display_2D(int[][] arr) 
    {
        for (int[] ar : arr) 
        {
            display_1D(ar);
        }
        System.out.println();
    }
    
    
    public static int MazePath_Memoization(int sr, int sc, int dr, int dc, int[][] dp) 
    {
        if (sr == dr && sc == dc) 
        {
            return dp[sr][sc] = 1;
        }

        if (dp[sr][sc] != 0) 
        {
            return dp[sr][sc];
        }

        int count = 0;
        if (sc + 1 <= dc) 
        {
            count += MazePath_Memoization(sr, sc + 1, dr, dc, dp);
        }

        if (sr + 1 <= dr) 
        {
            count += MazePath_Memoization(sr + 1, sc, dr, dc, dp);
        }

        if (sr + 1 <= dr && sc + 1 <= dc) 
        {
            count += MazePath_Memoization(sr + 1, sc + 1, dr, dc, dp);
        }

        return dp[sr][sc] = count;
    }
    public static int MazePath_Tabulation(int sr, int sc, int dr, int dc, int[][] dp) 
    {
        for (sr = dr; sr >= 0; sr--) 
        {
            for (sc = dc; sc >= 0; sc--) 
            {
                if (sr == dr && sc == dc) 
                {
                    dp[sr][sc] = 1;
                    continue;
                }

                int count = 0;
                if (sc + 1 <= dc) 
                {
                    count += dp[sr][sc + 1];
                }

                if (sr + 1 <= dr) 
                {
                    count += dp[sr + 1][sc];
                }

                if (sr + 1 <= dr && sc + 1 <= dc) 
                {
                    count += dp[sr + 1][sc + 1];
                }

                dp[sr][sc] = count;
            }
        }
        return dp[0][0];
    }
    public static void MazePath_H_V_D()
    {
        int n=5, m=5;
        int[][] dp = new int[n][m];
        System.out.println("This is Memoization Path :- " + MazePath_Memoization(0, 0, n-1, m-1, dp));
        display_2D(dp);
        System.out.println("This is Tabulation Path :- " + MazePath_Tabulation(0, 0, n-1, m-1, dp));
        display_2D(dp);
    }
