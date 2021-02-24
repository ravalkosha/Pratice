package com.example.multilayer;

import com.example.multilayer.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class MultilayerApplication {

	public static void main(String[] args) {

		SpringApplication.run(MultilayerApplication.class, args);
	}

//	@GetMapping
//	public List<Student> hello(){
//
//		return List.of(
//				new Student(
//						1L,
//						"Kosha",
//						"kosha.raval@gmail.com",
//						LocalDate.of(1992, Month.FEBRUARY,14),
//						29
//				)
//		);
//	}
}
