package com.viettel.api.model;

import com.dslplatform.json.CompiledJson;
import com.github.longdt.dsljson.SnakeCaseNaming;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigInteger;

@CompiledJson
@Data
@Accessors(chain = true)
public class PaymentMetadata implements TransactionMetadata {
    private Long bdefId;
    private String boxType;
    private String boxDescription;
    private String boxName;
    private String boxImage;
    private BigInteger boxPrice;
    private String voucherCode;
    private Long referralCode;
    private String tokenSymbol;
    private Long counterId;
    private int voucherPpm;
    private int referralPpm;
}
