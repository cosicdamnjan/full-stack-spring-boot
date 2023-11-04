package com.cosicdmnj.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
