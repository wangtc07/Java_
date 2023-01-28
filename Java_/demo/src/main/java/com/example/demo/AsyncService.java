package com.example.demo;

import com.amazonaws.services.pinpoint.model.MessageResult;

public interface AsyncService {
    MessageResult sendSms(String callPrefix, String mobile, String actionType, String content);

    MessageResult sendEmail(String email, String subject, String content);
}
