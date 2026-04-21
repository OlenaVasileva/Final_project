package random;

import com.github.javafaker.Faker;
import user.User;



public class UserFactory {
    private static final Faker FAKER = new Faker();

    public static User createRandom() {
        String generatedPassword = FAKER.internet().password(6, 20, true, true);
        return User.builder()
                .email(FAKER.internet().safeEmailAddress())
                .password(generatedPassword)
                .confirmPasswordField(generatedPassword)
                .build();

    }
}
