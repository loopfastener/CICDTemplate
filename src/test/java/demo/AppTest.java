/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void appHasAGreeting2() {
        assertNotNull("hello", "hello is not null");
    }

    @Test void appHasAGreeting3() {
        assertNotNull("hello2", "hello2 is also not null");
    }
}
