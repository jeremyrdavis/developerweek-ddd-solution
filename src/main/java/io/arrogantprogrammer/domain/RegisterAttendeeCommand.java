package io.arrogantprogrammer.domain;

import java.net.URL;

public record RegisterAttendeeCommand(
        String email,
        String firstName,
        String lastName,
        boolean student,
        boolean impactedByLayoffs,
        TShirtSize tShirtSize,
        MealPreference mealPreference,
        String streetAddress,
        String streetAddress2,
        String city,
        String postalCode,
        String stateOrProvince,
        String countryCode,
        String referringURL) {
}
