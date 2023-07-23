package com.msa.practice.controller;

import com.msa.practice.service.MultiplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MultiplicationController {
    private final MultiplicationService multiplicationService;

}
