
# SendTransacSms

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sender** | **String** | Name of the sender. Only alphanumeric characters. No more than 11 characters | 
**recipient** | **String** | Mobile number to send SMS with the country code | 
**content** | **String** | Content of the message. If more than 160 characters long, multiple text messages will be sent | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the SMS |  [optional]
**tag** | **String** | Tag of the message |  [optional]
**webUrl** | **String** | Webhook to call for each event triggered by the message (delivered etc.) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRANSACTIONAL | &quot;transactional&quot;
MARKETING | &quot;marketing&quot;



