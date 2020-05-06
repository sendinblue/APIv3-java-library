
# GetSmtpTemplateOverview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID of the template | 
**name** | **String** | Name of the template | 
**subject** | **String** | Subject of the template | 
**isActive** | **Boolean** | Status of template (true&#x3D;active, false&#x3D;inactive) | 
**testSent** | **Boolean** | Status of test sending for the template (true&#x3D;test email has been sent, false&#x3D;test email has not been sent) | 
**sender** | [**GetSmtpTemplateOverviewSender**](GetSmtpTemplateOverviewSender.md) |  | 
**replyTo** | **String** | Email defined as the &#39;Reply to&#39; for the template | 
**toField** | **String** | Customisation of the &#39;to&#39; field for the template | 
**tag** | **String** | Tag of the template | 
**htmlContent** | **String** | HTML content of the template | 
**createdAt** | [**OffsetDateTime**] | Creation UTC date-time of the template (YYYY-MM-DDTHH:mm:ss.SSSZ) | 
**modifiedAt** | [**OffsetDateTime**] | Last modification UTC date-time of the template (YYYY-MM-DDTHH:mm:ss.SSSZ) | 



