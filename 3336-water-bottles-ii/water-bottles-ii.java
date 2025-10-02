class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int t=0, empty = t * numExchange + (t * (t - 1)) / 2, total = numBottles + t;
        int a = 1, b = 2 * numExchange - 3, c = -2 * numBottles;
        t = (int) Math.ceil(((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)));
        return numBottles + t - 1;
    }
}