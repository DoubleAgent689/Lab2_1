package com.company;
import java.util.Arrays;

public class Vector {

    public double[] vectors;

    public Vector(int length) {
        vectors = new double[length];
    }

    public void setValue(int i, double value) {
        vectors[i] = value;
    }

    public String getValue() {
        return Arrays.toString(vectors);
    }


    public int getLength ()
    {
        return vectors.length;
    }

    public double getMin() {
        double min = vectors[0];

        for (double num : vectors) {
            if (num < min) {
                min = num;
            }

        }
        return min;
    }

    public double getMax() {
        double max = vectors[0];

        for (double num : vectors) {
            if (num > max)
            {
                max = num;
            }

        }
        return max;
    }

    public void sort() {
        for (int i = vectors.length-1; i>0; i--)
        {
            for (int j = 0; j<i; j++)
            {
                if (vectors[j] > vectors[j+1])
                {
                    double tmp = vectors[j];
                    vectors[j] = vectors[j+1];
                    vectors[j+1] = tmp;
                }
            }
        }
    }

    public double EvkNorm() {
        var result = 0;
        for (var num : vectors) {
            result += num * num;
        }
        return Math.sqrt(result);
    }

    public String multiple(int m) {

        for (var i = 0; i < vectors.length; ++i) {
            vectors[i] *= m;
        }

        return Arrays.toString(vectors);
    }

    public String sum(double[] vector) {
        for (var i = 0; i < vectors.length; ++i) {
            vectors[i] += vector[i];
        }
        return Arrays.toString(vectors);
    }

    public String scalarMultiple(double[] vector) {
        for (var i = 0; i < vectors.length; ++i) {
            vectors[i] *= vector[i];
        }
        return Arrays.toString(vectors);
    }

}