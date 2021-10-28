package com.darania.BracketChecker;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BracketCheckerTest {


    @Test
    void correctNumberOfBrackets() {

        //given
        String input = "{()}";
       // String expected =
        //when
        BracketChecker checker = new BracketChecker();
        boolean actual = checker.bracketChecker(input);
        //here you want to call the function, the function is bracketChecker so try checker.bracketChecker
        //then
        assertThat(actual).isEqualTo(true);

        //here you want to say the expected result, so the string in line 17 would return true.
        // so line 20 runs your function and in line 24 you have to physically write in the correct result where you wrote isEqualto(input) and then the test is making sure they match
        //this should be either true or false since our function only returns a boolean,so in otherwords since the string in line 17 does have matching opening/closing brackets it should return true, so your expected is (true)
    }

    @Test
    void inCorrectNumberOfBrackets () {

        //given
        String input = "[{()]";
        //when
        BracketChecker checker = new BracketChecker();
        boolean actual = checker.bracketChecker(input);
        //then
        assertThat(actual).isEqualTo(false);

    }

    @Test
    void inputIsEmpty() {

        //given
        String input = "";
        //when
        BracketChecker checker = new BracketChecker();
        boolean actual = checker.bracketChecker(input);
        //then
        assertThat(actual).isEqualTo(false);
    }

}