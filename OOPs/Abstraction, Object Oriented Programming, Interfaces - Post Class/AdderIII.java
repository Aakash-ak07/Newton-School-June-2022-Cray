// implement you interface here
class AdderII implements Adder{
    int num1;
    int num2;

    public AdderII()
    {
        this.num1 = 0;
        this.num2 = 0;
    }
    AdderII(int a, int b)
    {
        this.num1 = a;
        this.num2 = b;
    }
    @Override
    public int add()
    {
        return this.num1 + this.num2; 
    }
    @Override
    public int add(int a,int b)
    {
        return((a * a)+ (b * b));
    }
    @Override
    public int add(int a,int b,int c)
    {
        this.num1 = add(this.num1 , a);
        this.num2 = add(this.num2 , b);
        return (this.num1  + this.num2 - c * c);
    }
}
