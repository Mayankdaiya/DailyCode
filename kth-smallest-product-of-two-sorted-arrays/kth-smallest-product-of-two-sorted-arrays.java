class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        return kthProduct(nums1,nums2,k);
    }

    public static long kthProduct(int arr1[],int arr2[],long k){
        long si = -1000_000_0000l;
        long ei = 1000_000_0000l;
        long ans= 0;
        while(si<=ei){
            long mid=(si+ei)/2;
            if(countOfproduct(arr1,arr2,mid)>=k){
                ans=mid;
                ei=mid-1;
            } else{
                si=mid+1;
            }
        }
        return ans;
    }

    public static long countOfproduct(int arr1[],int arr2[],long pro){
        long ans=0;
        for(int e1:arr1){
            if (e1 >= 0) {
                int count=0;
                int lo=0;
                int hi=arr2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)(e1)*arr2[mid]<=pro){
                        count=mid+1;
                        lo=mid+1;
                    } else{
                        hi=mid-1;
                    }
                }
                ans+=count;
            } else{
                int count=0;
                int lo=0;
                int hi=arr2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)(e1)*arr2[mid]<=pro){
                        count=arr2.length-mid;
                        hi=mid-1;
                    } else{
                        lo=mid+1;
                    }
                }
                ans+=count;
            }
        }
        return ans;
    }
}