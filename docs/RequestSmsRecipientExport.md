
# RequestSmsRecipientExport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notifyURL** | **String** | URL that will be called once the export process is finished. For reference, https://help.sendinblue.com/hc/en-us/articles/360007666479 |  [optional]
**recipientsType** | [**RecipientsTypeEnum**](#RecipientsTypeEnum) | Filter the recipients based on how they interacted with the campaign | 


<a name="RecipientsTypeEnum"></a>
## Enum: RecipientsTypeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
DELIVERED | &quot;delivered&quot;
ANSWERED | &quot;answered&quot;
SOFTBOUNCES | &quot;softBounces&quot;
HARDBOUNCES | &quot;hardBounces&quot;
UNSUBSCRIBED | &quot;unsubscribed&quot;



