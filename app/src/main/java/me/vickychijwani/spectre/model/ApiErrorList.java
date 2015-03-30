package me.vickychijwani.spectre.model;

import java.util.Arrays;
import java.util.List;

public class ApiErrorList {

    public List<ApiError> errors;

    public static ApiErrorList from(ApiError... errors) {
        ApiErrorList errorList = new ApiErrorList();
        errorList.errors = Arrays.asList(errors);
        return errorList;
    }

}
