
# GetSmsCampaignOverview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID of the SMS Campaign | 
**name** | **String** | Name of the SMS Campaign | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the SMS Campaign | 
**content** | **String** | Content of the SMS Campaign | 
**scheduledAt** | [**OffsetDateTime**](OffsetDateTime.md) | UTC date-time on which SMS campaign is scheduled. Should be in YYYY-MM-DDTHH:mm:ss.SSSZ format | 
**testSent** | **Boolean** | Retrieved the status of test SMS sending. (true&#x3D;Test SMS has been sent  false&#x3D;Test SMS has not been sent) | 
**sender** | **String** | Sender of the SMS Campaign | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Creation UTC date-time of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ) | 
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | UTC date-time of last modification of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ) | 


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



