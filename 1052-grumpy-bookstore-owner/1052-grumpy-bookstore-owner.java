class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int n = customers.length;

        int satisfied = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0)
                satisfied += customers[i];
        }

        int left = 0;
        int window = 0;
        int maxRecover = 0;

        for (int right = 0; right < n; right++) {

            
            if (grumpy[right] == 1)
                window += customers[right];


            // Remove outgoing customer
             if (right - left + 1 > minutes)
             {
                
                if (grumpy[left] == 1)
                    window -= customers[left];

                left++;
             }

            // Window reached required size
            if (right - left + 1 == minutes) {
                maxRecover = Math.max(maxRecover, window);
            }

            
                
            
        }

        return satisfied + maxRecover;
    }
}