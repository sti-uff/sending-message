/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.hermes.model;

import java.sql.Date;

/**
 *
 * @author dancastellani
 */
public class SendTask {

    /**
     * @return the sendTo
     */
    public String getSendTo() {
        return sendTo;
    }

    /**
     * @param sendTo the sendTo to set
     */
    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public enum Status {

        TODO, DOING, DONE;
    }
    private Integer id;
    private String sendTo;
    private String replyTo;
    private String subject;
    private String content;
    private Date createdAt = new Date(System.currentTimeMillis());
    private Status status;

    public SendTask(String to, String replyTo, String subject, String content) {
        this.sendTo = to;
        this.replyTo = replyTo;
        this.subject = subject;
        this.content = content;
        this.status = Status.TODO;
    }

    @Override
    public int hashCode() {
        return getSendTo().hashCode() + subject.hashCode() * 2 + content.hashCode() * 3;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "to: " + getSendTo() + ", replyTo: " + replyTo + ", subject: " + subject + ", content: " + content;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the replyTo
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * @param replyTo the replyTo to set
     */
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
}
