package com.mail.mailbrain;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}