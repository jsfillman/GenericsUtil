
package us.kbase.genericsutil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: GetGenericDataResult</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "series_labels",
    "values_x",
    "values_y"
})
public class GetGenericDataResult {

    @JsonProperty("series_labels")
    private List<String> seriesLabels;
    @JsonProperty("values_x")
    private List<us.kbase.kbasegenerics.Values> valuesX;
    @JsonProperty("values_y")
    private List<us.kbase.kbasegenerics.Values> valuesY;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("series_labels")
    public List<String> getSeriesLabels() {
        return seriesLabels;
    }

    @JsonProperty("series_labels")
    public void setSeriesLabels(List<String> seriesLabels) {
        this.seriesLabels = seriesLabels;
    }

    public GetGenericDataResult withSeriesLabels(List<String> seriesLabels) {
        this.seriesLabels = seriesLabels;
        return this;
    }

    @JsonProperty("values_x")
    public List<us.kbase.kbasegenerics.Values> getValuesX() {
        return valuesX;
    }

    @JsonProperty("values_x")
    public void setValuesX(List<us.kbase.kbasegenerics.Values> valuesX) {
        this.valuesX = valuesX;
    }

    public GetGenericDataResult withValuesX(List<us.kbase.kbasegenerics.Values> valuesX) {
        this.valuesX = valuesX;
        return this;
    }

    @JsonProperty("values_y")
    public List<us.kbase.kbasegenerics.Values> getValuesY() {
        return valuesY;
    }

    @JsonProperty("values_y")
    public void setValuesY(List<us.kbase.kbasegenerics.Values> valuesY) {
        this.valuesY = valuesY;
    }

    public GetGenericDataResult withValuesY(List<us.kbase.kbasegenerics.Values> valuesY) {
        this.valuesY = valuesY;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((("GetGenericDataResult"+" [seriesLabels=")+ seriesLabels)+", valuesX=")+ valuesX)+", valuesY=")+ valuesY)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
