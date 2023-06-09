package com.kolev.stock.app.myapp.models.requests.wallet;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WalletRequest {

    private Long amount;
}
