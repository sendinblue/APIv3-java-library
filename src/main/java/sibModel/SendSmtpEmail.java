/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import sibModel.SendSmtpEmailAttachment;
import sibModel.SendSmtpEmailBcc;
import sibModel.SendSmtpEmailCc;
import sibModel.SendSmtpEmailMessageVersions;
import sibModel.SendSmtpEmailReplyTo;
import sibModel.SendSmtpEmailSender;
import sibModel.SendSmtpEmailTo;

/**
 * SendSmtpEmail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class SendSmtpEmail {
  @SerializedName("sender")
  private SendSmtpEmailSender sender = null;

  @SerializedName("to")
  private List<SendSmtpEmailTo> to = null;

  @SerializedName("bcc")
  private List<SendSmtpEmailBcc> bcc = null;

  @SerializedName("cc")
  private List<SendSmtpEmailCc> cc = null;

  @SerializedName("htmlContent")
  private String htmlContent = null;

  @SerializedName("textContent")
  private String textContent = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("replyTo")
  private SendSmtpEmailReplyTo replyTo = null;

  @SerializedName("attachment")
  private List<SendSmtpEmailAttachment> attachment = null;

  @SerializedName("headers")
  private Object headers = null;

  @SerializedName("templateId")
  private Long templateId = null;

  @SerializedName("params")
  private Object params = null;

  @SerializedName("messageVersions")
  private List<SendSmtpEmailMessageVersions> messageVersions = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("scheduledAt")
  private OffsetDateTime scheduledAt = null;

  @SerializedName("batchId")
  private String batchId = null;

  public SendSmtpEmail sender(SendSmtpEmailSender sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")
  public SendSmtpEmailSender getSender() {
    return sender;
  }

  public void setSender(SendSmtpEmailSender sender) {
    this.sender = sender;
  }

  public SendSmtpEmail to(List<SendSmtpEmailTo> to) {
    this.to = to;
    return this;
  }

  public SendSmtpEmail addToItem(SendSmtpEmailTo toItem) {
    if (this.to == null) {
      this.to = new ArrayList<SendSmtpEmailTo>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Mandatory if messageVersions are not passed, ignored if messageVersions are passed. List of email addresses and names (optional) of the recipients. For example, [{\&quot;name\&quot;:\&quot;Jimmy\&quot;, \&quot;email\&quot;:\&quot;jimmy98@example.com\&quot;}, {\&quot;name\&quot;:\&quot;Joe\&quot;, \&quot;email\&quot;:\&quot;joe@example.com\&quot;}]
   * @return to
  **/
  @ApiModelProperty(value = "Mandatory if messageVersions are not passed, ignored if messageVersions are passed. List of email addresses and names (optional) of the recipients. For example, [{\"name\":\"Jimmy\", \"email\":\"jimmy98@example.com\"}, {\"name\":\"Joe\", \"email\":\"joe@example.com\"}]")
  public List<SendSmtpEmailTo> getTo() {
    return to;
  }

  public void setTo(List<SendSmtpEmailTo> to) {
    this.to = to;
  }

  public SendSmtpEmail bcc(List<SendSmtpEmailBcc> bcc) {
    this.bcc = bcc;
    return this;
  }

  public SendSmtpEmail addBccItem(SendSmtpEmailBcc bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<SendSmtpEmailBcc>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * List of email addresses and names (optional) of the recipients in bcc
   * @return bcc
  **/
  @ApiModelProperty(value = "List of email addresses and names (optional) of the recipients in bcc")
  public List<SendSmtpEmailBcc> getBcc() {
    return bcc;
  }

  public void setBcc(List<SendSmtpEmailBcc> bcc) {
    this.bcc = bcc;
  }

  public SendSmtpEmail cc(List<SendSmtpEmailCc> cc) {
    this.cc = cc;
    return this;
  }

  public SendSmtpEmail addCcItem(SendSmtpEmailCc ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<SendSmtpEmailCc>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * List of email addresses and names (optional) of the recipients in cc
   * @return cc
  **/
  @ApiModelProperty(value = "List of email addresses and names (optional) of the recipients in cc")
  public List<SendSmtpEmailCc> getCc() {
    return cc;
  }

  public void setCc(List<SendSmtpEmailCc> cc) {
    this.cc = cc;
  }

  public SendSmtpEmail htmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

   /**
   * HTML body of the message ( Mandatory if &#39;templateId&#39; is not passed, ignored if &#39;templateId&#39; is passed )
   * @return htmlContent
  **/
  @ApiModelProperty(example = "<!DOCTYPE html> <html> <body> <h1>Confirm you email</h1> <p>Please confirm your email address by clicking on the link below</p> </body> </html>", value = "HTML body of the message ( Mandatory if 'templateId' is not passed, ignored if 'templateId' is passed )")
  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public SendSmtpEmail textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

   /**
   * Plain Text body of the message ( Ignored if &#39;templateId&#39; is passed )
   * @return textContent
  **/
  @ApiModelProperty(example = "Please confirm your email address by clicking on the link https://text.domain.com", value = "Plain Text body of the message ( Ignored if 'templateId' is passed )")
  public String getTextContent() {
    return textContent;
  }

  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }

  public SendSmtpEmail subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the message. Mandatory if &#39;templateId&#39; is not passed
   * @return subject
  **/
  @ApiModelProperty(example = "Login Email confirmation", value = "Subject of the message. Mandatory if 'templateId' is not passed")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public SendSmtpEmail replyTo(SendSmtpEmailReplyTo replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @ApiModelProperty(value = "")
  public SendSmtpEmailReplyTo getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(SendSmtpEmailReplyTo replyTo) {
    this.replyTo = replyTo;
  }

  public SendSmtpEmail attachment(List<SendSmtpEmailAttachment> attachment) {
    this.attachment = attachment;
    return this;
  }

  public SendSmtpEmail addAttachmentItem(SendSmtpEmailAttachment attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<SendSmtpEmailAttachment>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

   /**
   * Pass the absolute URL (no local file) or the base64 content of the attachment along with the attachment name (Mandatory if attachment content is passed). For example, &#x60;[{\&quot;url\&quot;:\&quot;https://attachment.domain.com/myAttachmentFromUrl.jpg\&quot;, \&quot;name\&quot;:\&quot;myAttachmentFromUrl.jpg\&quot;}, {\&quot;content\&quot;:\&quot;base64 example content\&quot;, \&quot;name\&quot;:\&quot;myAttachmentFromBase64.jpg\&quot;}]&#x60;. Allowed extensions for attachment file: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub, eps, odt, mp3, m4a, m4v, wma, ogg, flac, wav, aif, aifc, aiff, mp4, mov, avi, mkv, mpeg, mpg, wmv, pkpass and xlsm ( If &#39;templateId&#39; is passed and is in New Template Language format then both attachment url and content are accepted. If template is in Old template Language format, then &#39;attachment&#39; is ignored )
   * @return attachment
  **/
  @ApiModelProperty(value = "Pass the absolute URL (no local file) or the base64 content of the attachment along with the attachment name (Mandatory if attachment content is passed). For example, `[{\"url\":\"https://attachment.domain.com/myAttachmentFromUrl.jpg\", \"name\":\"myAttachmentFromUrl.jpg\"}, {\"content\":\"base64 example content\", \"name\":\"myAttachmentFromBase64.jpg\"}]`. Allowed extensions for attachment file: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub, eps, odt, mp3, m4a, m4v, wma, ogg, flac, wav, aif, aifc, aiff, mp4, mov, avi, mkv, mpeg, mpg, wmv, pkpass and xlsm ( If 'templateId' is passed and is in New Template Language format then both attachment url and content are accepted. If template is in Old template Language format, then 'attachment' is ignored )")
  public List<SendSmtpEmailAttachment> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<SendSmtpEmailAttachment> attachment) {
    this.attachment = attachment;
  }

  public SendSmtpEmail headers(Object headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Pass the set of custom headers (not the standard headers) that shall be sent along the mail headers in the original email. &#39;sender.ip&#39; header can be set (only for dedicated ip users) to mention the IP to be used for sending transactional emails. Headers are allowed in &#x60;This-Case-Only&#x60; (i.e. words separated by hyphen with first letter of each word in capital letter), they will be converted to such case styling if not in this format in the request payload. For example, &#x60;{\&quot;sender.ip\&quot;:\&quot;1.2.3.4\&quot;, \&quot;X-Mailin-custom\&quot;:\&quot;some_custom_header\&quot;, \&quot;idempotencyKey\&quot;:\&quot;abc-123\&quot;}&#x60;.
   * @return headers
  **/
  @ApiModelProperty(example = "{\"sender.ip\":\"1.2.3.4\",\"X-Mailin-custom\":\"some_custom_header\",\"idempotencyKey\":\"abc-123\"}", value = "Pass the set of custom headers (not the standard headers) that shall be sent along the mail headers in the original email. 'sender.ip' header can be set (only for dedicated ip users) to mention the IP to be used for sending transactional emails. Headers are allowed in `This-Case-Only` (i.e. words separated by hyphen with first letter of each word in capital letter), they will be converted to such case styling if not in this format in the request payload. For example, `{\"sender.ip\":\"1.2.3.4\", \"X-Mailin-custom\":\"some_custom_header\", \"idempotencyKey\":\"abc-123\"}`.")
  public Object getHeaders() {
    return headers;
  }

  public void setHeaders(Object headers) {
    this.headers = headers;
  }

  public SendSmtpEmail templateId(Long templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Id of the template.
   * @return templateId
  **/
  @ApiModelProperty(example = "2", value = "Id of the template.")
  public Long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }

  public SendSmtpEmail params(Object params) {
    this.params = params;
    return this;
  }

   /**
   * Pass the set of attributes to customize the template. For example, {\&quot;FNAME\&quot;:\&quot;Joe\&quot;, \&quot;LNAME\&quot;:\&quot;Doe\&quot;}. It&#39;s considered only if template is in New Template Language format.
   * @return params
  **/
  @ApiModelProperty(example = "{\"FNAME\":\"Joe\",\"LNAME\":\"Doe\"}", value = "Pass the set of attributes to customize the template. For example, {\"FNAME\":\"Joe\", \"LNAME\":\"Doe\"}. It's considered only if template is in New Template Language format.")
  public Object getParams() {
    return params;
  }

  public void setParams(Object params) {
    this.params = params;
  }

  public SendSmtpEmail messageVersions(List<SendSmtpEmailMessageVersions> messageVersions) {
    this.messageVersions = messageVersions;
    return this;
  }

  public SendSmtpEmail addMessageVersionsItem(SendSmtpEmailMessageVersions messageVersionsItem) {
    if (this.messageVersions == null) {
      this.messageVersions = new ArrayList<SendSmtpEmailMessageVersions>();
    }
    this.messageVersions.add(messageVersionsItem);
    return this;
  }

   /**
   * You can customize and send out multiple versions of a mail. templateId can be customized only if global parameter contains templateId. htmlContent and textContent can be customized only if any of the two, htmlContent or textContent, is present in global parameters. Some global parameters such as **to(mandatory), bcc, cc, replyTo, subject** can also be customized specific to each version. Total number of recipients in one API request must not exceed 2000. However, you can still pass upto 99 recipients maximum in one message version. The size of individual params in all the messageVersions shall not exceed 100 KB limit and that of cumulative params shall not exceed 1000 KB. You can follow this **step-by-step guide** on how to use **messageVersions** to batch send emails - https://developers.sendinblue.com/docs/batch-send-transactional-emails
   * @return messageVersions
  **/
  @ApiModelProperty(value = "You can customize and send out multiple versions of a mail. templateId can be customized only if global parameter contains templateId. htmlContent and textContent can be customized only if any of the two, htmlContent or textContent, is present in global parameters. Some global parameters such as **to(mandatory), bcc, cc, replyTo, subject** can also be customized specific to each version. Total number of recipients in one API request must not exceed 2000. However, you can still pass upto 99 recipients maximum in one message version. The size of individual params in all the messageVersions shall not exceed 100 KB limit and that of cumulative params shall not exceed 1000 KB. You can follow this **step-by-step guide** on how to use **messageVersions** to batch send emails - https://developers.sendinblue.com/docs/batch-send-transactional-emails")
  public List<SendSmtpEmailMessageVersions> getMessageVersions() {
    return messageVersions;
  }

  public void setMessageVersions(List<SendSmtpEmailMessageVersions> messageVersions) {
    this.messageVersions = messageVersions;
  }

  public SendSmtpEmail tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SendSmtpEmail addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tag your emails to find them more easily
   * @return tags
  **/
  @ApiModelProperty(value = "Tag your emails to find them more easily")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SendSmtpEmail scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * UTC date-time on which the email has to schedule (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for scheduling. There can be an expected delay of +5 minutes in scheduled email delivery. **Please note this feature is currently a public beta**.
   * @return scheduledAt
  **/
  @ApiModelProperty(example = "2022-04-05T12:30:00+02:00", value = "UTC date-time on which the email has to schedule (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for scheduling. There can be an expected delay of +5 minutes in scheduled email delivery. **Please note this feature is currently a public beta**.")
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public SendSmtpEmail batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Valid UUIDv4 batch id to identify the scheduled batches transactional email. If not passed we will create a valid UUIDv4 batch id at our end.
   * @return batchId
  **/
  @ApiModelProperty(example = "5c6cfa04-eed9-42c2-8b5c-6d470d978e9d", value = "Valid UUIDv4 batch id to identify the scheduled batches transactional email. If not passed we will create a valid UUIDv4 batch id at our end.")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SendSmtpEmail sendSmtpEmail = (SendSmtpEmail) o;
    return ObjectUtils.equals(this.sender, sendSmtpEmail.sender) &&
    ObjectUtils.equals(this.to, sendSmtpEmail.to) &&
    ObjectUtils.equals(this.bcc, sendSmtpEmail.bcc) &&
    ObjectUtils.equals(this.cc, sendSmtpEmail.cc) &&
    ObjectUtils.equals(this.htmlContent, sendSmtpEmail.htmlContent) &&
    ObjectUtils.equals(this.textContent, sendSmtpEmail.textContent) &&
    ObjectUtils.equals(this.subject, sendSmtpEmail.subject) &&
    ObjectUtils.equals(this.replyTo, sendSmtpEmail.replyTo) &&
    ObjectUtils.equals(this.attachment, sendSmtpEmail.attachment) &&
    ObjectUtils.equals(this.headers, sendSmtpEmail.headers) &&
    ObjectUtils.equals(this.templateId, sendSmtpEmail.templateId) &&
    ObjectUtils.equals(this.params, sendSmtpEmail.params) &&
    ObjectUtils.equals(this.messageVersions, sendSmtpEmail.messageVersions) &&
    ObjectUtils.equals(this.tags, sendSmtpEmail.tags) &&
    ObjectUtils.equals(this.scheduledAt, sendSmtpEmail.scheduledAt) &&
    ObjectUtils.equals(this.batchId, sendSmtpEmail.batchId);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(sender, to, bcc, cc, htmlContent, textContent, subject, replyTo, attachment, headers, templateId, params, messageVersions, tags, scheduledAt, batchId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSmtpEmail {\n");
    
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    messageVersions: ").append(toIndentedString(messageVersions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

