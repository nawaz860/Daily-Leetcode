class Solution {
    public int pivotInteger(int n) {

        if(n==1) return 1;

        int [] arr=new int[n];

        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }

        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
        }
        int middle=sum1/2;

        int sum2=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
            if(sum2>middle){
                index+=i;
            break;
            } 
        }

          int sum3=0;
          int sum4=0;  
        for(int i=0; i<=index; i++){
            sum3+=arr[i];
        }
        for(int i=index;i<arr.length;i++){
            sum4+=arr[i];
        }

        if(sum3==sum4) return arr[index];
        return -1;
        
    }
}