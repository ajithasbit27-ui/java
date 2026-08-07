class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int i,count=0;
        boolean left,right;
        for(i=0;i< flowerbed.length;i++)
        {
            if(flowerbed[i] == 0)
            {
                left = (i==0) || flowerbed[i-1] ==0;
                right = (i == flowerbed.length-1) || (flowerbed[i+1] == 0); 
                if(left && right)
                {
                flowerbed[i]=1;
                count++;
                }
            }
        }
        if(count >= n)
        {
            return true;
        }
        return false;

/*int count = 0;
for (int i = 0; i < flowerbed.length; i++) {
if (flowerbed[i] == 0) {
boolean leftEmpty = (i == 0) || flowerbed[i - 1] == 0;
boolean rightEmpty = (i == flowerbed.length - 1) || flowerbed[i + 1] == 0;
if (leftEmpty && rightEmpty) {
flowerbed[i] = 1; // plant here
count++;
}
}
}
return count >= n;
}*/
    }
}