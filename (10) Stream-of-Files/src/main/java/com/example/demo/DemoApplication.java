package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Path path = Paths.get("text.txt");
        try (Stream<String> lines = Files.lines(path, Charset.forName("UTF-8"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
