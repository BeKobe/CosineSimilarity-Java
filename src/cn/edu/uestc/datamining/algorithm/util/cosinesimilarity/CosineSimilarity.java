package cn.edu.uestc.datamining.algorithm.util.cosinesimilarity;

/** Created by LCJ on 2016-05-11.*/
@SuppressWarnings("WeakerAccess")
public class CosineSimilarity {
    private String sentence1;
    private String sentence2;

    CosineSimilarity(String s1, String s2)
    {
        this.sentence1 = s1;
        this.sentence2 = s2;
    }

    public double calcCosineSimilarity()
    {
        EnglishTextProcessing.getWordFrequencyVector(sentence1, sentence2);
        return Utils.calcVectorCosineIncludedAngle(
                EnglishTextProcessing.getVector1(),
                EnglishTextProcessing.getVector2()
        );
    }
}
