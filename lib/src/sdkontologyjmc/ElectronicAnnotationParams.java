
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
 * <p>Original spec-file type: ElectronicAnnotationParams</p>
 * <pre>
 * workspace - the name of the workspace for input/output
 * input_genome - reference to the input genome object
 * ontology_translation - optional reference to user specified ontology translation map
 * output_genome - the name of the mapped genome annotation object
 * @optional ontology_translation
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace",
    "input_genome",
    "ontology_translation",
    "translation_behavior",
    "custom_translation",
    "clear_existing",
    "output_genome"
})
public class ElectronicAnnotationParams {

    @JsonProperty("workspace")
    private String workspace;
    @JsonProperty("input_genome")
    private String inputGenome;
    @JsonProperty("ontology_translation")
    private String ontologyTranslation;
    @JsonProperty("translation_behavior")
    private String translationBehavior;
    @JsonProperty("custom_translation")
    private String customTranslation;
    @JsonProperty("clear_existing")
    private String clearExisting;
    @JsonProperty("output_genome")
    private String outputGenome;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ElectronicAnnotationParams withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("input_genome")
    public String getInputGenome() {
        return inputGenome;
    }

    @JsonProperty("input_genome")
    public void setInputGenome(String inputGenome) {
        this.inputGenome = inputGenome;
    }

    public ElectronicAnnotationParams withInputGenome(String inputGenome) {
        this.inputGenome = inputGenome;
        return this;
    }

    @JsonProperty("ontology_translation")
    public String getOntologyTranslation() {
        return ontologyTranslation;
    }

    @JsonProperty("ontology_translation")
    public void setOntologyTranslation(String ontologyTranslation) {
        this.ontologyTranslation = ontologyTranslation;
    }

    public ElectronicAnnotationParams withOntologyTranslation(String ontologyTranslation) {
        this.ontologyTranslation = ontologyTranslation;
        return this;
    }

    @JsonProperty("translation_behavior")
    public String getTranslationBehavior() {
        return translationBehavior;
    }

    @JsonProperty("translation_behavior")
    public void setTranslationBehavior(String translationBehavior) {
        this.translationBehavior = translationBehavior;
    }

    public ElectronicAnnotationParams withTranslationBehavior(String translationBehavior) {
        this.translationBehavior = translationBehavior;
        return this;
    }

    @JsonProperty("custom_translation")
    public String getCustomTranslation() {
        return customTranslation;
    }

    @JsonProperty("custom_translation")
    public void setCustomTranslation(String customTranslation) {
        this.customTranslation = customTranslation;
    }

    public ElectronicAnnotationParams withCustomTranslation(String customTranslation) {
        this.customTranslation = customTranslation;
        return this;
    }

    @JsonProperty("clear_existing")
    public String getClearExisting() {
        return clearExisting;
    }

    @JsonProperty("clear_existing")
    public void setClearExisting(String clearExisting) {
        this.clearExisting = clearExisting;
    }

    public ElectronicAnnotationParams withClearExisting(String clearExisting) {
        this.clearExisting = clearExisting;
        return this;
    }

    @JsonProperty("output_genome")
    public String getOutputGenome() {
        return outputGenome;
    }

    @JsonProperty("output_genome")
    public void setOutputGenome(String outputGenome) {
        this.outputGenome = outputGenome;
    }

    public ElectronicAnnotationParams withOutputGenome(String outputGenome) {
        this.outputGenome = outputGenome;
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
        return ((((((((((((((((("ElectronicAnnotationParams"+" [workspace=")+ workspace)+", inputGenome=")+ inputGenome)+", ontologyTranslation=")+ ontologyTranslation)+", translationBehavior=")+ translationBehavior)+", customTranslation=")+ customTranslation)+", clearExisting=")+ clearExisting)+", outputGenome=")+ outputGenome)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
