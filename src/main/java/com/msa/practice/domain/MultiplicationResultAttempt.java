package com.msa.practice.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public record MultiplicationResultAttempt(User user,
                                          Multiplication multiplication,
                                          int resultAttempt) {

}
