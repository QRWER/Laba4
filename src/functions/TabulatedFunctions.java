package functions;

abstract class TabulatedFunctions {

    public static TabulatedFunction tabulate(Function function, double leftX, double rightX, int pointsCount){
        if(function.getLeftDomainBorder() > leftX || function.getRightDomainBorder() < rightX || pointsCount<2) throw new IllegalArgumentException();
        FunctionPoint[] points = new FunctionPoint[pointsCount];
        double j = (rightX-leftX)/(pointsCount-1);
        for (int i = 0; i < pointsCount; ++i) {
            double x = leftX + j * i;
            points[i] = new FunctionPoint(x, function.getFunctionValue(x));
        }
        return new ArrayTabulatedFunction(points);
    }
}
