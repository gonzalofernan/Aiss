
package aiss.football;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_links",
    "name",
    "code",
    "shortName",
    "squadMarketValue",
    "crestUrl"
})
public class Team {

    @JsonProperty("_links")
    private Links links;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("squadMarketValue")
    private Object squadMarketValue;
    @JsonProperty("crestUrl")
    private String crestUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("squadMarketValue")
    public Object getSquadMarketValue() {
        return squadMarketValue;
    }

    @JsonProperty("squadMarketValue")
    public void setSquadMarketValue(Object squadMarketValue) {
        this.squadMarketValue = squadMarketValue;
    }

    @JsonProperty("crestUrl")
    public String getCrestUrl() {
        return crestUrl;
    }

    @JsonProperty("crestUrl")
    public void setCrestUrl(String crestUrl) {
        this.crestUrl = crestUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
