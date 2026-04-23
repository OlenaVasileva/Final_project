package random;

import com.github.javafaker.Faker;
import user.Listing;

public class ListingFactory {
    private static final Faker FAKER = new Faker();

    public static Listing createRandomListing() {
        String listingName = FAKER.commerce().productName();

        return Listing.builder()
                .listingName(FAKER.commerce().productName())
                .price(String.valueOf(FAKER.number().numberBetween(1000, 100000)))
                .description(FAKER.lorem().paragraph() + " Это объявление о продаже: " + listingName + ". " + FAKER.lorem().sentence())
                .build();
    }

}
