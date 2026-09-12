class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] t=new int[n];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            t[i]=nums1[i];
            k++;
        }
        for(int j=0;j<nums2.length;j++)
        {
            t[k]=nums2[j];
            k++;
        }
        Arrays.sort(t);
        if(t.length%2 !=0)
        {
           int r = t.length / 2;
            return t[r];
        }
        else{
             int r = t.length / 2;
            return (t[r - 1] + t[r]) / 2.0;
        }
    }
}