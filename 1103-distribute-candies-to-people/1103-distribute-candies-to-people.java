class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int [] arr= new int[num_people];
        Arrays.fill(arr,0);
        
        int can=1;
        while(candies>0){
            for(int i=0;i<arr.length;i++){
                if(can<candies){
                    arr[i]+=can;
                    candies-=can;
                } else{
                    arr[i]+=candies;
                    candies=0;
                } 
                can++;
            }

        }

        return arr;
    }
}