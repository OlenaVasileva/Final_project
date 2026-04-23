package user;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Listing {

    private String listingName;
    private String price;
    private String description;
    }
