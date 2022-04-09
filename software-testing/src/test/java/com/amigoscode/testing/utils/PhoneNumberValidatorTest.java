package com.amigoscode.testing.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PhoneNumberValidatorTest {

  private PhoneNumberValidator underTest;

  @BeforeEach
  void setUp() {
    underTest = new PhoneNumberValidator();
  }

  @ParameterizedTest
  @CsvSource({
      "+447000000000, true",
      "+4470000000009, false",
      "447000000000, false"
  })
  void itShouldValidatePhoneNumber(String phoneNumber, boolean expected) {

    // When
    boolean isValid = underTest.test(phoneNumber);

    // Then
    assertThat(isValid).isEqualTo(expected);
  }
/*
  @Test
  @DisplayName("Should fail when length is bigger than 13")
  void itShouldValidatePhoneNumberWhenIncorrectAndHasLengthBiggerThan13() {

    // When
    boolean isValid = underTest.test(phoneNumber);

    // Then
    assertThat(isValid).isFalse();
  }

  @Test
  @DisplayName("Should fail when it does not start with +")
  void itShouldValidatePhoneNumberWhenItDoesNotStartWithPlusSign() {

    // When
    boolean isValid = underTest.test(phoneNumber);

    // Then
    assertThat(isValid).isFalse();
  }
 */
}
