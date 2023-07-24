package com.msa.practice.controller;

import com.msa.practice.domain.Multiplication;
import com.msa.practice.service.MultiplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/multiplications")
public class MultiplicationController {
    private final MultiplicationService multiplicationService;

    @GetMapping("/random")
    public Multiplication getRandomMultiplication() {
        return multiplicationService.createRandomMultiplication();
    }

}
