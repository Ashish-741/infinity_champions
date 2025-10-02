class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int slow=0;
        int high=n-1;
        int count=0;
        while(slow<=high){
            if(people[slow]+people[high]<=limit){
                slow++;
            }
            high--;
            count++;
        }
        return count;
    }
}
