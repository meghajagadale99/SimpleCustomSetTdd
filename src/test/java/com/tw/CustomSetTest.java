package com.tw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public
class CustomSetTest {

    //Red = Green = Blue
    //Test Fail = Test Pass = Refactor

    @Test
    void shouldReturnTrueWhenSetIsEmpty() {
        //A  Arrange = Given
        CustomSet customSet = new CustomSet();
        //A  Act     = When
        boolean isEmpty = customSet.isEmpty();
        //A Assert   = Then
        assertTrue(isEmpty);
    }

}
