
package sdkontologyjmc;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: ElectronicAnnotationResults</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "report_name",
    "report_ref",
    "output_genome_ref",
    "n_total_features",
    "n_features_mapped"
})
public class ElectronicAnnotationResults {

    @JsonProperty("report_name")
    private String reportName;
    @JsonProperty("report_ref")
    private String reportRef;
    @JsonProperty("output_genome_ref")
    private String outputGenomeRef;
    @JsonProperty("n_total_features")
    private Long nTotalFeatures;
    @JsonProperty("n_features_mapped")
    private Long nFeaturesMapped;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("report_name")
    public String getReportName() {
        return reportName;
    }

    @JsonProperty("report_name")
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public ElectronicAnnotationResults withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    @JsonProperty("report_ref")
    public String getReportRef() {
        return reportRef;
    }

    @JsonProperty("report_ref")
    public void setReportRef(String reportRef) {
        this.reportRef = reportRef;
    }

    public ElectronicAnnotationResults withReportRef(String reportRef) {
        this.reportRef = reportRef;
        return this;
    }

    @JsonProperty("output_genome_ref")
    public String getOutputGenomeRef() {
        return outputGenomeRef;
    }

    @JsonProperty("output_genome_ref")
    public void setOutputGenomeRef(String outputGenomeRef) {
        this.outputGenomeRef = outputGenomeRef;
    }

    public ElectronicAnnotationResults withOutputGenomeRef(String outputGenomeRef) {
        this.outputGenomeRef = outputGenomeRef;
        return this;
    }

    @JsonProperty("n_total_features")
    public Long getNTotalFeatures() {
        return nTotalFeatures;
    }

    @JsonProperty("n_total_features")
    public void setNTotalFeatures(Long nTotalFeatures) {
        this.nTotalFeatures = nTotalFeatures;
    }

    public ElectronicAnnotationResults withNTotalFeatures(Long nTotalFeatures) {
        this.nTotalFeatures = nTotalFeatures;
        return this;
    }

    @JsonProperty("n_features_mapped")
    public Long getNFeaturesMapped() {
        return nFeaturesMapped;
    }

    @JsonProperty("n_features_mapped")
    public void setNFeaturesMapped(Long nFeaturesMapped) {
        this.nFeaturesMapped = nFeaturesMapped;
    }

    public ElectronicAnnotationResults withNFeaturesMapped(Long nFeaturesMapped) {
        this.nFeaturesMapped = nFeaturesMapped;
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
        return ((((((((((((("ElectronicAnnotationResults"+" [reportName=")+ reportName)+", reportRef=")+ reportRef)+", outputGenomeRef=")+ outputGenomeRef)+", nTotalFeatures=")+ nTotalFeatures)+", nFeaturesMapped=")+ nFeaturesMapped)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
