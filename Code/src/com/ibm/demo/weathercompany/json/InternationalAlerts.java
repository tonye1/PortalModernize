package com.ibm.demo.weathercompany.json;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.demo.weathercompany.json.Alert;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"metadata",
"alerts"
})
public class InternationalAlerts {

@JsonProperty("metadata")
private Metadata metadata;
@JsonProperty("alerts")
private List<Alert> alerts = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("metadata")
public Metadata getMetadata() {
return metadata;
}

@JsonProperty("metadata")
public void setMetadata(Metadata metadata) {
this.metadata = metadata;
}

@JsonProperty("alerts")
public List<Alert> getAlerts() {
return alerts;
}

@JsonProperty("alerts")
public void setAlerts(List<Alert> alerts) {
this.alerts = alerts;
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
