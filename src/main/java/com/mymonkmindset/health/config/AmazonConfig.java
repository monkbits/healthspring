package com.mymonkmindset.health.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.amazonaws.services.s3.AmazonS3;

//@Configuration
public class AmazonConfig {
//    @Bean
//    public AmazonS3 s3(){
////
////        AWSCredentials awsCredentials = new BasicAWSCredentials("AKIARYEUCVGK2SMJY6X5","yAbrs0CHfY6SmvcYsmA5GOEWwN+ATPw2/I4sOMdi");
////
////        return AmazonS3ClientBuilder
////                .standard()
////                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
//    }
}
