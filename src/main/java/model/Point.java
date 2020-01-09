package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Point implements Serializable
{

    @SerializedName("metric")
    @Expose
    private String metric;
    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("label")
    @Expose
    private int label;
    @SerializedName("sr")
    @Expose
    private double sr;
    @SerializedName("rate")
    @Expose
    private double rate;
    @SerializedName("gs")
    @Expose
    private double gs;
    @SerializedName("load")
    @Expose
    private String load;
    private final static long serialVersionUID = 174715607734863931L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Point() {
    }

    /**
     *
     * @param load
     * @param metric
     * @param rate
     * @param label
     * @param gs
     * @param timestamp
     * @param sr
     */
    public Point(String metric, long timestamp, int label, double sr, double rate, double gs, String load) {
        super();
        this.metric = metric;
        this.timestamp = timestamp;
        this.label = label;
        this.sr = sr;
        this.rate = rate;
        this.gs = gs;
        this.load = load;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public Point withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Point withTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public Point withLabel(int label) {
        this.label = label;
        return this;
    }

    public double getSr() {
        return sr;
    }

    public void setSr(double sr) {
        this.sr = sr;
    }

    public Point withSr(double sr) {
        this.sr = sr;
        return this;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Point withRate(double rate) {
        this.rate = rate;
        return this;
    }

    public double getGs() {
        return gs;
    }

    public void setGs(double gs) {
        this.gs = gs;
    }

    public Point withGs(double gs) {
        this.gs = gs;
        return this;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public Point withLoad(String load) {
        this.load = load;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metric", metric).append("timestamp", timestamp).append("label", label).append("sr", sr).append("rate", rate).append("gs", gs).append("load", load).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(load).append(metric).append(rate).append(label).append(gs).append(timestamp).append(sr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Point) == false) {
            return false;
        }
        Point rhs = ((Point) other);
        return new EqualsBuilder().append(load, rhs.load).append(metric, rhs.metric).append(rate, rhs.rate).append(label, rhs.label).append(gs, rhs.gs).append(timestamp, rhs.timestamp).append(sr, rhs.sr).isEquals();
    }

}