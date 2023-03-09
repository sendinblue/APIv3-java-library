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
 * GetTransacEmailContentEvents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class GetTransacEmailContentEvents {
  @SerializedName("name")
  private String name = null;

  @SerializedName("time")
  private String time = null;

  public GetTransacEmailContentEvents name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the event that occurred on the sent email
   * @return name
  **/
  @ApiModelProperty(example = "delivered", required = true, value = "Name of the event that occurred on the sent email")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetTransacEmailContentEvents time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Time at which the event occurred
   * @return time
  **/
  @ApiModelProperty(example = "2017-03-12T12:30:00Z", required = true, value = "Time at which the event occurred")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetTransacEmailContentEvents getTransacEmailContentEvents = (GetTransacEmailContentEvents) o;
    return ObjectUtils.equals(this.name, getTransacEmailContentEvents.name) &&
    ObjectUtils.equals(this.time, getTransacEmailContentEvents.time);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransacEmailContentEvents {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

