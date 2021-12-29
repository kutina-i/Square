public class squareTrinom {
    public double maxRoot(Square q){
        double[] roots = q.Roots();
        if(roots.length == 1){
            return roots[0];
        }
        if(Double.compare(roots[0], roots[1]) < 0){
            return roots[1];
        }
        return roots[0];
    }
}
