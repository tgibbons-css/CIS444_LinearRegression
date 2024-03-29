package css.linearregression;

import android.util.Log;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.math3.stat.regression.SimpleRegression;

public class LinearRegression {
    public LinearRegression(List<Double> xValues, List<Double> yValues) {
        this.xValues = xValues;
        this.yValues = yValues;
        System.out.println("xValues size = "+xValues.size());
        leastSquaresAnalysis();
    }

    SimpleRegression regression;
    List <Double> xValues;
    List <Double> yValues;
//    List<Double> x = Arrays.asList(0.2, 0.4, 0.6, 0.8);
//    List<Double> y = Arrays.asList(1200.0, 1310.0, 1430.0, 1580.0);

    public Double m_slope = 0.0;        // slope of linear regression line
    public Double b_intercept = 0.0;   // y-intercept

    private void leastSquaresAnalysis() {
        // Create a SimpleRegression instance
        regression = new SimpleRegression();
        // Add data points to the regression model
        for (int i = 0; i < xValues.size(); i++) {
            regression.addData(xValues.get(i), yValues.get(i));
            //Log.d("CIS3334","Adding in x = "+xValues.get(i)+" and y = "+yValues.get(i));
            System.out.println("Adding in x = "+xValues.get(i)+" and y = "+yValues.get(i));
        }
        // Perform linear regression
        m_slope = regression.getSlope();
        b_intercept = regression.getIntercept();
    }

    public Double predict(Double newX) {
        return regression.predict(newX);
    }

}
