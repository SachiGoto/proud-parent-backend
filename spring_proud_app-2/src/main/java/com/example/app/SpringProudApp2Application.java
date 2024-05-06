package com.example.app;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProudApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProudApp2Application.class, args);
	}
	public record Quotes(Long id, String quotes, String category, String author, LocalDate created_at, int age) {}

}
