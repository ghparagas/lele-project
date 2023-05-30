package lele.project.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonNullAnnotationTest {

    @Test
    @DisplayName("Test null parameter. Throws NullPointerException")
    public void test1() {
        assertThrows(
                NullPointerException.class,
                () -> new NonNullAnnotation(null)
        );
    }

    @Test
    @DisplayName("Test non-null parameter. Does not throw NullPointerException")
    public void test2() {
        assertDoesNotThrow(() -> new NonNullAnnotation("NonNull"));
    }

}