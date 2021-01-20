package task09;

public class Frac {
    private int num;
    private int denom;

    public Frac(int n, int d) {
        this.num = n;
        this.denom = d;
        Simplify();
    }
    public Frac(int n) {
        this.num = n;
        this.denom = 1;

    }

    public int calculateGCD(int n, int d) {
        if (n % d == 0) {
            return d;
        }
        return calculateGCD(d, n % d);
    }


    void Simplify() {
        int gcd = calculateGCD(num, denom);
        num /= gcd;
        denom /= gcd;

    }
    public static Frac add(Frac a, Frac b) {
        return new Frac(((a.denom * b.num) + (b.denom * a.num)), (a.denom * b.denom));
    }
    public Frac add(Frac other) {
        Frac A = add(other, this);
        this.num = A.num;
        this.denom = A.denom;
        return this;
    }
    public static Frac mul(Frac a, Frac b) {
        return new Frac((a.num * b.num), (a.denom * b.denom));
    }
    public Frac mul(Frac other) {
        Frac M = mul(other, this);
        this.num = M.num;
        this.denom = M.denom;
        return this;
    }
    public static Frac div(Frac a, Frac b) {
        return new Frac((a.num * b.denom), (a.denom * b.num));
    }
    public Frac div(Frac other) {
        Frac D = div(other, this);
        this.num = D.num;
        this.denom = D.denom;
        return this;
    }


    public Frac sub(Frac a,Frac b) {
        return new Frac(((b.num * a.denom) - ( b.denom*a.num)), (a.denom * b.denom));
    }
    public Frac sub(Frac other) {
        Frac S = sub(other, this);
        this.num = S.num;
        this.denom = S.denom;
        return this;
    }


    @Override
    public String toString() {
        if(this.denom == 1) {
            return String.valueOf(this.num);
        }
        if (denom < 0)
        {
            num *= -1;
            denom *= -1;
        }

        return this.num + "/" + this.denom;
    }
}
