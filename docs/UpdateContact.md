
# UpdateContact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Object** | Pass the set of attributes to be updated. These attributes must be present in your account. For eg. {&#39;FNAME&#39;:&#39;Ellie&#39;, &#39;LNAME&#39;:&#39;Roger&#39;} |  [optional]
**emailBlacklisted** | **Boolean** | Set/unset this field to blacklist/allow the contact for emails (emailBlacklisted &#x3D; true) |  [optional]
**smsBlacklisted** | **Boolean** | Set/unset this field to blacklist/allow the contact for SMS (smsBlacklisted &#x3D; true) |  [optional]
**listIds** | **List&lt;Long&gt;** | Ids of the lists to add the contact to |  [optional]
**unlinkListIds** | **List&lt;Long&gt;** | Ids of the lists to remove the contact from |  [optional]
**smtpBlacklistSender** | **List&lt;String&gt;** | SMTP forbidden sender for contact. Use only for email Contact |  [optional]



