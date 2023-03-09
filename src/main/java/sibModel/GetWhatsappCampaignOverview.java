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
import sibModel.WhatsappCampStats;
import sibModel.WhatsappCampTemplate;

/**
 * GetWhatsappCampaignOverview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class GetWhatsappCampaignOverview {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("campaignName")
  private String campaignName = null;

  /**
   * Status of the Whatsapp Campaign
   */
  @JsonAdapter(CampaignStatusEnum.Adapter.class)
  public enum CampaignStatusEnum {
    DRAFT("draft"),
    
    SCHEDULED("scheduled"),
    
    PENDING("pending"),
    
    APPROVED("approved"),
    
    RUNNING("running"),
    
    SUSPENDED("suspended"),
    
    REJECTED("rejected"),
    
    SENT("sent");

    private String value;

    CampaignStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignStatusEnum fromValue(String text) {
      for (CampaignStatusEnum b : CampaignStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CampaignStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CampaignStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("campaignStatus")
  private CampaignStatusEnum campaignStatus = null;

  @SerializedName("scheduledAt")
  private String scheduledAt = null;

  @SerializedName("senderNumber")
  private String senderNumber = null;

  @SerializedName("stats")
  private WhatsappCampStats stats = null;

  @SerializedName("template")
  private WhatsappCampTemplate template = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("modifiedAt")
  private String modifiedAt = null;

  public GetWhatsappCampaignOverview id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the Whatsapp Campaign
   * @return id
  **/
  @ApiModelProperty(example = "1672035851100690", required = true, value = "ID of the Whatsapp Campaign")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetWhatsappCampaignOverview campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Name of the Whatsapp Campaign
   * @return campaignName
  **/
  @ApiModelProperty(example = "Test Campaign", required = true, value = "Name of the Whatsapp Campaign")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public GetWhatsappCampaignOverview campaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }

   /**
   * Status of the Whatsapp Campaign
   * @return campaignStatus
  **/
  @ApiModelProperty(example = "draft", required = true, value = "Status of the Whatsapp Campaign")
  public CampaignStatusEnum getCampaignStatus() {
    return campaignStatus;
  }

  public void setCampaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  public GetWhatsappCampaignOverview scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * UTC date-time on which Whatsapp campaign is scheduled. Should be in YYYY-MM-DDTHH:mm:ss.SSSZ format
   * @return scheduledAt
  **/
  @ApiModelProperty(example = "2017-06-01T12:30:00.000+0000", value = "UTC date-time on which Whatsapp campaign is scheduled. Should be in YYYY-MM-DDTHH:mm:ss.SSSZ format")
  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public GetWhatsappCampaignOverview senderNumber(String senderNumber) {
    this.senderNumber = senderNumber;
    return this;
  }

   /**
   * Sender of the Whatsapp Campaign
   * @return senderNumber
  **/
  @ApiModelProperty(example = "9368207029", required = true, value = "Sender of the Whatsapp Campaign")
  public String getSenderNumber() {
    return senderNumber;
  }

  public void setSenderNumber(String senderNumber) {
    this.senderNumber = senderNumber;
  }

  public GetWhatsappCampaignOverview stats(WhatsappCampStats stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")
  public WhatsappCampStats getStats() {
    return stats;
  }

  public void setStats(WhatsappCampStats stats) {
    this.stats = stats;
  }

  public GetWhatsappCampaignOverview template(WhatsappCampTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "")
  public WhatsappCampTemplate getTemplate() {
    return template;
  }

  public void setTemplate(WhatsappCampTemplate template) {
    this.template = template;
  }

  public GetWhatsappCampaignOverview createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-06-01T12:30:00.000+0000", required = true, value = "Creation UTC date-time of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetWhatsappCampaignOverview modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * UTC date-time of last modification of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
  **/
  @ApiModelProperty(example = "2017-05-01T12:30:00.000+0000", required = true, value = "UTC date-time of last modification of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
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
    GetWhatsappCampaignOverview getWhatsappCampaignOverview = (GetWhatsappCampaignOverview) o;
    return ObjectUtils.equals(this.id, getWhatsappCampaignOverview.id) &&
    ObjectUtils.equals(this.campaignName, getWhatsappCampaignOverview.campaignName) &&
    ObjectUtils.equals(this.campaignStatus, getWhatsappCampaignOverview.campaignStatus) &&
    ObjectUtils.equals(this.scheduledAt, getWhatsappCampaignOverview.scheduledAt) &&
    ObjectUtils.equals(this.senderNumber, getWhatsappCampaignOverview.senderNumber) &&
    ObjectUtils.equals(this.stats, getWhatsappCampaignOverview.stats) &&
    ObjectUtils.equals(this.template, getWhatsappCampaignOverview.template) &&
    ObjectUtils.equals(this.createdAt, getWhatsappCampaignOverview.createdAt) &&
    ObjectUtils.equals(this.modifiedAt, getWhatsappCampaignOverview.modifiedAt);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, campaignName, campaignStatus, scheduledAt, senderNumber, stats, template, createdAt, modifiedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWhatsappCampaignOverview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    senderNumber: ").append(toIndentedString(senderNumber)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
