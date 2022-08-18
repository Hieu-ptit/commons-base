package com.viettel.api.model.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;

@Data
@Accessors(chain = true)
public class AccountResponse {
    private Long id;
    private String email;
    private String name;
    private String password;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
