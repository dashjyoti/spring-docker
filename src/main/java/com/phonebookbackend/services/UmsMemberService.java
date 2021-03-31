package com.phonebookbackend.services;

import com.phonebookbackend.api.CommonResult;

public interface UmsMemberService {
    CommonResult generateAuthCode(String telephone);
    CommonResult verifyAuthCode(String telephone, String authCode);
}
