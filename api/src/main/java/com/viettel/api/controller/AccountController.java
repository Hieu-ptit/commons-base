package com.viettel.api.controller;

import com.viettel.api.model.request.AccountRequest;
import com.viettel.api.service.AccountService;
import com.viettel.commons.model.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
@Validated
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public Response<Void> create(@Valid @RequestBody AccountRequest request) {
        accountService.create(request);
        return Response.ofSucceeded();
    }
}
