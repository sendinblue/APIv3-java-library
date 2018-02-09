
# GetWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | URL of the webhook | 
**id** | **Long** | ID of the webhook | 
**description** | **String** | Description of the webhook | 
**events** | **List&lt;String&gt;** |  | 
**type** | [**TypeEnum**](#TypeEnum) | Type of webhook (marketing or transac) | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Creation UTC date-time of the webhook (YYYY-MM-DDTHH:mm:ss.SSSZ) | 
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Last modification UTC date-time of the webhook (YYYY-MM-DDTHH:mm:ss.SSSZ) | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
MARKETING | &quot;marketing&quot;
TRANSAC | &quot;transac&quot;



