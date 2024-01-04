class PrimeCalculator {

    int nth(int n) throws IllegalArgumentException {
        if (n == 0)
            throw new IllegalArgumentException();
        int k = 0;
        int factor = 0;
        int prime = 0;
        while (n + 1 >= 0) {
            for (int i = 2; i <= Math.sqrt(k); i++) {
                if (k % i == 0)
                    factor++;
            }
            if (factor == 0) {
                n--;
                prime = k;


            }
            k++;
            factor = 0;
        }
        return prime;
    }

}
