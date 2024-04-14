package com.cleo.libraryapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
    @Bean
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }
}