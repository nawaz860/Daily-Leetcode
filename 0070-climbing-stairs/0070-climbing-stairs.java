class Solution {
        public int climbStairs(int n) {
                return func(n, 1, 2);
                    }

                        public int func(int n, int a, int b) {
                                if (n == 1) return a;
                                        if (n == 2) return b;

                                                return func(n - 1, b, a + b);
                                                    }
                                                    }