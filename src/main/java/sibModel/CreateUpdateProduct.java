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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreateUpdateProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class CreateUpdateProduct {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("imageUrl")
  private String imageUrl = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("price")
  private Float price = null;

  @SerializedName("categories")
  private List<String> categories = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("metaInfo")
  private Map<String, Object> metaInfo = null;

  @SerializedName("updateEnabled")
  private Boolean updateEnabled = false;

  public CreateUpdateProduct id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Product ID for which you requested the details
   * @return id
  **/
  @ApiModelProperty(example = "P11", required = true, value = "Product ID for which you requested the details")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateUpdateProduct name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Mandatory in case of creation**. Name of the product for which you requested the details
   * @return name
  **/
  @ApiModelProperty(example = "Iphone 11", required = true, value = "Mandatory in case of creation**. Name of the product for which you requested the details")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateUpdateProduct url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to the product
   * @return url
  **/
  @ApiModelProperty(example = "http://mydomain.com/product/electronics/product1", value = "URL to the product")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CreateUpdateProduct imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Absolute URL to the cover image of the product
   * @return imageUrl
  **/
  @ApiModelProperty(example = "http://mydomain.com/product-absoulte-url/img.jpeg", value = "Absolute URL to the cover image of the product")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public CreateUpdateProduct sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Product identifier from the shop
   * @return sku
  **/
  @ApiModelProperty(value = "Product identifier from the shop")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public CreateUpdateProduct price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Price of the product
   * @return price
  **/
  @ApiModelProperty(value = "Price of the product")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public CreateUpdateProduct categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public CreateUpdateProduct addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Category ID-s of the product
   * @return categories
  **/
  @ApiModelProperty(value = "Category ID-s of the product")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public CreateUpdateProduct parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent product id of the product
   * @return parentId
  **/
  @ApiModelProperty(value = "Parent product id of the product")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public CreateUpdateProduct metaInfo(Map<String, Object> metaInfo) {
    this.metaInfo = metaInfo;
    return this;
  }

  public CreateUpdateProduct putMetaInfoItem(String key, Object metaInfoItem) {
    if (this.metaInfo == null) {
      this.metaInfo = new HashMap<String, Object>();
    }
    this.metaInfo.put(key, metaInfoItem);
    return this;
  }

   /**
   * Meta data of product such as description, vendor, producer, stock level. The size of cumulative metaInfo shall not exceed **1000 KB**. Maximum length of metaInfo object can be 10.
   * @return metaInfo
  **/
  @ApiModelProperty(example = "{\"description\":\"Shoes for sports\",\"brand\":\"addidas\"}", value = "Meta data of product such as description, vendor, producer, stock level. The size of cumulative metaInfo shall not exceed **1000 KB**. Maximum length of metaInfo object can be 10.")
  public Map<String, Object> getMetaInfo() {
    return metaInfo;
  }

  public void setMetaInfo(Map<String, Object> metaInfo) {
    this.metaInfo = metaInfo;
  }

  public CreateUpdateProduct updateEnabled(Boolean updateEnabled) {
    this.updateEnabled = updateEnabled;
    return this;
  }

   /**
   * Facilitate to update the existing category in the same request (updateEnabled &#x3D; true)
   * @return updateEnabled
  **/
  @ApiModelProperty(example = "false", value = "Facilitate to update the existing category in the same request (updateEnabled = true)")
  public Boolean isUpdateEnabled() {
    return updateEnabled;
  }

  public void setUpdateEnabled(Boolean updateEnabled) {
    this.updateEnabled = updateEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CreateUpdateProduct createUpdateProduct = (CreateUpdateProduct) o;
    return ObjectUtils.equals(this.id, createUpdateProduct.id) &&
    ObjectUtils.equals(this.name, createUpdateProduct.name) &&
    ObjectUtils.equals(this.url, createUpdateProduct.url) &&
    ObjectUtils.equals(this.imageUrl, createUpdateProduct.imageUrl) &&
    ObjectUtils.equals(this.sku, createUpdateProduct.sku) &&
    ObjectUtils.equals(this.price, createUpdateProduct.price) &&
    ObjectUtils.equals(this.categories, createUpdateProduct.categories) &&
    ObjectUtils.equals(this.parentId, createUpdateProduct.parentId) &&
    ObjectUtils.equals(this.metaInfo, createUpdateProduct.metaInfo) &&
    ObjectUtils.equals(this.updateEnabled, createUpdateProduct.updateEnabled);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, name, url, imageUrl, sku, price, categories, parentId, metaInfo, updateEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUpdateProduct {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    metaInfo: ").append(toIndentedString(metaInfo)).append("\n");
    sb.append("    updateEnabled: ").append(toIndentedString(updateEnabled)).append("\n");
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
