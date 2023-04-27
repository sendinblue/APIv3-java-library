
# SsoTokenRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Id of the sub-account organization | 
**email** | **String** | User email of sub-account organization |  [optional]
**target** | [**TargetEnum**](#TargetEnum) | Set target after login success * automation - Redirect to Automation after login * email_campaign - Redirect to Email Campaign after login * contacts - Redirect to Contacts after login * landing_pages - Redirect to Landing Pages after login * email_transactional - Redirect to Email Transactional after login * senders - Redirect to Contacts after login * sms_campaign - Redirect to Sms Campaign after login * sms_transactional - Redirect to Sms Transactional after login  |  [optional]


<a name="TargetEnum"></a>
## Enum: TargetEnum
Name | Value
---- | -----
AUTOMATION | &quot;automation&quot;
EMAIL_CAMPAIGN | &quot;email_campaign&quot;
CONTACTS | &quot;contacts&quot;
LANDING_PAGES | &quot;landing_pages&quot;
EMAIL_TRANSACTIONAL | &quot;email_transactional&quot;
SENDERS | &quot;senders&quot;
SMS_CAMPAIGN | &quot;sms_campaign&quot;
SMS_TRANSACTIONAL | &quot;sms_transactional&quot;



