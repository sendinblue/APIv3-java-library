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
import java.util.ArrayList;
import java.util.List;

/**
 * GetEmailCampaigns
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-23T10:53:13.078+05:30")
public class GetEmailCampaigns {
  @SerializedName("campaigns")
  private List<Object> campaigns = null;

  @SerializedName("count")
  private Long count = null;

  public GetEmailCampaigns campaigns(List<Object> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public GetEmailCampaigns addCampaignsItem(Object campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<Object>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * Get campaigns
   * @return campaigns
  **/
  @ApiModelProperty(value = "")
  public List<Object> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<Object> campaigns) {
    this.campaigns = campaigns;
  }

  public GetEmailCampaigns count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Number of Email campaigns retrieved
   * @return count
  **/
  @ApiModelProperty(example = "24", required = true, value = "Number of Email campaigns retrieved")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetEmailCampaigns getEmailCampaigns = (GetEmailCampaigns) o;
    return ObjectUtils.equals(this.campaigns, getEmailCampaigns.campaigns) &&
    ObjectUtils.equals(this.count, getEmailCampaigns.count);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(campaigns, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEmailCampaigns {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

