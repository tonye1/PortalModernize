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
"language",
"transaction_id",
"version",
"state_cd",
"country_cd",
"expire_time_gmt",
"status_code"
})
public class Metadata {

@JsonProperty("language")
private String language;
@JsonProperty("transaction_id")
private String transactionId;
@JsonProperty("version")
private String version;
@JsonProperty("state_cd")
private String stateCd;
@JsonProperty("country_cd")
private String countryCd;
@JsonProperty("expire_time_gmt")
private Integer expireTimeGmt;
@JsonProperty("status_code")
private Integer statusCode;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("language")
public String getLanguage() {
return language;
}

@JsonProperty("language")
public void setLanguage(String language) {
this.language = language;
}

@JsonProperty("transaction_id")
public String getTransactionId() {
return transactionId;
}

@JsonProperty("transaction_id")
public void setTransactionId(String transactionId) {
this.transactionId = transactionId;
}

@JsonProperty("version")
public String getVersion() {
return version;
}

@JsonProperty("version")
public void setVersion(String version) {
this.version = version;
}

@JsonProperty("state_cd")
public String getStateCd() {
return stateCd;
}

@JsonProperty("state_cd")
public void setStateCd(String stateCd) {
this.stateCd = stateCd;
}

@JsonProperty("country_cd")
public String getCountryCd() {
return countryCd;
}

@JsonProperty("country_cd")
public void setCountryCd(String countryCd) {
this.countryCd = countryCd;
}

@JsonProperty("expire_time_gmt")
public Integer getExpireTimeGmt() {
return expireTimeGmt;
}

@JsonProperty("expire_time_gmt")
public void setExpireTimeGmt(Integer expireTimeGmt) {
this.expireTimeGmt = expireTimeGmt;
}

@JsonProperty("status_code")
public Integer getStatusCode() {
return statusCode;
}

@JsonProperty("status_code")
public void setStatusCode(Integer statusCode) {
this.statusCode = statusCode;
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