package RecursionLec3;

public class powerof {

    static int powX(int p , int q){
        if(q == 0){
            return 1;
        }
        int smallPow= powX(p,q/2);

        if(q % 2 ==0){
            return smallPow * smallPow;

        } else
            return p*smallPow * smallPow;
        }


    static int powerOfQ(int p, int q) {
        if (q == 0) {
            return q = 1;
        }
        return powerOfQ(p,q-1) *p;
    }

    public static void main(String[] args) {
       //System.out.println(powerOfQ(4,3));
        System.out.println(powX(3,4));

    }
}
