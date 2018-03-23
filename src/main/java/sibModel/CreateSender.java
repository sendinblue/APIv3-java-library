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
import sibModel.CreateSenderIps;

/**
 * CreateSender
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-23T10:53:13.078+05:30")
public class CreateSender {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("ips")
  private List<CreateSenderIps> ips = null;

  public CreateSender name(String name) {
    this.name = name;
    return this;
  }

   /**
   * From Name to use for the sender
   * @return name
  **/
  @ApiModelProperty(example = "Newsletter", required = true, value = "From Name to use for the sender")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateSender email(String email) {
    this.email = email;
    return this;
  }

   /**
   * From Email to use for the sender
   * @return email
  **/
  @ApiModelProperty(example = "newsletter@mycompany.com", required = true, value = "From Email to use for the sender")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateSender ips(List<CreateSenderIps> ips) {
    this.ips = ips;
    return this;
  }

  public CreateSender addIpsItem(CreateSenderIps ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<CreateSenderIps>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * Mandatory in case of dedicated IP, IPs to associate to the sender
   * @return ips
  **/
  @ApiModelProperty(value = "Mandatory in case of dedicated IP, IPs to associate to the sender")
  public List<CreateSenderIps> getIps() {
    return ips;
  }

  public void setIps(List<CreateSenderIps> ips) {
    this.ips = ips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CreateSender createSender = (CreateSender) o;
    return ObjectUtils.equals(this.name, createSender.name) &&
    ObjectUtils.equals(this.email, createSender.email) &&
    ObjectUtils.equals(this.ips, createSender.ips);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, email, ips);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSender {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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

