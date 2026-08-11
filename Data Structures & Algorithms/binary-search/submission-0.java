class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binarySearch(nums, target, 0, n-1);
    }
    public int binarySearch(int []nums, int target, int l, int r){
        if(l>r) return -1;

        int mid = l + (r-l) / 2;

        if(nums[mid] == target) return mid;
        return (nums[mid] < target) ?
            binarySearch(nums, target, mid+1, r) :
            binarySearch(nums, target, l, mid-1);

    }
}
