package com.viswekshal.atheneum.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

/**
 *  @author Vishal Vyavahare
 */
@Api(tags = "Books API", value = "All the Books related API")
@RequiredArgsConstructor
@RestController
@RequestMapping(value =  "/v1")
public class BooksController {

    @GetMapping("/books")
    public String getAllBooks() {
        return "Vishal";
    }

    @PostMapping("/book")
    public String createBook() {
        return null;
    }

}