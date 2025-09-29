// User function Template for Java

class Solution {
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        Stack<Integer> st=new Stack<>();
        int [] res=new int[n];
        
        for(int i=arr.length-1;i>=0;i--){
            
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            
            st.push(arr[i]);
        }
        return res;
    }
}
