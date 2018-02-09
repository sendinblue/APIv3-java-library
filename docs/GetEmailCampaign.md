
# GetEmailCampaign

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID of the campaign | 
**name** | **String** | Name of the campaign | 
**subject** | **String** | Subject of the campaign | 
**type** | [**TypeEnum**](#TypeEnum) | Type of campaign | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the campaign | 
**scheduledAt** | [**OffsetDateTime**](OffsetDateTime.md) | UTC date-time on which campaign is scheduled (YYYY-MM-DDTHH:mm:ss.SSSZ) |  [optional]
**testSent** | **Boolean** | Retrieved the status of test email sending. (true&#x3D;Test email has been sent  false&#x3D;Test email has not been sent) | 
**header** | **String** | Header of the campaign | 
**footer** | **String** | Footer of the campaign | 
**sender** | [**GetExtendedCampaignOverviewSender**](GetExtendedCampaignOverviewSender.md) |  | 
**replyTo** | **String** | Email defined as the \&quot;Reply to\&quot; of the campaign | 
**toField** | **String** | Customisation of the \&quot;to\&quot; field of the campaign | 
**htmlContent** | **String** | HTML content of the campaign | 
**shareLink** | **String** | Link to share the campaign on social medias |  [optional]
**tag** | **String** | Tag of the campaign | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Creation UTC date-time of the campaign (YYYY-MM-DDTHH:mm:ss.SSSZ) | 
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | UTC date-time of last modification of the campaign (YYYY-MM-DDTHH:mm:ss.SSSZ) | 
**inlineImageActivation** | **Boolean** | Status of inline image. inlineImageActivation &#x3D; false means image can’t be embedded, &amp; inlineImageActivation &#x3D; true means image can be embedded, in the email. |  [optional]
**mirrorActive** | **Boolean** | Status of mirror links in campaign. mirrorActive &#x3D; false means mirror links are deactivated, &amp; mirrorActive &#x3D; true means mirror links are activated, in the campaign |  [optional]
**recurring** | **Boolean** | FOR TRIGGER ONLY ! Type of trigger campaign.recurring &#x3D; false means contact can receive the same Trigger campaign only once, &amp; recurring &#x3D; true means contact can receive the same Trigger campaign several times |  [optional]


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



