package leetcode.retry;

public class solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length+nums2.length-1;
        boolean ou = false;
        if(a%2 == 0)
        {
            ou = true;
        }
        a = a/2;
        if(nums1.length == 0||nums2.length==0)
        {
            if(!ou)
            {
                return nums1.length==0?(nums2[a]+nums2[a+1])/2.0:(nums1[a]+nums1[a+1])/2.0;
            }else{
                return nums1.length==0?nums2[a]:nums1[a];
            }
        }
        int count = 0;
        int point1= 0,point2 = 0;
        while(point1<nums1.length-1||point2<nums2.length-1)
        {
            if(count++ < a){
                if(nums1[point1] < nums2[point2])
                {
                    if(point1<nums1.length-1)
                        point1++;
                }else{
                    if(point2<nums2.length-1)
                        point2++;
                }
            }else{
                break;
            }
        }
        if(!ou)
        {
            return (nums1[point1]+nums2[point2])/2.0;
        }else{
            return nums1[point1]<nums2[point2]?nums1[point1]:nums2[point2];
        }
    }
}
