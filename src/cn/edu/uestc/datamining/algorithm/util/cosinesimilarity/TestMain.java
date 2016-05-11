package cn.edu.uestc.datamining.algorithm.util.cosinesimilarity;

/** Created by LCJ on 2016-05-11.*/
public class TestMain {
    public static void main(String[] args)
    {
        String s1 = "The Flash Can Beat Zoom.";
        String s2 = "The Flash Can Not Beat Zoom.";
        CosineSimilarity cs = new CosineSimilarity(s1, s2);
        System.out.println(cs.calcCosineSimilarity());
    }
}
