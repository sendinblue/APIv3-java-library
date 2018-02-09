
# GetCampaignOverview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID of the campaign | 
**name** | **String** | Name of the campaign | 
**subject** | **String** | Subject of the campaign | 
**type** | [**TypeEnum**](#TypeEnum) | Type of campaign | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the campaign | 
**scheduledAt** | [**OffsetDateTime**](OffsetDateTime.md) | UTC date-time on which campaign is scheduled (YYYY-MM-DDTHH:mm:ss.SSSZ) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CLASSIC | &quot;classic&quot;
TRIGGER | &quot;trigger&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;draft&quot;
SENT | &quot;sent&quot;
ARCHIVE | &quot;archive&quot;
QUEUED | &quot;queued&quot;
SUSPENDED | &quot;suspended&quot;
IN_PROCESS | &quot;in_process&quot;



