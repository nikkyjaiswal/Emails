package com.nikky.emails1;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    private DataSource dataSource;

    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

     void sendEmails()
    {
        String[] emails= dataSource.getEmails();
        for(String email:emails)
        {
            System.out.println(email);
        }
    }
}
