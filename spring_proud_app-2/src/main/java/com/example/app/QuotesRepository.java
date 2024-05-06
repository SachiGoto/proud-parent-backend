package com.example.app;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quotes, Long> {

}
