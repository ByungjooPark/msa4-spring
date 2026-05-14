package com.msa4spring.requests;

public record UsersPaginationRequest(
        Integer page
        ,Integer limit
) {
    public UsersPaginationRequest(Integer page, Integer limit) {
        this.page = (page == null ) ? 1 : page;
        this.limit = (limit == null) ? 10 : limit;
    }
}
