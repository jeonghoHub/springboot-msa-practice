package com.msa.practice.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 사용자 정보를 저장하는 클래스
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public record User(String alias) {
}
