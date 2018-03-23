/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
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
import org.threeten.bp.OffsetDateTime;
import sibModel.GetSmtpTemplateOverviewSender;

/**
 * GetSmtpTemplateOverview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-23T10:53:13.078+05:30")
public class GetSmtpTemplateOverview {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  @SerializedName("testSent")
  private Boolean testSent = null;

  @SerializedName("sender")
  private GetSmtpTemplateOverviewSender sender = null;

  @SerializedName("replyTo")
  private String replyTo = null;

  @SerializedName("toField")
  private String toField = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("htmlContent")
  private String htmlContent = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  public GetSmtpTemplateOverview id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the template
   * @return id
  **/
  @ApiModelProperty(example = "4", required = true, value = "ID of the template")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetSmtpTemplateOverview name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the template
   * @return name
  **/
  @ApiModelProperty(example = "Order Confirmation - EN", required = true, value = "Name of the template")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSmtpTemplateOverview subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the template
   * @return subject
  **/
  @ApiModelProperty(example = "Thanks for your order !", required = true, value = "Subject of the template")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GetSmtpTemplateOverview isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Status of template (true&#x3D;active, false&#x3D;inactive)
   * @return isActive
  **/
  @ApiModelProperty(example = "true", required = true, value = "Status of template (true=active, false=inactive)")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public GetSmtpTemplateOverview testSent(Boolean testSent) {
    this.testSent = testSent;
    return this;
  }

   /**
   * Status of test sending for the template (true&#x3D;test email has been sent, false&#x3D;test email has not been sent)
   * @return testSent
  **/
  @ApiModelProperty(example = "true", required = true, value = "Status of test sending for the template (true=test email has been sent, false=test email has not been sent)")
  public Boolean isTestSent() {
    return testSent;
  }

  public void setTestSent(Boolean testSent) {
    this.testSent = testSent;
  }

  public GetSmtpTemplateOverview sender(GetSmtpTemplateOverviewSender sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(required = true, value = "")
  public GetSmtpTemplateOverviewSender getSender() {
    return sender;
  }

  public void setSender(GetSmtpTemplateOverviewSender sender) {
    this.sender = sender;
  }

  public GetSmtpTemplateOverview replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Email defined as the \&quot;Reply to\&quot; for the template
   * @return replyTo
  **/
  @ApiModelProperty(example = "replyto@domain.com", required = true, value = "Email defined as the \"Reply to\" for the template")
  public String getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }

  public GetSmtpTemplateOverview toField(String toField) {
    this.toField = toField;
    return this;
  }

   /**
   * Customisation of the \&quot;to\&quot; field for the template
   * @return toField
  **/
  @ApiModelProperty(example = "{FIRSTNAME} {LASTNAME}", required = true, value = "Customisation of the \"to\" field for the template")
  public String getToField() {
    return toField;
  }

  public void setToField(String toField) {
    this.toField = toField;
  }

  public GetSmtpTemplateOverview tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag of the template
   * @return tag
  **/
  @ApiModelProperty(example = "sports", required = true, value = "Tag of the template")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public GetSmtpTemplateOverview htmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

   /**
   * HTML content of the template
   * @return htmlContent
  **/
  @ApiModelProperty(example = "Your order n°xxxxx has been confirmed. Thanks for your purchase.", required = true, value = "HTML content of the template")
  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public GetSmtpTemplateOverview createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the template (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-05-01T12:30:00Z", required = true, value = "Creation UTC date-time of the template (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public GetSmtpTemplateOverview modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Last modification UTC date-time of the template (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
  **/
  @ApiModelProperty(example = "2017-05-12T12:30:00Z", required = true, value = "Last modification UTC date-time of the template (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetSmtpTemplateOverview getSmtpTemplateOverview = (GetSmtpTemplateOverview) o;
    return ObjectUtils.equals(this.id, getSmtpTemplateOverview.id) &&
    ObjectUtils.equals(this.name, getSmtpTemplateOverview.name) &&
    ObjectUtils.equals(this.subject, getSmtpTemplateOverview.subject) &&
    ObjectUtils.equals(this.isActive, getSmtpTemplateOverview.isActive) &&
    ObjectUtils.equals(this.testSent, getSmtpTemplateOverview.testSent) &&
    ObjectUtils.equals(this.sender, getSmtpTemplateOverview.sender) &&
    ObjectUtils.equals(this.replyTo, getSmtpTemplateOverview.replyTo) &&
    ObjectUtils.equals(this.toField, getSmtpTemplateOverview.toField) &&
    ObjectUtils.equals(this.tag, getSmtpTemplateOverview.tag) &&
    ObjectUtils.equals(this.htmlContent, getSmtpTemplateOverview.htmlContent) &&
    ObjectUtils.equals(this.createdAt, getSmtpTemplateOverview.createdAt) &&
    ObjectUtils.equals(this.modifiedAt, getSmtpTemplateOverview.modifiedAt);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, name, subject, isActive, testSent, sender, replyTo, toField, tag, htmlContent, createdAt, modifiedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmtpTemplateOverview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    testSent: ").append(toIndentedString(testSent)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    toField: ").append(toIndentedString(toField)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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

