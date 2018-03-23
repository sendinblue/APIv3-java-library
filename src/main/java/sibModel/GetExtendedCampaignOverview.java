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
import sibModel.GetCampaignOverview;
import sibModel.GetExtendedCampaignOverviewSender;

/**
 * GetExtendedCampaignOverview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-23T10:53:13.078+05:30")
public class GetExtendedCampaignOverview {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("subject")
  private String subject = null;

  /**
   * Type of campaign
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CLASSIC("classic"),
    
    TRIGGER("trigger");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Status of the campaign
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("draft"),
    
    SENT("sent"),
    
    ARCHIVE("archive"),
    
    QUEUED("queued"),
    
    SUSPENDED("suspended"),
    
    IN_PROCESS("in_process");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("scheduledAt")
  private OffsetDateTime scheduledAt = null;

  @SerializedName("testSent")
  private Boolean testSent = null;

  @SerializedName("header")
  private String header = null;

  @SerializedName("footer")
  private String footer = null;

  @SerializedName("sender")
  private GetExtendedCampaignOverviewSender sender = null;

  @SerializedName("replyTo")
  private String replyTo = null;

  @SerializedName("toField")
  private String toField = null;

  @SerializedName("htmlContent")
  private String htmlContent = null;

  @SerializedName("shareLink")
  private String shareLink = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  @SerializedName("inlineImageActivation")
  private Boolean inlineImageActivation = null;

  @SerializedName("mirrorActive")
  private Boolean mirrorActive = null;

  @SerializedName("recurring")
  private Boolean recurring = null;

  public GetExtendedCampaignOverview id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the campaign
   * @return id
  **/
  @ApiModelProperty(example = "12", required = true, value = "ID of the campaign")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetExtendedCampaignOverview name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the campaign
   * @return name
  **/
  @ApiModelProperty(example = "EN - Sales Summer 2017", required = true, value = "Name of the campaign")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetExtendedCampaignOverview subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the campaign
   * @return subject
  **/
  @ApiModelProperty(example = "20% OFF for 2017 Summer Sales", required = true, value = "Subject of the campaign")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GetExtendedCampaignOverview type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of campaign
   * @return type
  **/
  @ApiModelProperty(example = "classic", required = true, value = "Type of campaign")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GetExtendedCampaignOverview status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the campaign
   * @return status
  **/
  @ApiModelProperty(example = "sent", required = true, value = "Status of the campaign")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GetExtendedCampaignOverview scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * UTC date-time on which campaign is scheduled (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return scheduledAt
  **/
  @ApiModelProperty(example = "2017-06-01T12:30:00Z", value = "UTC date-time on which campaign is scheduled (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public GetExtendedCampaignOverview testSent(Boolean testSent) {
    this.testSent = testSent;
    return this;
  }

   /**
   * Retrieved the status of test email sending. (true&#x3D;Test email has been sent  false&#x3D;Test email has not been sent)
   * @return testSent
  **/
  @ApiModelProperty(example = "true", required = true, value = "Retrieved the status of test email sending. (true=Test email has been sent  false=Test email has not been sent)")
  public Boolean isTestSent() {
    return testSent;
  }

  public void setTestSent(Boolean testSent) {
    this.testSent = testSent;
  }

  public GetExtendedCampaignOverview header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Header of the campaign
   * @return header
  **/
  @ApiModelProperty(example = "[DEFAULT_HEADER]", required = true, value = "Header of the campaign")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public GetExtendedCampaignOverview footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Footer of the campaign
   * @return footer
  **/
  @ApiModelProperty(example = "[DEFAULT_FOOTER]", required = true, value = "Footer of the campaign")
  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }

  public GetExtendedCampaignOverview sender(GetExtendedCampaignOverviewSender sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(required = true, value = "")
  public GetExtendedCampaignOverviewSender getSender() {
    return sender;
  }

  public void setSender(GetExtendedCampaignOverviewSender sender) {
    this.sender = sender;
  }

  public GetExtendedCampaignOverview replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Email defined as the \&quot;Reply to\&quot; of the campaign
   * @return replyTo
  **/
  @ApiModelProperty(example = "replyto@domain.com", required = true, value = "Email defined as the \"Reply to\" of the campaign")
  public String getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }

  public GetExtendedCampaignOverview toField(String toField) {
    this.toField = toField;
    return this;
  }

   /**
   * Customisation of the \&quot;to\&quot; field of the campaign
   * @return toField
  **/
  @ApiModelProperty(example = "{FNAME} {LNAME}", required = true, value = "Customisation of the \"to\" field of the campaign")
  public String getToField() {
    return toField;
  }

  public void setToField(String toField) {
    this.toField = toField;
  }

  public GetExtendedCampaignOverview htmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

   /**
   * HTML content of the campaign
   * @return htmlContent
  **/
  @ApiModelProperty(example = "This is my HTML Content", required = true, value = "HTML content of the campaign")
  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public GetExtendedCampaignOverview shareLink(String shareLink) {
    this.shareLink = shareLink;
    return this;
  }

   /**
   * Link to share the campaign on social medias
   * @return shareLink
  **/
  @ApiModelProperty(example = "http://dhh.sendinblue.com/fhsgccc.html?t=9865448900", value = "Link to share the campaign on social medias")
  public String getShareLink() {
    return shareLink;
  }

  public void setShareLink(String shareLink) {
    this.shareLink = shareLink;
  }

  public GetExtendedCampaignOverview tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag of the campaign
   * @return tag
  **/
  @ApiModelProperty(example = "Newsletter", required = true, value = "Tag of the campaign")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public GetExtendedCampaignOverview createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-05-01T12:30:00Z", required = true, value = "Creation UTC date-time of the campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public GetExtendedCampaignOverview modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * UTC date-time of last modification of the campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
  **/
  @ApiModelProperty(example = "2017-05-01T12:30:00Z", required = true, value = "UTC date-time of last modification of the campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public GetExtendedCampaignOverview inlineImageActivation(Boolean inlineImageActivation) {
    this.inlineImageActivation = inlineImageActivation;
    return this;
  }

   /**
   * Status of inline image. inlineImageActivation &#x3D; false means image can’t be embedded, &amp; inlineImageActivation &#x3D; true means image can be embedded, in the email.
   * @return inlineImageActivation
  **/
  @ApiModelProperty(example = "true", value = "Status of inline image. inlineImageActivation = false means image can’t be embedded, & inlineImageActivation = true means image can be embedded, in the email.")
  public Boolean isInlineImageActivation() {
    return inlineImageActivation;
  }

  public void setInlineImageActivation(Boolean inlineImageActivation) {
    this.inlineImageActivation = inlineImageActivation;
  }

  public GetExtendedCampaignOverview mirrorActive(Boolean mirrorActive) {
    this.mirrorActive = mirrorActive;
    return this;
  }

   /**
   * Status of mirror links in campaign. mirrorActive &#x3D; false means mirror links are deactivated, &amp; mirrorActive &#x3D; true means mirror links are activated, in the campaign
   * @return mirrorActive
  **/
  @ApiModelProperty(example = "true", value = "Status of mirror links in campaign. mirrorActive = false means mirror links are deactivated, & mirrorActive = true means mirror links are activated, in the campaign")
  public Boolean isMirrorActive() {
    return mirrorActive;
  }

  public void setMirrorActive(Boolean mirrorActive) {
    this.mirrorActive = mirrorActive;
  }

  public GetExtendedCampaignOverview recurring(Boolean recurring) {
    this.recurring = recurring;
    return this;
  }

   /**
   * FOR TRIGGER ONLY ! Type of trigger campaign.recurring &#x3D; false means contact can receive the same Trigger campaign only once, &amp; recurring &#x3D; true means contact can receive the same Trigger campaign several times
   * @return recurring
  **/
  @ApiModelProperty(example = "true", value = "FOR TRIGGER ONLY ! Type of trigger campaign.recurring = false means contact can receive the same Trigger campaign only once, & recurring = true means contact can receive the same Trigger campaign several times")
  public Boolean isRecurring() {
    return recurring;
  }

  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetExtendedCampaignOverview getExtendedCampaignOverview = (GetExtendedCampaignOverview) o;
    return ObjectUtils.equals(this.id, getExtendedCampaignOverview.id) &&
    ObjectUtils.equals(this.name, getExtendedCampaignOverview.name) &&
    ObjectUtils.equals(this.subject, getExtendedCampaignOverview.subject) &&
    ObjectUtils.equals(this.type, getExtendedCampaignOverview.type) &&
    ObjectUtils.equals(this.status, getExtendedCampaignOverview.status) &&
    ObjectUtils.equals(this.scheduledAt, getExtendedCampaignOverview.scheduledAt) &&
    ObjectUtils.equals(this.testSent, getExtendedCampaignOverview.testSent) &&
    ObjectUtils.equals(this.header, getExtendedCampaignOverview.header) &&
    ObjectUtils.equals(this.footer, getExtendedCampaignOverview.footer) &&
    ObjectUtils.equals(this.sender, getExtendedCampaignOverview.sender) &&
    ObjectUtils.equals(this.replyTo, getExtendedCampaignOverview.replyTo) &&
    ObjectUtils.equals(this.toField, getExtendedCampaignOverview.toField) &&
    ObjectUtils.equals(this.htmlContent, getExtendedCampaignOverview.htmlContent) &&
    ObjectUtils.equals(this.shareLink, getExtendedCampaignOverview.shareLink) &&
    ObjectUtils.equals(this.tag, getExtendedCampaignOverview.tag) &&
    ObjectUtils.equals(this.createdAt, getExtendedCampaignOverview.createdAt) &&
    ObjectUtils.equals(this.modifiedAt, getExtendedCampaignOverview.modifiedAt) &&
    ObjectUtils.equals(this.inlineImageActivation, getExtendedCampaignOverview.inlineImageActivation) &&
    ObjectUtils.equals(this.mirrorActive, getExtendedCampaignOverview.mirrorActive) &&
    ObjectUtils.equals(this.recurring, getExtendedCampaignOverview.recurring);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, name, subject, type, status, scheduledAt, testSent, header, footer, sender, replyTo, toField, htmlContent, shareLink, tag, createdAt, modifiedAt, inlineImageActivation, mirrorActive, recurring);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedCampaignOverview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    testSent: ").append(toIndentedString(testSent)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    toField: ").append(toIndentedString(toField)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    shareLink: ").append(toIndentedString(shareLink)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    inlineImageActivation: ").append(toIndentedString(inlineImageActivation)).append("\n");
    sb.append("    mirrorActive: ").append(toIndentedString(mirrorActive)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
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

