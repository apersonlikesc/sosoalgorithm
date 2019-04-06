package nowcoder;

public class solution16 {
    public double Power(double base, int exponent) {
        if(exponent == 0)
            return 1;
        if(exponent == 1)
            return base;
        boolean isNagavite = false;
        if(exponent < 0 )
        {
            exponent = -exponent;
            isNagavite = true;
        }
        double pow = Power(base*base,exponent/2);
        if(exponent%2!=0)
        {
            pow = pow * base;
        }
        return isNagavite?1/pow:pow;

    }
}
