package com.msa.practice.domain;

/**
 * {@link User}가 {@link Multiplication}을 계사한 답안을 정의한 클래스
 */
public record MultiplicationResultAttempt(User user,
                                          Multiplication multiplication,
                                          int resultAttempt) {

}
