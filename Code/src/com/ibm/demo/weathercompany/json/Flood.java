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
"fld_location_id",
"fld_location_name",
"fld_severity_cd",
"fld_severity",
"fld_immediate_cause_cd",
"fld_immediate_cause",
"fld_record_status_cd",
"fld_record_status",
"fld_start_dt_tm_local",
"fld_start_dt_tm_tz_abbrv",
"fld_crest_dt_tm_local",
"fld_crest_dt_tm_tz_abbrv",
"fld_end_dt_tm_local",
"fld_end_dt_tm_tz_abbrv"
})
public class Flood {

@JsonProperty("fld_location_id")
private String fldLocationId;
@JsonProperty("fld_location_name")
private String fldLocationName;
@JsonProperty("fld_severity_cd")
private String fldSeverityCd;
@JsonProperty("fld_severity")
private String fldSeverity;
@JsonProperty("fld_immediate_cause_cd")
private String fldImmediateCauseCd;
@JsonProperty("fld_immediate_cause")
private String fldImmediateCause;
@JsonProperty("fld_record_status_cd")
private String fldRecordStatusCd;
@JsonProperty("fld_record_status")
private String fldRecordStatus;
@JsonProperty("fld_start_dt_tm_local")
private String fldStartDtTmLocal;
@JsonProperty("fld_start_dt_tm_tz_abbrv")
private String fldStartDtTmTzAbbrv;
@JsonProperty("fld_crest_dt_tm_local")
private String fldCrestDtTmLocal;
@JsonProperty("fld_crest_dt_tm_tz_abbrv")
private String fldCrestDtTmTzAbbrv;
@JsonProperty("fld_end_dt_tm_local")
private String fldEndDtTmLocal;
@JsonProperty("fld_end_dt_tm_tz_abbrv")
private String fldEndDtTmTzAbbrv;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("fld_location_id")
public String getFldLocationId() {
return fldLocationId;
}

@JsonProperty("fld_location_id")
public void setFldLocationId(String fldLocationId) {
this.fldLocationId = fldLocationId;
}

@JsonProperty("fld_location_name")
public String getFldLocationName() {
return fldLocationName;
}

@JsonProperty("fld_location_name")
public void setFldLocationName(String fldLocationName) {
this.fldLocationName = fldLocationName;
}

@JsonProperty("fld_severity_cd")
public String getFldSeverityCd() {
return fldSeverityCd;
}

@JsonProperty("fld_severity_cd")
public void setFldSeverityCd(String fldSeverityCd) {
this.fldSeverityCd = fldSeverityCd;
}

@JsonProperty("fld_severity")
public String getFldSeverity() {
return fldSeverity;
}

@JsonProperty("fld_severity")
public void setFldSeverity(String fldSeverity) {
this.fldSeverity = fldSeverity;
}

@JsonProperty("fld_immediate_cause_cd")
public String getFldImmediateCauseCd() {
return fldImmediateCauseCd;
}

@JsonProperty("fld_immediate_cause_cd")
public void setFldImmediateCauseCd(String fldImmediateCauseCd) {
this.fldImmediateCauseCd = fldImmediateCauseCd;
}

@JsonProperty("fld_immediate_cause")
public String getFldImmediateCause() {
return fldImmediateCause;
}

@JsonProperty("fld_immediate_cause")
public void setFldImmediateCause(String fldImmediateCause) {
this.fldImmediateCause = fldImmediateCause;
}

@JsonProperty("fld_record_status_cd")
public String getFldRecordStatusCd() {
return fldRecordStatusCd;
}

@JsonProperty("fld_record_status_cd")
public void setFldRecordStatusCd(String fldRecordStatusCd) {
this.fldRecordStatusCd = fldRecordStatusCd;
}

@JsonProperty("fld_record_status")
public String getFldRecordStatus() {
return fldRecordStatus;
}

@JsonProperty("fld_record_status")
public void setFldRecordStatus(String fldRecordStatus) {
this.fldRecordStatus = fldRecordStatus;
}

@JsonProperty("fld_start_dt_tm_local")
public String getFldStartDtTmLocal() {
return fldStartDtTmLocal;
}

@JsonProperty("fld_start_dt_tm_local")
public void setFldStartDtTmLocal(String fldStartDtTmLocal) {
this.fldStartDtTmLocal = fldStartDtTmLocal;
}

@JsonProperty("fld_start_dt_tm_tz_abbrv")
public String getFldStartDtTmTzAbbrv() {
return fldStartDtTmTzAbbrv;
}

@JsonProperty("fld_start_dt_tm_tz_abbrv")
public void setFldStartDtTmTzAbbrv(String fldStartDtTmTzAbbrv) {
this.fldStartDtTmTzAbbrv = fldStartDtTmTzAbbrv;
}

@JsonProperty("fld_crest_dt_tm_local")
public String getFldCrestDtTmLocal() {
return fldCrestDtTmLocal;
}

@JsonProperty("fld_crest_dt_tm_local")
public void setFldCrestDtTmLocal(String fldCrestDtTmLocal) {
this.fldCrestDtTmLocal = fldCrestDtTmLocal;
}

@JsonProperty("fld_crest_dt_tm_tz_abbrv")
public String getFldCrestDtTmTzAbbrv() {
return fldCrestDtTmTzAbbrv;
}

@JsonProperty("fld_crest_dt_tm_tz_abbrv")
public void setFldCrestDtTmTzAbbrv(String fldCrestDtTmTzAbbrv) {
this.fldCrestDtTmTzAbbrv = fldCrestDtTmTzAbbrv;
}

@JsonProperty("fld_end_dt_tm_local")
public String getFldEndDtTmLocal() {
return fldEndDtTmLocal;
}

@JsonProperty("fld_end_dt_tm_local")
public void setFldEndDtTmLocal(String fldEndDtTmLocal) {
this.fldEndDtTmLocal = fldEndDtTmLocal;
}

@JsonProperty("fld_end_dt_tm_tz_abbrv")
public String getFldEndDtTmTzAbbrv() {
return fldEndDtTmTzAbbrv;
}

@JsonProperty("fld_end_dt_tm_tz_abbrv")
public void setFldEndDtTmTzAbbrv(String fldEndDtTmTzAbbrv) {
this.fldEndDtTmTzAbbrv = fldEndDtTmTzAbbrv;
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