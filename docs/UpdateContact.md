
# UpdateContact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, String&gt;** |  |  [optional]
**emailBlacklisted** | **Boolean** | Blacklist the contact for emails (emailBlacklisted &#x3D; true) |  [optional]
**smsBlacklisted** | **Boolean** | Blacklist the contact for SMS (smsBlacklisted &#x3D; true) |  [optional]
**listIds** | **List&lt;Long&gt;** | Ids of the lists to add the contact to |  [optional]
**unlinkListIds** | **List&lt;Long&gt;** | Ids of the lists to remove the contact from |  [optional]
**smtpBlacklistSender** | **List&lt;String&gt;** | SMTP forbidden sender for contact. Use only for email Contact |  [optional]



