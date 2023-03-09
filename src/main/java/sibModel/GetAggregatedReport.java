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

/**
 * GetAggregatedReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class GetAggregatedReport {
  @SerializedName("range")
  private String range = null;

  @SerializedName("requests")
  private Long requests = null;

  @SerializedName("delivered")
  private Long delivered = null;

  @SerializedName("hardBounces")
  private Long hardBounces = null;

  @SerializedName("softBounces")
  private Long softBounces = null;

  @SerializedName("clicks")
  private Long clicks = null;

  @SerializedName("uniqueClicks")
  private Long uniqueClicks = null;

  @SerializedName("opens")
  private Long opens = null;

  @SerializedName("uniqueOpens")
  private Long uniqueOpens = null;

  @SerializedName("spamReports")
  private Long spamReports = null;

  @SerializedName("blocked")
  private Long blocked = null;

  @SerializedName("invalid")
  private Long invalid = null;

  @SerializedName("unsubscribed")
  private Long unsubscribed = null;

  public GetAggregatedReport range(String range) {
    this.range = range;
    return this;
  }

   /**
   * Time frame of the report
   * @return range
  **/
  @ApiModelProperty(example = "2016-09-08|2017-04-06", value = "Time frame of the report")
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public GetAggregatedReport requests(Long requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Number of requests for the timeframe
   * @return requests
  **/
  @ApiModelProperty(example = "263", value = "Number of requests for the timeframe")
  public Long getRequests() {
    return requests;
  }

  public void setRequests(Long requests) {
    this.requests = requests;
  }

  public GetAggregatedReport delivered(Long delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * Number of delivered emails for the timeframe
   * @return delivered
  **/
  @ApiModelProperty(example = "249", value = "Number of delivered emails for the timeframe")
  public Long getDelivered() {
    return delivered;
  }

  public void setDelivered(Long delivered) {
    this.delivered = delivered;
  }

  public GetAggregatedReport hardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * Number of hardbounces for the timeframe
   * @return hardBounces
  **/
  @ApiModelProperty(example = "1", value = "Number of hardbounces for the timeframe")
  public Long getHardBounces() {
    return hardBounces;
  }

  public void setHardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
  }

  public GetAggregatedReport softBounces(Long softBounces) {
    this.softBounces = softBounces;
    return this;
  }

   /**
   * Number of softbounces for the timeframe
   * @return softBounces
  **/
  @ApiModelProperty(example = "4", value = "Number of softbounces for the timeframe")
  public Long getSoftBounces() {
    return softBounces;
  }

  public void setSoftBounces(Long softBounces) {
    this.softBounces = softBounces;
  }

  public GetAggregatedReport clicks(Long clicks) {
    this.clicks = clicks;
    return this;
  }

   /**
   * Number of clicks for the timeframe
   * @return clicks
  **/
  @ApiModelProperty(example = "12", value = "Number of clicks for the timeframe")
  public Long getClicks() {
    return clicks;
  }

  public void setClicks(Long clicks) {
    this.clicks = clicks;
  }

  public GetAggregatedReport uniqueClicks(Long uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * Number of unique clicks for the timeframe
   * @return uniqueClicks
  **/
  @ApiModelProperty(example = "8", value = "Number of unique clicks for the timeframe")
  public Long getUniqueClicks() {
    return uniqueClicks;
  }

  public void setUniqueClicks(Long uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
  }

  public GetAggregatedReport opens(Long opens) {
    this.opens = opens;
    return this;
  }

   /**
   * Number of openings for the timeframe
   * @return opens
  **/
  @ApiModelProperty(example = "47", value = "Number of openings for the timeframe")
  public Long getOpens() {
    return opens;
  }

  public void setOpens(Long opens) {
    this.opens = opens;
  }

  public GetAggregatedReport uniqueOpens(Long uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * Number of unique openings for the timeframe
   * @return uniqueOpens
  **/
  @ApiModelProperty(example = "37", value = "Number of unique openings for the timeframe")
  public Long getUniqueOpens() {
    return uniqueOpens;
  }

  public void setUniqueOpens(Long uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
  }

  public GetAggregatedReport spamReports(Long spamReports) {
    this.spamReports = spamReports;
    return this;
  }

   /**
   * Number of complaint (spam report) for the timeframe
   * @return spamReports
  **/
  @ApiModelProperty(example = "0", value = "Number of complaint (spam report) for the timeframe")
  public Long getSpamReports() {
    return spamReports;
  }

  public void setSpamReports(Long spamReports) {
    this.spamReports = spamReports;
  }

  public GetAggregatedReport blocked(Long blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Number of blocked contact emails for the timeframe
   * @return blocked
  **/
  @ApiModelProperty(example = "2", value = "Number of blocked contact emails for the timeframe")
  public Long getBlocked() {
    return blocked;
  }

  public void setBlocked(Long blocked) {
    this.blocked = blocked;
  }

  public GetAggregatedReport invalid(Long invalid) {
    this.invalid = invalid;
    return this;
  }

   /**
   * Number of invalid emails for the timeframe
   * @return invalid
  **/
  @ApiModelProperty(example = "0", value = "Number of invalid emails for the timeframe")
  public Long getInvalid() {
    return invalid;
  }

  public void setInvalid(Long invalid) {
    this.invalid = invalid;
  }

  public GetAggregatedReport unsubscribed(Long unsubscribed) {
    this.unsubscribed = unsubscribed;
    return this;
  }

   /**
   * Number of unsubscribed emails for the timeframe
   * @return unsubscribed
  **/
  @ApiModelProperty(example = "0", value = "Number of unsubscribed emails for the timeframe")
  public Long getUnsubscribed() {
    return unsubscribed;
  }

  public void setUnsubscribed(Long unsubscribed) {
    this.unsubscribed = unsubscribed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetAggregatedReport getAggregatedReport = (GetAggregatedReport) o;
    return ObjectUtils.equals(this.range, getAggregatedReport.range) &&
    ObjectUtils.equals(this.requests, getAggregatedReport.requests) &&
    ObjectUtils.equals(this.delivered, getAggregatedReport.delivered) &&
    ObjectUtils.equals(this.hardBounces, getAggregatedReport.hardBounces) &&
    ObjectUtils.equals(this.softBounces, getAggregatedReport.softBounces) &&
    ObjectUtils.equals(this.clicks, getAggregatedReport.clicks) &&
    ObjectUtils.equals(this.uniqueClicks, getAggregatedReport.uniqueClicks) &&
    ObjectUtils.equals(this.opens, getAggregatedReport.opens) &&
    ObjectUtils.equals(this.uniqueOpens, getAggregatedReport.uniqueOpens) &&
    ObjectUtils.equals(this.spamReports, getAggregatedReport.spamReports) &&
    ObjectUtils.equals(this.blocked, getAggregatedReport.blocked) &&
    ObjectUtils.equals(this.invalid, getAggregatedReport.invalid) &&
    ObjectUtils.equals(this.unsubscribed, getAggregatedReport.unsubscribed);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(range, requests, delivered, hardBounces, softBounces, clicks, uniqueClicks, opens, uniqueOpens, spamReports, blocked, invalid, unsubscribed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAggregatedReport {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
    sb.append("    spamReports: ").append(toIndentedString(spamReports)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
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

