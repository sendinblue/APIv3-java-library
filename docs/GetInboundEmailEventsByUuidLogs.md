
# GetInboundEmailEventsByUuidLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**] | Date of the event |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the event |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
RECEIVED | &quot;received&quot;
PROCESSED | &quot;processed&quot;
WEBHOOKFAILED | &quot;webhookFailed&quot;
WEBHOOKDELIVERED | &quot;webhookDelivered&quot;



