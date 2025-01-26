class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int total = 0;
            while (n > 0) {
                int digit = n % 10;
                total += digit * digit;
                n /= 10;
            }
            n = total;
        }
        
        return n == 1; 
    }
}