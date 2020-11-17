public static boolean[][] is_Pallindrome_SubString(String str)
    {
        int n = str.length();
        boolean[][] dp = new boolean[n][n];

        for(int gap = 0; gap < n; gap++)
        {
            for(int i = 0; i < n - gap; i++)
            {
                int j = i + gap;
                if(gap == 0)
                {
                    dp[i][j] = true;
                }
                else if(gap==1 && str.charAt(i) == str.charAt(j))
                {
                    dp[i][j] = true;
                }
                else 
                {
                    dp[i][j] = str.charAt(i) == str.charAt(j) && dp[i+1][j-1]; 
                }
            }
        }

        return dp;
    }

    public static String Leetcode_005_Longest_Pallindromic_SubString(String str)
    {
        int n = str.length();
        int[][] dp = new int[n][n];

        int maxLen = 0;
        int si=0, ei=0;
        for(int gap = 0; gap < n; gap++)
        {
            for(int i = 0; i < n - gap; i++)
            {
                int j = i + gap;
                if(gap == 0)
                {
                    dp[i][j] = 1;
                }
                else if(gap==1 && str.charAt(i) == str.charAt(j))
                {
                    dp[i][j] = 2;
                }
                else if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1]!=0)
                {
                    dp[i][j] = gap + 1; 
                }

                if(dp[i][j] > maxLen)
                {
                    maxLen = dp[i][j];
                    si = i;
                    ei = j;
                }
            }
        }

        System.out.println("Maximum Length :- " + maxLen);

        for(int i = 0; i < dp.length; i++)
        {
            for(int j = 0; j < dp[0].length; j++)
            {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

        return str.substring(si, ei+1);
    }
    public static void Leetcode_005_Longest_Pallindromic_SubString()
    {
        System.out.println(Leetcode_005_Longest_Pallindromic_SubString("abcaacbefgpgf"));
    }
