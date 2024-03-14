public class primitiveDT2 {
    public static void main(String[] args){
        int x = 5;
        int y = 7;
        System.out.println("X is: "+x);
        System.out.println("Y is: "+y);

        byte b=10;
        System.out.println("B is: "+b);

        byte b2=(byte)129; 
        System.out.println("B2 is: "+b2);

        byte b3=(byte)128; 
        System.out.println("B3 is: "+b3);

        byte b4=(byte)256; 
        System.out.println("B4 is: "+b4);

        int i=b;
        System.out.println("I is: "+i);

        float f=(float)5.5;
        System.out.println("F is: "+f);
        float f2=5.5f;
        System.out.println("F2 is: "+f2);
        double d=10.5d;
        System.out.println("D is: "+d);

        int a=Character.getNumericValue('a');
        System.out.println("A is: "+a);
        char c='a';
        System.out.println(c);
        int xa=c;
        System.out.println("XA is: "+xa);

        System.out.println((int)('a'));
        System.out.println((int)('A'));

        char c3='e';
        int e=c3='a';
        System.out.println("E is: "+e);

        int z=x+y;
        System.out.println("Z is: "+z);

        int m=5;
        int n=m++;
        System.out.println("M is "+m+", N is: "+n);

        int p=5;
        int q=++p;
        System.out.println("P is "+p+", Q is: "+q);
    }
    
}
