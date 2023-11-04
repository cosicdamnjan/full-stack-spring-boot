package com.cosicdmnj.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
