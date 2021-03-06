package com.company;
import java.util.Arrays;

public class Vector {

    private double[] vects;

    public Vector(int length) {vects = new double[length];}

    public void setValue(int i, double value) {
        vects[i] = value;
    }

    public void setVectorValue (double[] vector) {

        for (var j = 0; j < vects.length; ++j)
        {

            vects[j] =  vector[j];
        }

    }

    public double[] getValue() {
        return vects;
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
            if (el > max )
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

    public Vector mult(int m) {


        double[] array = new double[vects.length];
        Vector result = new Vector(vects.length);


        for (var i = 0; i < vects.length; ++i) {
            array[i] = vects[i] * m;
        }
        result.setVectorValue(array);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(vects);
    }



    public double[] sum(double[] vector) {
        double[] array = new double[vects.length];
        Vector result = new Vector(vects.length);


        for (var i = 0; i < vects.length; ++i) {
            array[i] = vects[i] + vector[i];
        }
        result.setVectorValue(array);
        return array;
    }

    public Vector scalarMult(double[] vector) {
        double[] array = new double[vects.length];
        Vector result = new Vector(vects.length);


        for (var i = 0; i < vects.length; ++i) {
            array[i] = vects[i] *= vector[i];
        }
        result.setVectorValue(array);
        return result;
    }

}