class Solution {
      public int minEatingSpeed(int[] piles, int h) {
        int lw,hi,mid,mx,mn;
       long res=h;
        mx=0;
        mn=1000000000;
        
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>mx)mx=piles[i];
            if(piles[i]<mn)mn=piles[i];
        }
        lw=1;
        hi=mx;
        while(lw<=hi)
        {
            mid=lw+((hi-lw)/2);
           long val=0;
            for(int i=0;i<piles.length;i++)
            {
                if(piles[i]<=mid)
                {
                    val++;
                }
                else if(piles[i]>mid)
                {
                    int p=piles[i]/mid;
                    val+=p;
                    if(piles[i]%mid!=0)val++;
                }
            }
            if(val>h)
            {
                lw=mid+1;
            }
            else
            {
                res=mid;
                hi=mid-1;
            }
        }
        return(int) res;
        
    }
}
