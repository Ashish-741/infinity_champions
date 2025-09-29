class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            //flip
            int low=0;
            int high=image[0].length-1;
            while(low<high){
                int temp=image[i][low];
                image[i][low]=image[i][high];
                image[i][high]=temp;
                low++;
                high--;
            }
            //invert
            int count=0;
            while(count<image[0].length){
                if(image[i][count]==0){
                    image[i][count]=1;
                }else{
                    image[i][count]=0;
                }
                count++;
            }
        }
        return image;
    }
}
