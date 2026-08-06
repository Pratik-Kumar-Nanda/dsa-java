class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) 
        {
            boolean isDestroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) 
            {
                if (stack.peek() < -asteroid) 
                {
                    stack.pop();
                } 
                else if (stack.peek() == -asteroid) 
                {
                    stack.pop();
                    isDestroyed = true;
                    break;
                } 
                else 
                {
                    isDestroyed = true;
                    break;
                }
            }

            if (!isDestroyed) 
            {
                stack.push(asteroid);
            }
        }

        int[] ans = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--) 
        {
            ans[i] = stack.pop();
        }

        return ans;
    }
}