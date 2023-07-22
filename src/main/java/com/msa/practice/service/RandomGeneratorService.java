package com.msa.practice.service;

import java.util.Random;

public interface RandomGeneratorService {

    /**
     * @return 무작위로 만든 11이상 99이하의 인사
     */
    int generateRandomFactor();

    class RandomGeneratorServiceImpl implements RandomGeneratorService {
        final static int MINIMUM_FACTOR = 11;
        final static int MAXIMUM_FACTOR = 99;

        @Override
        public int generateRandomFactor() {
            return new Random().nextInt((MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
        }
    }
}
