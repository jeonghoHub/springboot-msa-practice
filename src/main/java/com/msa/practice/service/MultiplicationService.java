package com.msa.practice.service;

import com.msa.practice.domain.Multiplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface MultiplicationService {
    /**
     * 두 개의 무작위 인수를 담은 {@link Multiplication} 객체를 생성한다.
     * 무작위로 생성되는 숫자의 범위는 11-99.
     *
     * @return 무작위 인수를 담은 {@link Multiplication} 객체
     */

    Multiplication createRandomMultiplication();

    @Service
    class MultiplicationServiceImpl implements MultiplicationService {
        private RandomGeneratorService randomGeneratorService;
        public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
            this.randomGeneratorService = randomGeneratorService;
        }

        @Override
        public Multiplication createRandomMultiplication() {
            int factorA = randomGeneratorService.generateRandomFactor();
            int factorB = randomGeneratorService.generateRandomFactor();
            return new Multiplication(factorA, factorB);
        }
    }
}
