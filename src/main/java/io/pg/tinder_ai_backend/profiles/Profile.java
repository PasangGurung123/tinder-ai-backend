package io.pg.tinder_ai_backend.profiles;

public record Profile(
        String id,
        String firstName,
        String lastName,
        int age,
        String bio,
        String ethnicity,
        Gender gender,
        String imageUrl,
        String myersBriggsPersonalityType
) {
}
