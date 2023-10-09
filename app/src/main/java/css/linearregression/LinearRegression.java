package css.linearregression;

import java.util.List;

public class LinearRegression {
    public LinearRegression(List<Double> xValues, List<Double> yValues) {
        this.xValues = xValues;
        this.yValues = yValues;
        leastSquaresAnalysis();
    }

    List <Double> xValues;
    List <Double> yValues;

    public Double m_slope = 0.0;        // slope of linear regression line
    public Double b_intercept = 0.0;   // y-intercept

    private void leastSquaresAnalysis() {
        // Add code here to do Least Square regression using the xValues and yValues arrays
        // Store linear equation (y=mx+b) in the m_slope and b_intercept variables

    }


}
