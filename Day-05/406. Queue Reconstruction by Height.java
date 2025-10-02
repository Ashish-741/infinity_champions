class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{if(a[0]==b[0]) return a[1]-b[1]; return b[0]-a[0];});

        List<int[]> result = new ArrayList<>();
        for(int[] n:people){
            result.add(n[1], n);//add the person at index n[1]
        }
        return result.toArray(new int[people.length][]);
    }
}
