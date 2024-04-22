package com.nikky.emails1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgresSqlDataSource implements DataSource{

    @Override
    public String[] getEmails() {
        String[] emails = {"nik@gmail.com","jaisnik@yahoo.com"};
        return emails;
    }
}
