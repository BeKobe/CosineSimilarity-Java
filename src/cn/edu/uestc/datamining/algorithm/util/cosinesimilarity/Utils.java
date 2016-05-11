package cn.edu.uestc.datamining.algorithm.util.cosinesimilarity;

import java.util.ArrayList;

/** Created by LCJ on 2016-05-11.*/
@SuppressWarnings("WeakerAccess")
public class Utils {

    /**
     * 求向量内积
     * */
    private static double calcVectorInnerProduct(ArrayList<Double> a,
                                                 ArrayList<Double> b)
    {
        if (a.size() != b.size())
        {
            throw new IndexOutOfBoundsException("向量维度不一致, 无法求内积!\n");
        }

        int size = a.size();
        double innerProduct = 0.0;
        for (int i=0; i<size; i++)
        {
            innerProduct += (a.get(i) * b.get(i));
        }
        return innerProduct;
    }

    /**
     * 求向量模
     * */
    private static double calcVectorModulusLength(ArrayList<Double> a)
    {
        double squareSum = 0.0;
        for (Double anA : a) {
            squareSum += Math.pow(anA, 2);
        }
        return Math.sqrt(squareSum);
    }

    /**
     * 求向量夹角余弦值
     * */
    public static double calcVectorCosineIncludedAngle(ArrayList<Double> a,
                                                        ArrayList<Double> b)
    {
        double innerProduct = calcVectorInnerProduct(a, b);
        return innerProduct / (calcVectorModulusLength(a) * calcVectorModulusLength(b));
    }
}
