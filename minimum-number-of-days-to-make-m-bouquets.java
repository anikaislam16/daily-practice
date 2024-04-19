class Solution {
   public int minDays(int[]arr, int m, int k) {
        int lw,hi,mid,n,s,mx,mn;
        long res,p;
        mx=0;
        mn=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>mx)mx=arr[i];
            if(arr[i]<mn)mn=arr[i];
        }
        long mul=(long)m*k;
        if(mul>1000000|| mul>arr.length)
        {
            return -1;
        }
        lw=mn;
        hi=mx;
        res=mx;
        while(lw<=hi)
        {
            mid=lw+((hi-lw)/2);
            int l=0;
            p=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<=mid)
                {
                    l++;
                }
                else if(arr[i]>mid)
                {
                    l=0;
                }
                if(l==k)
                {
                    p++;
                    l=0;
                }
            }
            if(p>=m)
            {
                res=mid;
                hi=mid-1;
            }
            else
            {
                lw=mid+1;
            }
        }
        return (int)res;
    }

}
