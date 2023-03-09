/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sibModel.RequestContactImportNewList;

/**
 * RequestContactImport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class RequestContactImport {
  @SerializedName("fileUrl")
  private String fileUrl = null;

  @SerializedName("fileBody")
  private String fileBody = null;

  @SerializedName("jsonBody")
  private List<Map<String, Object>> jsonBody = null;

  @SerializedName("listIds")
  private List<Long> listIds = null;

  @SerializedName("notifyUrl")
  private String notifyUrl = null;

  @SerializedName("newList")
  private RequestContactImportNewList newList = null;

  @SerializedName("emailBlacklist")
  private Boolean emailBlacklist = false;

  @SerializedName("smsBlacklist")
  private Boolean smsBlacklist = false;

  @SerializedName("updateExistingContacts")
  private Boolean updateExistingContacts = true;

  @SerializedName("emptyContactsAttributes")
  private Boolean emptyContactsAttributes = false;

  public RequestContactImport fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * Mandatory if fileBody or jsonBody is not defined. URL of the file to be imported (no local file). Possible file formats: .txt, .csv, .json
   * @return fileUrl
  **/
  @ApiModelProperty(example = "https://importfile.domain.com", value = "Mandatory if fileBody or jsonBody is not defined. URL of the file to be imported (no local file). Possible file formats: .txt, .csv, .json")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  public RequestContactImport fileBody(String fileBody) {
    this.fileBody = fileBody;
    return this;
  }

   /**
   * Mandatory if fileUrl and jsonBody is not defined. CSV content to be imported. Use semicolon to separate multiple attributes. Maximum allowed file body size is 10MB . However we recommend a safe limit of around 8 MB to avoid the issues caused due to increase of file body size while parsing. Please use fileUrl instead to import bigger files.
   * @return fileBody
  **/
  @ApiModelProperty(example = "NAME;SURNAME;EMAIL Smith;John;john.smith@example.com Roger;Ellie;ellie36@example.com", value = "Mandatory if fileUrl and jsonBody is not defined. CSV content to be imported. Use semicolon to separate multiple attributes. Maximum allowed file body size is 10MB . However we recommend a safe limit of around 8 MB to avoid the issues caused due to increase of file body size while parsing. Please use fileUrl instead to import bigger files.")
  public String getFileBody() {
    return fileBody;
  }

  public void setFileBody(String fileBody) {
    this.fileBody = fileBody;
  }

  public RequestContactImport jsonBody(List<Map<String, Object>> jsonBody) {
    this.jsonBody = jsonBody;
    return this;
  }

  public RequestContactImport addJsonBodyItem(Map<String, Object> jsonBodyItem) {
    if (this.jsonBody == null) {
      this.jsonBody = new ArrayList<Map<String, Object>>();
    }
    this.jsonBody.add(jsonBodyItem);
    return this;
  }

   /**
   * **Mandatory if fileUrl and fileBody is not defined.** JSON content to be imported. **Maximum allowed json body size is 10MB** . However we recommend a safe limit of around 8 MB to avoid the issues caused due to increase of json body size while parsing. Please use fileUrl instead to import bigger files. 
   * @return jsonBody
  **/
  @ApiModelProperty(value = "**Mandatory if fileUrl and fileBody is not defined.** JSON content to be imported. **Maximum allowed json body size is 10MB** . However we recommend a safe limit of around 8 MB to avoid the issues caused due to increase of json body size while parsing. Please use fileUrl instead to import bigger files. ")
  public List<Map<String, Object>> getJsonBody() {
    return jsonBody;
  }

  public void setJsonBody(List<Map<String, Object>> jsonBody) {
    this.jsonBody = jsonBody;
  }

  public RequestContactImport listIds(List<Long> listIds) {
    this.listIds = listIds;
    return this;
  }

  public RequestContactImport addListIdsItem(Long listIdsItem) {
    if (this.listIds == null) {
      this.listIds = new ArrayList<Long>();
    }
    this.listIds.add(listIdsItem);
    return this;
  }

   /**
   * Mandatory if newList is not defined. Ids of the lists in which the contacts shall be imported. For example, [2, 4, 7].
   * @return listIds
  **/
  @ApiModelProperty(value = "Mandatory if newList is not defined. Ids of the lists in which the contacts shall be imported. For example, [2, 4, 7].")
  public List<Long> getListIds() {
    return listIds;
  }

  public void setListIds(List<Long> listIds) {
    this.listIds = listIds;
  }

  public RequestContactImport notifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * URL that will be called once the import process is finished. For reference, https://help.sendinblue.com/hc/en-us/articles/360007666479
   * @return notifyUrl
  **/
  @ApiModelProperty(example = "http://requestb.in/173lyyx1", value = "URL that will be called once the import process is finished. For reference, https://help.sendinblue.com/hc/en-us/articles/360007666479")
  public String getNotifyUrl() {
    return notifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }

  public RequestContactImport newList(RequestContactImportNewList newList) {
    this.newList = newList;
    return this;
  }

   /**
   * Get newList
   * @return newList
  **/
  @ApiModelProperty(value = "")
  public RequestContactImportNewList getNewList() {
    return newList;
  }

  public void setNewList(RequestContactImportNewList newList) {
    this.newList = newList;
  }

  public RequestContactImport emailBlacklist(Boolean emailBlacklist) {
    this.emailBlacklist = emailBlacklist;
    return this;
  }

   /**
   * To blacklist all the contacts for email
   * @return emailBlacklist
  **/
  @ApiModelProperty(example = "false", value = "To blacklist all the contacts for email")
  public Boolean isEmailBlacklist() {
    return emailBlacklist;
  }

  public void setEmailBlacklist(Boolean emailBlacklist) {
    this.emailBlacklist = emailBlacklist;
  }

  public RequestContactImport smsBlacklist(Boolean smsBlacklist) {
    this.smsBlacklist = smsBlacklist;
    return this;
  }

   /**
   * To blacklist all the contacts for sms
   * @return smsBlacklist
  **/
  @ApiModelProperty(example = "false", value = "To blacklist all the contacts for sms")
  public Boolean isSmsBlacklist() {
    return smsBlacklist;
  }

  public void setSmsBlacklist(Boolean smsBlacklist) {
    this.smsBlacklist = smsBlacklist;
  }

  public RequestContactImport updateExistingContacts(Boolean updateExistingContacts) {
    this.updateExistingContacts = updateExistingContacts;
    return this;
  }

   /**
   * To facilitate the choice to update the existing contacts
   * @return updateExistingContacts
  **/
  @ApiModelProperty(example = "true", value = "To facilitate the choice to update the existing contacts")
  public Boolean isUpdateExistingContacts() {
    return updateExistingContacts;
  }

  public void setUpdateExistingContacts(Boolean updateExistingContacts) {
    this.updateExistingContacts = updateExistingContacts;
  }

  public RequestContactImport emptyContactsAttributes(Boolean emptyContactsAttributes) {
    this.emptyContactsAttributes = emptyContactsAttributes;
    return this;
  }

   /**
   * To facilitate the choice to erase any attribute of the existing contacts with empty value. emptyContactsAttributes &#x3D; true means the empty fields in your import will erase any attribute that currently contain data in SendinBlue, &amp; emptyContactsAttributes &#x3D; false means the empty fields will not affect your existing data ( only available if &#x60;updateExistingContacts&#x60; set to true )
   * @return emptyContactsAttributes
  **/
  @ApiModelProperty(example = "true", value = "To facilitate the choice to erase any attribute of the existing contacts with empty value. emptyContactsAttributes = true means the empty fields in your import will erase any attribute that currently contain data in SendinBlue, & emptyContactsAttributes = false means the empty fields will not affect your existing data ( only available if `updateExistingContacts` set to true )")
  public Boolean isEmptyContactsAttributes() {
    return emptyContactsAttributes;
  }

  public void setEmptyContactsAttributes(Boolean emptyContactsAttributes) {
    this.emptyContactsAttributes = emptyContactsAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    RequestContactImport requestContactImport = (RequestContactImport) o;
    return ObjectUtils.equals(this.fileUrl, requestContactImport.fileUrl) &&
    ObjectUtils.equals(this.fileBody, requestContactImport.fileBody) &&
    ObjectUtils.equals(this.jsonBody, requestContactImport.jsonBody) &&
    ObjectUtils.equals(this.listIds, requestContactImport.listIds) &&
    ObjectUtils.equals(this.notifyUrl, requestContactImport.notifyUrl) &&
    ObjectUtils.equals(this.newList, requestContactImport.newList) &&
    ObjectUtils.equals(this.emailBlacklist, requestContactImport.emailBlacklist) &&
    ObjectUtils.equals(this.smsBlacklist, requestContactImport.smsBlacklist) &&
    ObjectUtils.equals(this.updateExistingContacts, requestContactImport.updateExistingContacts) &&
    ObjectUtils.equals(this.emptyContactsAttributes, requestContactImport.emptyContactsAttributes);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(fileUrl, fileBody, jsonBody, listIds, notifyUrl, newList, emailBlacklist, smsBlacklist, updateExistingContacts, emptyContactsAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContactImport {\n");
    
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    fileBody: ").append(toIndentedString(fileBody)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    newList: ").append(toIndentedString(newList)).append("\n");
    sb.append("    emailBlacklist: ").append(toIndentedString(emailBlacklist)).append("\n");
    sb.append("    smsBlacklist: ").append(toIndentedString(smsBlacklist)).append("\n");
    sb.append("    updateExistingContacts: ").append(toIndentedString(updateExistingContacts)).append("\n");
    sb.append("    emptyContactsAttributes: ").append(toIndentedString(emptyContactsAttributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

