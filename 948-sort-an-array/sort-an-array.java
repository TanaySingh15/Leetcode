class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public void mergeSort(int[] a,int l,int h){
        if(l>=h) return;
        int m=(l+h)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,h);
        merge(a,l,m,h);
    }

    public void merge(int arr[],int l,int m,int h){
        int[] a = new int[m-l+1];
        int[] b = new int[h-m];
        for(int i=0;i<m-l+1;i++){
            a[i] = arr[l+i];
        }
        for(int i=0;i<h-m;i++){
            b[i] = arr[m+i+1];
        }
        int i=0,j=0,k=l;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k] = a[i];
                i++;
                k++;
            } else {
                arr[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
                arr[k] = a[i];
                i++;
                k++;
        } 
        while(j<b.length){
                arr[k] = b[j];
                j++;
                k++;
        } 
    }
}