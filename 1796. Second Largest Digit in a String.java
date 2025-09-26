// In this we have used a variable c which is set to 2 ,we loop from 9 to 0 and if that no. is present then decerese the c, and when the 
// value of c became equal to 0,print the value .From this method we can't just find the 2nd largest but 3rd,4th,5th any by just changing the value of c.

class Solution {
    public int secondHighest(String s) {
        int c = 2;
        for (char i = '9'; i >= '0'; i--) {
            if (s.indexOf(i) != -1) {
                c--;
                if (c == 0) {
                    return i - '0';
                }

            }

        }
        return -1;
    }
}
