class Solution {
    public int largestRectangleArea(int[] heights) {
        //first we have to create left and right smaller element for every element 
        int n=heights.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer> st=new Stack<>();
        //right smaller element
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                right[i]=n;
            }else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }

        //left smaller element 
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=st.peek();
            }
            st.push(i);
        }


        int ans=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int currarea=heights[i]*width;
            ans=Math.max(currarea,ans);
        }
        return ans;
    }
}
