package kt.hello.playground.user

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import user.User
import user.saveUser

class RepositoryTest {
    @Test
    fun `save user with empty name should throw IllegalArgumentException`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            saveUser(User(1, "", "BKK"))
        }
    }

    @Test
    fun `save user with empty address should throw IllegalArgumentException`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            saveUser(User(1, "John", ""))
        }
    }

    @Test
    fun `save user with name and address should success`() {
        Assertions.assertDoesNotThrow {
            saveUser(User(1, "John", "BKK"))
        }
    }
}
