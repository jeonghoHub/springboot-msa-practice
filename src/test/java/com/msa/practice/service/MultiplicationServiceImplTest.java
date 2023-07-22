package com.msa.practice.service;

import com.msa.practice.domain.Multiplication;
import com.msa.practice.domain.MultiplicationResultAttempt;
import com.msa.practice.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.*;

class MultiplicationServiceImplTest {

    private MultiplicationService.MultiplicationServiceImpl multiplicationServiceImpl;

    @Mock
    private RandomGeneratorService randomGeneratorService;

    @BeforeEach
    void setUp() {
        multiplicationServiceImpl = new MultiplicationService.MultiplicationServiceImpl(randomGeneratorService);
    }

    @Test
    void createRandomMultiplication() {
    }

    @Test
    void checkCorrectAttemptTest() {
        // given
        Multiplication multiplication = new Multiplication(50, 60);
        User user = new User("usa_dev");
        MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user,
                multiplication, 3000);

        // when
        boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
        // assert
        assertThat(attemptResult).isTrue();
    }

    @Test
    void checkWrongAttemptTest() {
        // given
        Multiplication multiplication = new Multiplication(50, 60);
        User user = new User("usa_dev");
        MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user,
                multiplication, 3010);

        // when
        boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);

        // assert
        assertThat(attemptResult).isFalse();
    }
}