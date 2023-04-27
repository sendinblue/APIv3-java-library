
# CreateUpdateProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Product ID for which you requested the details | 
**name** | **String** | Mandatory in case of creation**. Name of the product for which you requested the details | 
**url** | **String** | URL to the product |  [optional]
**imageUrl** | **String** | Absolute URL to the cover image of the product |  [optional]
**sku** | **String** | Product identifier from the shop |  [optional]
**price** | **Float** | Price of the product |  [optional]
**categories** | **List&lt;String&gt;** | Category ID-s of the product |  [optional]
**parentId** | **String** | Parent product id of the product |  [optional]
**metaInfo** | **Map&lt;String, Object&gt;** | Meta data of product such as description, vendor, producer, stock level. The size of cumulative metaInfo shall not exceed **1000 KB**. Maximum length of metaInfo object can be 10. |  [optional]
**updateEnabled** | **Boolean** | Facilitate to update the existing category in the same request (updateEnabled &#x3D; true) |  [optional]



