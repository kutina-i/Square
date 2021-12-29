public class Square{
    private double a;
    private double b;
    private double c;

    public Square(double a, double b, double c){
        if(a == 0){
            throw new IllegalArgumentException("Не квадратный трехчлен");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] Roots(){
        double D = b*b - 4*a*c;
        if(D < 0){
            throw new IllegalArgumentException("Действительных корней нет");
        }
        if(D == 0){
            double[] arr = new double[1];
            arr[0] = -b/(2*a);
            return arr;
        }
        double[] arr = new double[2];
        arr[0] = (-b + Math.sqrt(D))/(2*a);
        arr[1] = (-b - Math.sqrt(D))/(2*a);
        return arr;
    }

}