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
 * Body10
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class Body10 {
  @SerializedName("visitorId")
  private String visitorId = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("agentId")
  private String agentId = null;

  @SerializedName("groupId")
  private String groupId = null;

  public Body10 visitorId(String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

   /**
   * visitor’s ID received &lt;a href&#x3D;\&quot;https://developers.sendinblue.com/docs/conversations-webhooks\&quot;&gt;from a webhook&lt;/a&gt; or generated by you to &lt;a href&#x3D;\&quot;https://developers.sendinblue.com/docs/customize-the-widget#identifying-existing-users\&quot;&gt;bind existing user account to Conversations&lt;/a&gt;
   * @return visitorId
  **/
  @ApiModelProperty(example = "kZMvWhf8npAu3H6qd57w2Hv6nh6rnxvg", required = true, value = "visitor’s ID received <a href=\"https://developers.sendinblue.com/docs/conversations-webhooks\">from a webhook</a> or generated by you to <a href=\"https://developers.sendinblue.com/docs/customize-the-widget#identifying-existing-users\">bind existing user account to Conversations</a>")
  public String getVisitorId() {
    return visitorId;
  }

  public void setVisitorId(String visitorId) {
    this.visitorId = visitorId;
  }

  public Body10 text(String text) {
    this.text = text;
    return this;
  }

   /**
   * message text
   * @return text
  **/
  @ApiModelProperty(example = "Your order has shipped! Here’s your tracking number: 9114 5847 3325 9667 4328 88", required = true, value = "message text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Body10 agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * agent ID. It can be found on agent’s page or received &lt;a href&#x3D;\&quot;https://developers.sendinblue.com/docs/conversations-webhooks\&quot;&gt;from a webhook&lt;/a&gt;. Optional if &#x60;groupId&#x60; is set.
   * @return agentId
  **/
  @ApiModelProperty(example = "PjRBMhWGen6aRHjif", value = "agent ID. It can be found on agent’s page or received <a href=\"https://developers.sendinblue.com/docs/conversations-webhooks\">from a webhook</a>. Optional if `groupId` is set.")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public Body10 groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * group ID. It can be found on group’s page. Optional if &#x60;agentId&#x60; is set.
   * @return groupId
  **/
  @ApiModelProperty(example = "PjRBMhWGen6aRHjif", value = "group ID. It can be found on group’s page. Optional if `agentId` is set.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Body10 body10 = (Body10) o;
    return ObjectUtils.equals(this.visitorId, body10.visitorId) &&
    ObjectUtils.equals(this.text, body10.text) &&
    ObjectUtils.equals(this.agentId, body10.agentId) &&
    ObjectUtils.equals(this.groupId, body10.groupId);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(visitorId, text, agentId, groupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body10 {\n");
    
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
