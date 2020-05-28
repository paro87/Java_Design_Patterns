package com.paro.Behaviorial_Patterns.ChainOfResponsibilty.Type1;

public class ChainOfResponsibilityApp {
    public static void main(String[] args) {
        Receiver faxHandler, emailHandler;
        IssueRaiser issueRaiser=new IssueRaiser();
        faxHandler=new FaxErrorHandler();
        emailHandler=new EmailErrorHandler();

        issueRaiser.setFirstErrorHandler(faxHandler);
        faxHandler.nextErrorHandler(emailHandler);
        emailHandler.nextErrorHandler(null);

        Message message1=new Message("Fax is going slow", MessagePriority.NORMAL);
        Message message2=new Message("Emails are not reaching", MessagePriority.HIGH);
        Message message3=new Message("In Email, CC field is disabled always", MessagePriority.NORMAL);
        Message message4=new Message("Fax is not reaching destinations.", MessagePriority.HIGH);

        issueRaiser.raiseMessage(message1);
        issueRaiser.raiseMessage(message2);
        issueRaiser.raiseMessage(message3);
        issueRaiser.raiseMessage(message4);
    }
}
