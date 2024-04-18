/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Solution {

    public int findPeakElement(int[] nums) {
        int hi, lw, mid;
        lw = 0;
        hi = nums.length - 1;
        while (lw <= hi) {
            mid = (lw + hi) / 2;
            if (mid - 1 >= 0 && mid + 1 < nums.length) {

                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (nums[mid-1]>nums[mid]){
                    hi=mid-1;
                }
                else if(nums[mid+1]>nums[mid])
                {
                    lw=mid+1;
                }
            }
            else if(mid-1<0 && mid+1<nums.length)
            {
                if(mid+1<nums.length && nums[mid+1]>nums[mid])
                {
                    return mid+1;
                }
                else
                {
                    return mid;
                }
            }
            else if(mid-1>=0 && mid+1>=nums.length)
            {
                if(nums[mid]>nums[mid-1])
                {
                    return mid;
                }
                else
                {
                    return mid-1;
                }
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Solution s = new Solution();
        int ans = s.findPeakElement(arr);
        System.out.println(ans);
    }

}
