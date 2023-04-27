
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID of the order. | 
**createdAt** | **String** | Event occurrence UTC date-time (YYYY-MM-DDTHH:mm:ssZ), when order is actually created. | 
**updatedAt** | **String** | Event updated UTC date-time (YYYY-MM-DDTHH:mm:ssZ), when the status of the order is actually changed/updated. | 
**status** | **String** | State of the order. | 
**amount** | [**BigDecimal**](BigDecimal.md) | Total amount of the order, including all shipping expenses, tax and the price of items. | 
**products** | [**List&lt;OrderProducts&gt;**](OrderProducts.md) |  | 
**email** | **String** | Email of the contact, Mandatory if &quot;phone&quot; field is not passed in &quot;billing&quot; parameter. |  [optional]
**billing** | [**OrderBilling**](OrderBilling.md) |  |  [optional]
**coupons** | **List&lt;String&gt;** | Coupons applied to the order. Stored case insensitive. |  [optional]



