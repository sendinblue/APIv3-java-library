
# SendEmail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailTo** | **List&lt;String&gt;** | List of the email addresses of the recipients. For example, [&quot;abc@example.com&quot;, &quot;asd@example.com&quot;]. | 
**emailBcc** | **List&lt;String&gt;** | List of the email addresses of the recipients in bcc |  [optional]
**emailCc** | **List&lt;String&gt;** | List of the email addresses of the recipients in cc |  [optional]
**replyTo** | **String** | Email address which shall be used by campaign recipients to reply back |  [optional]
**attachmentUrl** | **String** | Absolute url of the attachment (no local file). Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps |  [optional]
**attachment** | [**List&lt;SendEmailAttachment&gt;**](SendEmailAttachment.md) | Pass the list of content ( byte array which is encoded to base64 chunk data at our end ) and name of the attachment. For example, [{&quot;content&quot;:&quot;byte array content 1&quot;, &quot;name&quot;:&quot;attcahment1&quot;}, {&quot;content&quot;:&quot;byte array content 2&quot;, &quot;name&quot;:&quot;attcahment2&quot;}]. |  [optional]
**headers** | **Object** | Pass the set of headers that shall be sent along the mail headers in the original email. &#39;X-Mailin-IP&#39; header can be set (only for dedicated ip users) to mention the IP to be used for sending transactional emails. For example, {&quot;Content-Type&quot;:&quot;text/html&quot;, &quot;charset&quot;:&quot;iso-8859-1&quot;, &quot;X-Mailin-IP&quot;:&quot;1.2.3.4&quot;} |  [optional]
**attributes** | **Object** | Pass the set of attributes to customize the template. For example, {&quot;FNAME&quot;:&quot;Joe&quot;, &quot;LNAME&quot;:&quot;Doe&quot;} |  [optional]
**tags** | **List&lt;String&gt;** | Tag your emails to find them more easily |  [optional]



