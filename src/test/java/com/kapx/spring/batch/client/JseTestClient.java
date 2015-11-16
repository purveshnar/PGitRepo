package com.kapx.spring.batch.client;

import java.io.File;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class JseTestClient {
	@SuppressWarnings({ "resource", "rawtypes" })
	public static void main(String[] args) throws Exception {
		final String filePath = "src/test/resources/Contacts.txt";
		final File file = new File(filePath);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

		Job job = (Job) context.getBean("fileUploadJob");
		FlatFileItemReader itemReader = (FlatFileItemReader) context.getBean("itemReader");
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

		JobParametersBuilder jpBuilder = new JobParametersBuilder();
		itemReader.setResource(new FileSystemResource(file));
		jobLauncher.run(job, jpBuilder.toJobParameters());
		System.out.println("JseTestClient.main() - END");
	}
}