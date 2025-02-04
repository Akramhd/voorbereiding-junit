package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {


    @Test
    void executeWithValidIntTest(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals(null, testValue);
    }
    @Test
    void executeWithValidIntTestmod3(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals(null, testValue);
    }
}