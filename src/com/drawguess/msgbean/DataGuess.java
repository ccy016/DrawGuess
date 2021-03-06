package com.drawguess.msgbean;

/**
 * 消息实体类
 * 
 * @author GuoJun
 */
public class DataGuess extends Entity {

    private String senderIMEI;
    private String sendTime;
    private String MsgContent;

    public DataGuess() {
    }

    public DataGuess(String paramSenderIMEI, String paramSendTime, String paramMsgContent) {
        this.senderIMEI = paramSenderIMEI;
        this.sendTime = paramSendTime;
        this.MsgContent = paramMsgContent;
    }



    /**
     * 获取消息发送方IMEI
     * 
     * @return
     */

    public String getSenderIMEI() {
        return senderIMEI;
    }

    /**
     * 设置消息发送方IMEI
     * 
     * @param paramSenderIMEI
     * 
     */
    public void setSenderIMEI(String paramSenderIMEI) {
        this.senderIMEI = paramSenderIMEI;
    }



    /**
     * 获取消息发送时间
     * 
     * @return
     */
    public String getSendTime() {
        return sendTime;
    }

    /**
     * 设置消息发送时间
     * 
     * @param paramSendTime
     *            发送时间,格式 xx年xx月xx日 xx:xx:xx
     */
    public void setSendTime(String paramSendTime) {
        this.sendTime = paramSendTime;
    }

    /**
     * 获取消息内容
     * 
     * @return
     */
    public String getMsgContent() {
        return MsgContent;
    }

    /**
     * 设置消息内容
     * 
     * @param paramMsgContent
     */
    public void setMsgContent(String paramMsgContent) {
        this.MsgContent = paramMsgContent;
    }

    /**
     * 克隆对象
     * 
     * @param
     */
    public DataGuess clone() {
        return new DataGuess(senderIMEI, sendTime, MsgContent);
    }

}
