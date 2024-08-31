package Array.Sorting;



public class mergeSort {

    public static void merge(int[] arr, int low, int mid, int high){

        int left=low;
        int right=mid+1;
        int[] temp=new int [high-low+1];
        int x=0;

        while(left<=mid && right<=high){

            if(arr[left]<=arr[right]){
                temp[x++]=arr[left++];
            }
            else{
                temp[x++]=arr[right++];
            }
        }

        while(left<=mid)
        {
            temp[x++]=arr[left++];
        }

        while(right<=high)
        {
            temp[x++]=arr[right++];
        }

        for(int i=0,j=low;i<temp.length;i++,j++)
        {
           arr[j]=temp[i];
        }
    
    }

    public static void divide(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }

        int mid=(low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    

     public static void main(String args[]) {
      
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        divide(arr,0,n-1);

        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
