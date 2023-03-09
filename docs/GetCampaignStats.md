
# GetCampaignStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**listId** | **Long** | List Id of email campaign (only in case of get email campaign(s)(not for global stats)) |  [optional]
**uniqueClicks** | **Long** | Number of unique clicks for the campaign | 
**clickers** | **Long** | Number of total clicks for the campaign | 
**complaints** | **Long** | Number of complaints (Spam reports) for the campaign | 
**delivered** | **Long** | Number of delivered emails for the campaign | 
**sent** | **Long** | Number of sent emails for the campaign | 
**softBounces** | **Long** | Number of softbounce for the campaign | 
**hardBounces** | **Long** | Number of harbounce for the campaign | 
**uniqueViews** | **Long** | Number of unique openings for the campaign | 
**trackableViews** | **Long** | Recipients without any privacy protection option enabled in their email client | 
**trackableViewsRate** | **Float** | Rate of recipients without any privacy protection option enabled in their email client |  [optional]
**estimatedViews** | **Long** | Rate of recipients without any privacy protection option enabled in their email client, applied to all delivered emails |  [optional]
**unsubscriptions** | **Long** | Number of unsubscription for the campaign | 
**viewed** | **Long** | Number of openings for the campaign | 
**deferred** | **Long** | Number of deferred emails for the campaign |  [optional]
**returnBounce** | **Long** | Total number of non-delivered campaigns for a particular campaign id. |  [optional]



