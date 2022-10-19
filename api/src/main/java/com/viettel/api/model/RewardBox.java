package com.viettel.api.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RewardBox {
    private Long id;
    private String name;
    private String description;
    private String image;
}
