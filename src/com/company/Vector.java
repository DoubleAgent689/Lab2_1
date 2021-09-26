package com.company;
import java.util.Arrays;

public class Vector {

    private double[] vects;

    public Vector(int length) {
        vects = new double[length];
    }

    public void setValue(int i, double value) {
        vects[i] = value;
    }

    public String getValue() {
        return Arrays.toString(vects);
    }


    public int getLength ()
    {
        return vects.length;
    }

    public double getMin() {
        double min = vects[0];

        for (double el : vects) {
            if (el < min) {
                min = el;
            }

        }
        return min;
    }

    public double getMax() {
        double max = vects[0];

        for (double el : vects) {
            if (el > max)
            {
                max = el;
            }

        }
        return max;
    }

    public void sort() {
        for (int i = vects.length-1; i>0; i--)
        {
            for (int j = 0; j<i; j++)
            {
                if (vects[j] > vects[j+1])
                {
                    double tmp = vects[j];
                    vects[j] = vects[j+1];
                    vects[j+1] = tmp;
                }
            }
        }
    }

    public double evkNorm() {
        var result = 0;
        for (var el : vects) {
            result += el * el;
        }
        return Math.sqrt(result);
    }

    public String mult(int m) {

        for (var i = 0; i < vects.length; ++i) {
            vects[i] *= m;
        }

        return Arrays.toString(vects);
    }

    public String sum(double[] vector) {
        for (var i = 0; i < vects.length; ++i) {
            vects[i] += vector[i];
        }
        return Arrays.toString(vects);
    }

    public String scalarMult(double[] vector) {
        for (var i = 0; i < vects.length; ++i) {
            vects[i] *= vector[i];
        }
        return Arrays.toString(vects);
    }

}