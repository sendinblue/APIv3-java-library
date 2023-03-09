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
import sibModel.SubAccountDetailsResponsePlanInfoCredits;
import sibModel.SubAccountDetailsResponsePlanInfoFeatures;

/**
 * Sub-account plan details
 */
@ApiModel(description = "Sub-account plan details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class SubAccountDetailsResponsePlanInfo {
  @SerializedName("credits")
  private SubAccountDetailsResponsePlanInfoCredits credits = null;

  @SerializedName("features")
  private SubAccountDetailsResponsePlanInfoFeatures features = null;

  @SerializedName("planType")
  private String planType = null;

  public SubAccountDetailsResponsePlanInfo credits(SubAccountDetailsResponsePlanInfoCredits credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @ApiModelProperty(value = "")
  public SubAccountDetailsResponsePlanInfoCredits getCredits() {
    return credits;
  }

  public void setCredits(SubAccountDetailsResponsePlanInfoCredits credits) {
    this.credits = credits;
  }

  public SubAccountDetailsResponsePlanInfo features(SubAccountDetailsResponsePlanInfoFeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public SubAccountDetailsResponsePlanInfoFeatures getFeatures() {
    return features;
  }

  public void setFeatures(SubAccountDetailsResponsePlanInfoFeatures features) {
    this.features = features;
  }

  public SubAccountDetailsResponsePlanInfo planType(String planType) {
    this.planType = planType;
    return this;
  }

   /**
   * type of the plan
   * @return planType
  **/
  @ApiModelProperty(value = "type of the plan")
  public String getPlanType() {
    return planType;
  }

  public void setPlanType(String planType) {
    this.planType = planType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SubAccountDetailsResponsePlanInfo subAccountDetailsResponsePlanInfo = (SubAccountDetailsResponsePlanInfo) o;
    return ObjectUtils.equals(this.credits, subAccountDetailsResponsePlanInfo.credits) &&
    ObjectUtils.equals(this.features, subAccountDetailsResponsePlanInfo.features) &&
    ObjectUtils.equals(this.planType, subAccountDetailsResponsePlanInfo.planType);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(credits, features, planType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountDetailsResponsePlanInfo {\n");
    
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
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

