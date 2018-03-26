package net.alhazmy13.wordcloud;


/**
 * Created by Alhazmy13 on 11/2/16.
 * AndroidWordClouds
 */
public class WordCloud {

    /**
     * The Text.
     */
    String text;
    /**
     * The Weight.
     */
    int weight;

    /**
     * Word Color
     */
    String color;


    /**
     * Instantiates a new WordCloud.
     *
     * @param text   the text
     * @param weight the weight
     */
    public WordCloud(String text, int weight) {
        this.text = text;
        this.weight = weight;
    }

    /**
     * Instantiates a new WordCloud.
     *
     * @param text   the text
     * @param weight the weight
     * @param color  the color
     */
    public WordCloud(String text, int weight, String color) {
        this.text = text;
        this.weight = weight;
        this.color = color;
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
