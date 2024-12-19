package Time_And_Space_Complexity_10;

public class Approximations_4 {
    public static void main(String[] args) {
        // O(kn) -> O(n)
        // O(n+-k) -> O(n)

        //O(5n+4) -> O(n)

        // O(n^k) -> O(n^k)
        // a.powers of n are important
        // b.highest power of n is considered
        // O(n^3+100n^2-5n) -> O(n^3)
        // c.if there are other variables like m then they are seperate
        // O(n+10m) -> O(n+m)

    }
}
