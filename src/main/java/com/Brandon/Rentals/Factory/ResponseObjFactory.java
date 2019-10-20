package com.Brandon.Rentals.Factory;

import com.Brandon.Rentals.Domain.ResponseObj;

public class ResponseObjFactory {

    public static ResponseObj buildGenericResponseObj(String responseCode, String responseDescription) {

        return new ResponseObj(responseCode, responseDescription);

    }

}