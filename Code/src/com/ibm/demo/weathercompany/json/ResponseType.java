package com.ibm.demo.weathercompany.json;


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
"response_type",
"response_type_cd"
})
public class ResponseType {

@JsonProperty("response_type")
private String responseType;
@JsonProperty("response_type_cd")
private Integer responseTypeCd;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("response_type")
public String getResponseType() {
return responseType;
}

@JsonProperty("response_type")
public void setResponseType(String responseType) {
this.responseType = responseType;
}

@JsonProperty("response_type_cd")
public Integer getResponseTypeCd() {
return responseTypeCd;
}

@JsonProperty("response_type_cd")
public void setResponseTypeCd(Integer responseTypeCd) {
this.responseTypeCd = responseTypeCd;
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
