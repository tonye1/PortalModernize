

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"key",
"class",
"msg_type_cd",
"msg_type",
"pil",
"phenomena",
"significance",
"etn",
"office_cd",
"office_name",
"office_st_cd",
"office_cntry_cd",
"event_desc",
"severity_cd",
"severity",
"categories",
"response_types",
"urgency",
"urgency_cd",
"certainty",
"certainty_cd",
"effective_dt_tm_local",
"effective_dt_tm_tz_abbrv",
"expire_dt_tm_local",
"expire_dt_tm_tz_abbrv",
"expire_time_gmt",
"onset_dt_tm_local",
"onset_dt_tm_tz_abbrv",
"flood",
"area_type",
"lat",
"lon",
"area_id",
"area_name",
"st_cd",
"st_name",
"cntry_cd",
"cntry_name",
"headline_text",
"detail_key",
"source",
"disclaimer",
"issue_dt_tm_local",
"issue_dt_tm_tz_abbrv",
"identifier",
"proc_dt_tm_local",
"proc_dt_tm_tz_abbrv"
})
public class Alert {

@JsonProperty("key")
private String key;
@JsonProperty("class")
private String _class;
@JsonProperty("msg_type_cd")
private Integer msgTypeCd;
@JsonProperty("msg_type")
private String msgType;
@JsonProperty("pil")
private String pil;
@JsonProperty("phenomena")
private String phenomena;
@JsonProperty("significance")
private String significance;
@JsonProperty("etn")
private String etn;
@JsonProperty("office_cd")
private String officeCd;
@JsonProperty("office_name")
private String officeName;
@JsonProperty("office_st_cd")
private String officeStCd;
@JsonProperty("office_cntry_cd")
private String officeCntryCd;
@JsonProperty("event_desc")
private String eventDesc;
@JsonProperty("severity_cd")
private Integer severityCd;
@JsonProperty("severity")
private String severity;
@JsonProperty("categories")
private List<Category> categories = null;
@JsonProperty("response_types")
private List<ResponseType> responseTypes = null;
@JsonProperty("urgency")
private String urgency;
@JsonProperty("urgency_cd")
private Integer urgencyCd;
@JsonProperty("certainty")
private String certainty;
@JsonProperty("certainty_cd")
private Integer certaintyCd;
@JsonProperty("effective_dt_tm_local")
private Object effectiveDtTmLocal;
@JsonProperty("effective_dt_tm_tz_abbrv")
private Object effectiveDtTmTzAbbrv;
@JsonProperty("expire_dt_tm_local")
private String expireDtTmLocal;
@JsonProperty("expire_dt_tm_tz_abbrv")
private String expireDtTmTzAbbrv;
@JsonProperty("expire_time_gmt")
private Integer expireTimeGmt;
@JsonProperty("onset_dt_tm_local")
private Object onsetDtTmLocal;
@JsonProperty("onset_dt_tm_tz_abbrv")
private Object onsetDtTmTzAbbrv;
@JsonProperty("flood")
private Flood flood;
@JsonProperty("area_type")
private String areaType;
@JsonProperty("lat")
private Double lat;
@JsonProperty("lon")
private Double lon;
@JsonProperty("area_id")
private String areaId;
@JsonProperty("area_name")
private String areaName;
@JsonProperty("st_cd")
private String stCd;
@JsonProperty("st_name")
private String stName;
@JsonProperty("cntry_cd")
private String cntryCd;
@JsonProperty("cntry_name")
private String cntryName;
@JsonProperty("headline_text")
private String headlineText;
@JsonProperty("detail_key")
private String detailKey;
@JsonProperty("source")
private String source;
@JsonProperty("disclaimer")
private Object disclaimer;
@JsonProperty("issue_dt_tm_local")
private String issueDtTmLocal;
@JsonProperty("issue_dt_tm_tz_abbrv")
private String issueDtTmTzAbbrv;
@JsonProperty("identifier")
private String identifier;
@JsonProperty("proc_dt_tm_local")
private String procDtTmLocal;
@JsonProperty("proc_dt_tm_tz_abbrv")
private String procDtTmTzAbbrv;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("key")
public String getKey() {
return key;
}

@JsonProperty("key")
public void setKey(String key) {
this.key = key;
}

@JsonProperty("class")
public String getClass_() {
return _class;
}

@JsonProperty("class")
public void setClass_(String _class) {
this._class = _class;
}

@JsonProperty("msg_type_cd")
public Integer getMsgTypeCd() {
return msgTypeCd;
}

@JsonProperty("msg_type_cd")
public void setMsgTypeCd(Integer msgTypeCd) {
this.msgTypeCd = msgTypeCd;
}

@JsonProperty("msg_type")
public String getMsgType() {
return msgType;
}

@JsonProperty("msg_type")
public void setMsgType(String msgType) {
this.msgType = msgType;
}

@JsonProperty("pil")
public String getPil() {
return pil;
}

@JsonProperty("pil")
public void setPil(String pil) {
this.pil = pil;
}

@JsonProperty("phenomena")
public String getPhenomena() {
return phenomena;
}

@JsonProperty("phenomena")
public void setPhenomena(String phenomena) {
this.phenomena = phenomena;
}

@JsonProperty("significance")
public String getSignificance() {
return significance;
}

@JsonProperty("significance")
public void setSignificance(String significance) {
this.significance = significance;
}

@JsonProperty("etn")
public String getEtn() {
return etn;
}

@JsonProperty("etn")
public void setEtn(String etn) {
this.etn = etn;
}

@JsonProperty("office_cd")
public String getOfficeCd() {
return officeCd;
}

@JsonProperty("office_cd")
public void setOfficeCd(String officeCd) {
this.officeCd = officeCd;
}

@JsonProperty("office_name")
public String getOfficeName() {
return officeName;
}

@JsonProperty("office_name")
public void setOfficeName(String officeName) {
this.officeName = officeName;
}

@JsonProperty("office_st_cd")
public String getOfficeStCd() {
return officeStCd;
}

@JsonProperty("office_st_cd")
public void setOfficeStCd(String officeStCd) {
this.officeStCd = officeStCd;
}

@JsonProperty("office_cntry_cd")
public String getOfficeCntryCd() {
return officeCntryCd;
}

@JsonProperty("office_cntry_cd")
public void setOfficeCntryCd(String officeCntryCd) {
this.officeCntryCd = officeCntryCd;
}

@JsonProperty("event_desc")
public String getEventDesc() {
return eventDesc;
}

@JsonProperty("event_desc")
public void setEventDesc(String eventDesc) {
this.eventDesc = eventDesc;
}

@JsonProperty("severity_cd")
public Integer getSeverityCd() {
return severityCd;
}

@JsonProperty("severity_cd")
public void setSeverityCd(Integer severityCd) {
this.severityCd = severityCd;
}

@JsonProperty("severity")
public String getSeverity() {
return severity;
}

@JsonProperty("severity")
public void setSeverity(String severity) {
this.severity = severity;
}

@JsonProperty("categories")
public List<Category> getCategories() {
return categories;
}

@JsonProperty("categories")
public void setCategories(List<Category> categories) {
this.categories = categories;
}

@JsonProperty("response_types")
public List<ResponseType> getResponseTypes() {
return responseTypes;
}

@JsonProperty("response_types")
public void setResponseTypes(List<ResponseType> responseTypes) {
this.responseTypes = responseTypes;
}

@JsonProperty("urgency")
public String getUrgency() {
return urgency;
}

@JsonProperty("urgency")
public void setUrgency(String urgency) {
this.urgency = urgency;
}

@JsonProperty("urgency_cd")
public Integer getUrgencyCd() {
return urgencyCd;
}

@JsonProperty("urgency_cd")
public void setUrgencyCd(Integer urgencyCd) {
this.urgencyCd = urgencyCd;
}

@JsonProperty("certainty")
public String getCertainty() {
return certainty;
}

@JsonProperty("certainty")
public void setCertainty(String certainty) {
this.certainty = certainty;
}

@JsonProperty("certainty_cd")
public Integer getCertaintyCd() {
return certaintyCd;
}

@JsonProperty("certainty_cd")
public void setCertaintyCd(Integer certaintyCd) {
this.certaintyCd = certaintyCd;
}

@JsonProperty("effective_dt_tm_local")
public Object getEffectiveDtTmLocal() {
return effectiveDtTmLocal;
}

@JsonProperty("effective_dt_tm_local")
public void setEffectiveDtTmLocal(Object effectiveDtTmLocal) {
this.effectiveDtTmLocal = effectiveDtTmLocal;
}

@JsonProperty("effective_dt_tm_tz_abbrv")
public Object getEffectiveDtTmTzAbbrv() {
return effectiveDtTmTzAbbrv;
}

@JsonProperty("effective_dt_tm_tz_abbrv")
public void setEffectiveDtTmTzAbbrv(Object effectiveDtTmTzAbbrv) {
this.effectiveDtTmTzAbbrv = effectiveDtTmTzAbbrv;
}

@JsonProperty("expire_dt_tm_local")
public String getExpireDtTmLocal() {
return expireDtTmLocal;
}

@JsonProperty("expire_dt_tm_local")
public void setExpireDtTmLocal(String expireDtTmLocal) {
this.expireDtTmLocal = expireDtTmLocal;
}

@JsonProperty("expire_dt_tm_tz_abbrv")
public String getExpireDtTmTzAbbrv() {
return expireDtTmTzAbbrv;
}

@JsonProperty("expire_dt_tm_tz_abbrv")
public void setExpireDtTmTzAbbrv(String expireDtTmTzAbbrv) {
this.expireDtTmTzAbbrv = expireDtTmTzAbbrv;
}

@JsonProperty("expire_time_gmt")
public Integer getExpireTimeGmt() {
return expireTimeGmt;
}

@JsonProperty("expire_time_gmt")
public void setExpireTimeGmt(Integer expireTimeGmt) {
this.expireTimeGmt = expireTimeGmt;
}

@JsonProperty("onset_dt_tm_local")
public Object getOnsetDtTmLocal() {
return onsetDtTmLocal;
}

@JsonProperty("onset_dt_tm_local")
public void setOnsetDtTmLocal(Object onsetDtTmLocal) {
this.onsetDtTmLocal = onsetDtTmLocal;
}

@JsonProperty("onset_dt_tm_tz_abbrv")
public Object getOnsetDtTmTzAbbrv() {
return onsetDtTmTzAbbrv;
}

@JsonProperty("onset_dt_tm_tz_abbrv")
public void setOnsetDtTmTzAbbrv(Object onsetDtTmTzAbbrv) {
this.onsetDtTmTzAbbrv = onsetDtTmTzAbbrv;
}

@JsonProperty("flood")
public Flood getFlood() {
return flood;
}

@JsonProperty("flood")
public void setFlood(Flood flood) {
this.flood = flood;
}

@JsonProperty("area_type")
public String getAreaType() {
return areaType;
}

@JsonProperty("area_type")
public void setAreaType(String areaType) {
this.areaType = areaType;
}

@JsonProperty("lat")
public Double getLat() {
return lat;
}

@JsonProperty("lat")
public void setLat(Double lat) {
this.lat = lat;
}

@JsonProperty("lon")
public Double getLon() {
return lon;
}

@JsonProperty("lon")
public void setLon(Double lon) {
this.lon = lon;
}

@JsonProperty("area_id")
public String getAreaId() {
return areaId;
}

@JsonProperty("area_id")
public void setAreaId(String areaId) {
this.areaId = areaId;
}

@JsonProperty("area_name")
public String getAreaName() {
return areaName;
}

@JsonProperty("area_name")
public void setAreaName(String areaName) {
this.areaName = areaName;
}

@JsonProperty("st_cd")
public String getStCd() {
return stCd;
}

@JsonProperty("st_cd")
public void setStCd(String stCd) {
this.stCd = stCd;
}

@JsonProperty("st_name")
public String getStName() {
return stName;
}

@JsonProperty("st_name")
public void setStName(String stName) {
this.stName = stName;
}

@JsonProperty("cntry_cd")
public String getCntryCd() {
return cntryCd;
}

@JsonProperty("cntry_cd")
public void setCntryCd(String cntryCd) {
this.cntryCd = cntryCd;
}

@JsonProperty("cntry_name")
public String getCntryName() {
return cntryName;
}

@JsonProperty("cntry_name")
public void setCntryName(String cntryName) {
this.cntryName = cntryName;
}

@JsonProperty("headline_text")
public String getHeadlineText() {
return headlineText;
}

@JsonProperty("headline_text")
public void setHeadlineText(String headlineText) {
this.headlineText = headlineText;
}

@JsonProperty("detail_key")
public String getDetailKey() {
return detailKey;
}

@JsonProperty("detail_key")
public void setDetailKey(String detailKey) {
this.detailKey = detailKey;
}

@JsonProperty("source")
public String getSource() {
return source;
}

@JsonProperty("source")
public void setSource(String source) {
this.source = source;
}

@JsonProperty("disclaimer")
public Object getDisclaimer() {
return disclaimer;
}

@JsonProperty("disclaimer")
public void setDisclaimer(Object disclaimer) {
this.disclaimer = disclaimer;
}

@JsonProperty("issue_dt_tm_local")
public String getIssueDtTmLocal() {
return issueDtTmLocal;
}

@JsonProperty("issue_dt_tm_local")
public void setIssueDtTmLocal(String issueDtTmLocal) {
this.issueDtTmLocal = issueDtTmLocal;
}

@JsonProperty("issue_dt_tm_tz_abbrv")
public String getIssueDtTmTzAbbrv() {
return issueDtTmTzAbbrv;
}

@JsonProperty("issue_dt_tm_tz_abbrv")
public void setIssueDtTmTzAbbrv(String issueDtTmTzAbbrv) {
this.issueDtTmTzAbbrv = issueDtTmTzAbbrv;
}

@JsonProperty("identifier")
public String getIdentifier() {
return identifier;
}

@JsonProperty("identifier")
public void setIdentifier(String identifier) {
this.identifier = identifier;
}

@JsonProperty("proc_dt_tm_local")
public String getProcDtTmLocal() {
return procDtTmLocal;
}

@JsonProperty("proc_dt_tm_local")
public void setProcDtTmLocal(String procDtTmLocal) {
this.procDtTmLocal = procDtTmLocal;
}

@JsonProperty("proc_dt_tm_tz_abbrv")
public String getProcDtTmTzAbbrv() {
return procDtTmTzAbbrv;
}

@JsonProperty("proc_dt_tm_tz_abbrv")
public void setProcDtTmTzAbbrv(String procDtTmTzAbbrv) {
this.procDtTmTzAbbrv = procDtTmTzAbbrv;
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
