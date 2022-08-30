// Write a class with the name SumCalculator. The class needs two fields (public variables) with names num1 and num2 both of type int.

// Write the following methods (instance methods):
// *Method named sum without any parameters, it needs to return the value of num1 + num2.
// *Method named sum2 with two parameters a, b, it needs to return the value of a + b.
// *Method named fromObject with two parameters of type sumCalculator object named obj1 and obj2, and you have to call sum function for respective object and return sum of both

class SumCalculator{
    int num1;
    int num2;

    SumCalculator(int a, int b)
    {
        this.num1 = a;
        this.num2 = b;
    }
    public int sum()
    {
        return this.num1 + this.num2;
    }
    public int sum2(int a, int b)
    {
        return a + b;
    }
    public int fromObject(SumCalculator obj1, SumCalculator obj2)
    {
        obj1.sum();
        obj2.sum();
        return sum2(obj1.sum(), obj2.sum());
    }
}
