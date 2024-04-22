package com.nikky.emails1;

import org.springframework.stereotype.Component;

@Component
public abstract class MySqlDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        String[] emails = {"nik@gmail.com","jaisnik@yahoo.com"};
        return emails;
    }

}
