package org.gmelo.investigation.model;

import com.sun.javafx.sg.prism.NGShape;

import java.time.LocalDateTime;

/**
 * Created by gmelo on 12/04/17.
 */
public class SampleModel extends Model {

    private final String id;
    private final String field1;
    private final String field2;
    private final LocalDateTime timestamp;
    private final double value;
    private final double anotherValue;
    private final String field3;

    private SampleModel(Builder builder) {
        id = builder.id;
        field1 = builder.field1;
        field2 = builder.field2;
        timestamp = builder.timestamp;
        value = builder.value;
        anotherValue = builder.anotherValue;
        field3 = builder.field3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public double getValue() {
        return value;
    }

    public double getAnotherValue() {
        return anotherValue;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SampleModel that = (SampleModel) o;

        if (Double.compare(that.anotherValue, anotherValue) != 0) return false;
        if (Double.compare(that.value, value) != 0) return false;
        if (field1 != null ? !field1.equals(that.field1) : that.field1 != null) return false;
        if (field2 != null ? !field2.equals(that.field2) : that.field2 != null) return false;
        if (field3 != null ? !field3.equals(that.field3) : that.field3 != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (field1 != null ? field1.hashCode() : 0);
        result = 31 * result + (field2 != null ? field2.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(anotherValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (field3 != null ? field3.hashCode() : 0);
        return result;
    }

    @Override
    public String getInsertStatement() {
        StringBuilder sb = new StringBuilder("INSERT INTO sampleModel (");
        sb.append("id")
                .append(",")
                .append(" ")
                .append("field1")
                .append(",")
                .append(" ")
                .append("field2")
                .append(",")
                .append(" ")
                .append("timestamp")
                .append(",")
                .append(" ")
                .append("value")
                .append(",")
                .append(" ")
                .append("anotherValue")
                .append(",")
                .append(" ")
                .append("field3")
                .append(")")
                .append(" VALUES (")
                .append(id)
                .append(",")
                .append(" ")
                .append(field1)
                .append(",")
                .append(" ")
                .append(field2)
                .append(",")
                .append(" ")
                .append(timestamp)
                .append(",")
                .append(" ")
                .append(value)
                .append(",")
                .append(" ")
                .append(anotherValue)
                .append(",")
                .append(" ")
                .append(field3)
                .append(")");

        return sb.toString();
    }

    public static final class Builder {
        private String id;
        private String field1;
        private String field2;
        private LocalDateTime timestamp;
        private double value;
        private double anotherValue;
        private String field3;

        private Builder() {
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withField1(String field1) {
            this.field1 = field1;
            return this;
        }

        public Builder withField2(String field2) {
            this.field2 = field2;
            return this;
        }

        public Builder withTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder withValue(double value) {
            this.value = value;
            return this;
        }

        public Builder withAnotherValue(double anotherValue) {
            this.anotherValue = anotherValue;
            return this;
        }

        public Builder withField3(String field3) {
            this.field3 = field3;
            return this;
        }

        public SampleModel build() {
            return new SampleModel(this);
        }
    }
}
