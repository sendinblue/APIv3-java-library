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

/**
 * List of attributes
 */
@ApiModel(description = "List of attributes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class DealAttributesInner {
  @SerializedName("internalName")
  private String internalName = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("attributeTypeName")
  private String attributeTypeName = null;

  @SerializedName("attributeOptions")
  private List<Object> attributeOptions = null;

  @SerializedName("isRequired")
  private Boolean isRequired = null;

  public DealAttributesInner internalName(String internalName) {
    this.internalName = internalName;
    return this;
  }

   /**
   * Get internalName
   * @return internalName
  **/
  @ApiModelProperty(example = "deal_name", value = "")
  public String getInternalName() {
    return internalName;
  }

  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }

  public DealAttributesInner label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "Deal Name", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DealAttributesInner attributeTypeName(String attributeTypeName) {
    this.attributeTypeName = attributeTypeName;
    return this;
  }

   /**
   * Get attributeTypeName
   * @return attributeTypeName
  **/
  @ApiModelProperty(example = "text", value = "")
  public String getAttributeTypeName() {
    return attributeTypeName;
  }

  public void setAttributeTypeName(String attributeTypeName) {
    this.attributeTypeName = attributeTypeName;
  }

  public DealAttributesInner attributeOptions(List<Object> attributeOptions) {
    this.attributeOptions = attributeOptions;
    return this;
  }

  public DealAttributesInner addAttributeOptionsItem(Object attributeOptionsItem) {
    if (this.attributeOptions == null) {
      this.attributeOptions = new ArrayList<Object>();
    }
    this.attributeOptions.add(attributeOptionsItem);
    return this;
  }

   /**
   * Get attributeOptions
   * @return attributeOptions
  **/
  @ApiModelProperty(value = "")
  public List<Object> getAttributeOptions() {
    return attributeOptions;
  }

  public void setAttributeOptions(List<Object> attributeOptions) {
    this.attributeOptions = attributeOptions;
  }

  public DealAttributesInner isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DealAttributesInner dealAttributesInner = (DealAttributesInner) o;
    return ObjectUtils.equals(this.internalName, dealAttributesInner.internalName) &&
    ObjectUtils.equals(this.label, dealAttributesInner.label) &&
    ObjectUtils.equals(this.attributeTypeName, dealAttributesInner.attributeTypeName) &&
    ObjectUtils.equals(this.attributeOptions, dealAttributesInner.attributeOptions) &&
    ObjectUtils.equals(this.isRequired, dealAttributesInner.isRequired);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(internalName, label, attributeTypeName, attributeOptions, isRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealAttributesInner {\n");
    
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    attributeTypeName: ").append(toIndentedString(attributeTypeName)).append("\n");
    sb.append("    attributeOptions: ").append(toIndentedString(attributeOptions)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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

