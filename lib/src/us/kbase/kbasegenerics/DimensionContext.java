
package us.kbase.kbasegenerics;

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
 * <p>Original spec-file type: DimensionContext</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "data_type",
    "size",
    "typed_values"
})
public class DimensionContext {

    /**
     * <p>Original spec-file type: Term</p>
     * <pre>
     * @optional oterm_ref oterm_name
     * </pre>
     * 
     */
    @JsonProperty("data_type")
    private Term dataType;
    @JsonProperty("size")
    private Long size;
    @JsonProperty("typed_values")
    private List<TypedValues> typedValues;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * <p>Original spec-file type: Term</p>
     * <pre>
     * @optional oterm_ref oterm_name
     * </pre>
     * 
     */
    @JsonProperty("data_type")
    public Term getDataType() {
        return dataType;
    }

    /**
     * <p>Original spec-file type: Term</p>
     * <pre>
     * @optional oterm_ref oterm_name
     * </pre>
     * 
     */
    @JsonProperty("data_type")
    public void setDataType(Term dataType) {
        this.dataType = dataType;
    }

    public DimensionContext withDataType(Term dataType) {
        this.dataType = dataType;
        return this;
    }

    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Long size) {
        this.size = size;
    }

    public DimensionContext withSize(Long size) {
        this.size = size;
        return this;
    }

    @JsonProperty("typed_values")
    public List<TypedValues> getTypedValues() {
        return typedValues;
    }

    @JsonProperty("typed_values")
    public void setTypedValues(List<TypedValues> typedValues) {
        this.typedValues = typedValues;
    }

    public DimensionContext withTypedValues(List<TypedValues> typedValues) {
        this.typedValues = typedValues;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((("DimensionContext"+" [dataType=")+ dataType)+", size=")+ size)+", typedValues=")+ typedValues)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
