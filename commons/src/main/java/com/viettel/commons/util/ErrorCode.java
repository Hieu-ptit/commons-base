package com.viettel.commons.util;

import com.viettel.commons.exception.BusinessErrorCode;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Log4j2
public class ErrorCode {
    public static final BusinessErrorCode INTERNAL_SERVER_ERROR =
            new BusinessErrorCode(5000, "Internal server error", 500);

    public static final BusinessErrorCode INTERNAL_SERVICE_ERROR =
            new BusinessErrorCode(5001, "Internal service error", 500);

    public static final BusinessErrorCode UNBOX_SERVICE_UNAVAILABLE =
            new BusinessErrorCode(5002, "Unbox service unavailable", 500);

    public static final BusinessErrorCode LOCK_SERVICE_UNAVAILABLE =
            new BusinessErrorCode(5003, "Lock service unavailable", 500);

    public static final BusinessErrorCode INVALID_PARAMETERS =
            new BusinessErrorCode(4000, "Invalid parameters", 400);

    public static final BusinessErrorCode UNAUTHORIZED =
            new BusinessErrorCode(4001, "You need to login to to access this resource", 401);

    public static final BusinessErrorCode FORBIDDEN =
            new BusinessErrorCode(4002, "You don't have permission to to access this resource", 403);

    public static final BusinessErrorCode PURCHASE_RIGHT_NOT_FOUND =
            new BusinessErrorCode(4003, "PurchaseRight is not found", 404);

    public static final BusinessErrorCode CANT_WITHDRAW_ITEM =
            new BusinessErrorCode(4004, "Item are not suitable for withdrawing", 400);

    public static final BusinessErrorCode ITEM_NOT_FOUND =
            new BusinessErrorCode(4005, "Item is not found", 404);

    public static final BusinessErrorCode CANT_DEPOSIT_ITEM =
            new BusinessErrorCode(4006, "Item are not suitable for depositing", 400);

    public static final BusinessErrorCode ACCOUNT_HAS_ALREADY_BOX_IN_THIS_GAME =
            new BusinessErrorCode(4012, "Account has already a box in this game", 400);

    public static final BusinessErrorCode GAME_ID_NOT_FOUND =
            new BusinessErrorCode(4013, "Game with id is not found", 400);

    public static final BusinessErrorCode PURCHASE_NOT_FOUND =
            new BusinessErrorCode(4014, "Purchase is not found", 400);

    public static final BusinessErrorCode BOX_IS_NOT_OF_ACCOUNT =
            new BusinessErrorCode(4015, "This box is not of this account", 400);

    public static final BusinessErrorCode BOX_IS_OPENING =
            new BusinessErrorCode(4017, "This box is opening", 400);

    public static final BusinessErrorCode BOX_HAS_ALREADY_REWARD =
            new BusinessErrorCode(4018, "This box has already reward", 400);

    public static final BusinessErrorCode BOX_HAS_BEEN_OPENED =
            new BusinessErrorCode(4019, "The box in purchase right has been opened !", 400);

    public static final BusinessErrorCode OUT_OF_VOUCHER_QUANTITY =
            new BusinessErrorCode(4020, "Out of vouchers", 400);

    public static final BusinessErrorCode INVALID_VOUCHER_CODE =
            new BusinessErrorCode(4021, "Invalid Voucher code", 400);

    public static final BusinessErrorCode BOX_DEFINITION_NOT_FOUND =
            new BusinessErrorCode(4022, "This box is undefined", 400);

    public static final BusinessErrorCode INVALID_ITEM_ID_LIST =
            new BusinessErrorCode(4023, "Invalid item ids", 400);

    public static final BusinessErrorCode CAN_NOT_CREATE_NFT_ITEM =
            new BusinessErrorCode(4024, "Can't create nft item", 400);

    public static final BusinessErrorCode TRANSACTION_NOT_FOUND =
            new BusinessErrorCode(4025, "Transaction is invalid", 400);

    public static final BusinessErrorCode WOFM_AMOUNT_MUST_BE_NOT_NULL =
            new BusinessErrorCode(4026, "Wofm amount must be not null and greater than 0", 400);

    public static final BusinessErrorCode NFT_ITEM_ID_LIST_MUST_NOT_BE_EMPTY =
            new BusinessErrorCode(4027, "Nft item id list must not be empty", 400);

    public static final BusinessErrorCode TOKEN_MUST_BE_NOT_NULL =
            new BusinessErrorCode(4028, "Token must not be null", 400);

    public static final BusinessErrorCode VOUCHER_CODE_MUST_BE_NOT_BLANK =
            new BusinessErrorCode(4029, "Voucher code must be not null", 400);

    public static final BusinessErrorCode BALANCE_INSUFFICIENT_ERROR =
            new BusinessErrorCode(4030, "Insufficient balance", 400);

    public static final BusinessErrorCode TOKEN_NOT_SUPPORTS =
            new BusinessErrorCode(4031, "This token is not supports", 400);

    public static final BusinessErrorCode VOUCHER_NOT_SUPPORT_TOKEN =
            new BusinessErrorCode(4032, "This token is not supports", 400);

    public static final BusinessErrorCode BOX_DEF_NOT_FOUND_OR_NOT_APPROVED_OR_OUT_OF_STOCK =
            new BusinessErrorCode(4033, "This box is undefined or out of stock", 400);

    public static final BusinessErrorCode BOX_HAS_INVALID_LOCATION =
            new BusinessErrorCode(4034, "This box has invalid location", 400);

    public static final BusinessErrorCode ANOTHER_SYNC_PROCESSING =
            new BusinessErrorCode(4035, "There is another process is running", 400);

    public static final BusinessErrorCode CANT_OPEN_BOX =
            new BusinessErrorCode(4036, "Invalid box", 400);

    public static final BusinessErrorCode CANT_GET_EXCHANGE_PRICE =
            new BusinessErrorCode(4037, "Can't get exchange price", 400);

    public static final BusinessErrorCode STAKE_PACKAGE_NOT_FOUND =
            new BusinessErrorCode(4038, "Stake package not found", 404);

    public static final BusinessErrorCode ACCOUNT_NOT_FOUND =
            new BusinessErrorCode(4039, "Account not found ", 404);

    public static final BusinessErrorCode OVERTAKE_OF_PRICE =
            new BusinessErrorCode(4040, "Overtake of price", 400);

    public static final BusinessErrorCode INVALID_REFERRAL_CODE =
            new BusinessErrorCode(4041, "Invalid referral code", 400);

    public static final BusinessErrorCode INVALID_ACCOUNT_ID =
            new BusinessErrorCode(4042, "Invalid account id", 400);

    public static final BusinessErrorCode ACCOUNT_NOT_CONNECT_WALLET =
            new BusinessErrorCode(4043, "The account is not connected to the wallet", 400);

    public static final BusinessErrorCode CANT_CLAIM_REWARD =
            new BusinessErrorCode(4044, "Can't start claim reward", 400);

    public static final BusinessErrorCode CANT_LISTING_ITEM =
            new BusinessErrorCode(4045, "Can't listing item", 400);

    public static final BusinessErrorCode CANT_FINISH_LISTING_ITEM =
            new BusinessErrorCode(4046, "Can't finish listing item", 400);

    public static final BusinessErrorCode CANT_MATCHING_ORDER =
            new BusinessErrorCode(4047, "Can't matching this order", 400);

    public static final BusinessErrorCode CANT_FINISH_MATCHING_ORDER =
            new BusinessErrorCode(4048, "Can't finish matching this order", 400);

    public static final BusinessErrorCode CANT_REMOVE_LISTING_ORDER =
            new BusinessErrorCode(4049, "Can't remove listing order", 400);

    public static final BusinessErrorCode CANT_FINISH_REMOVE_LISTING_ORDER =
            new BusinessErrorCode(4050, "Can't finish remove listing order", 400);

    public static final BusinessErrorCode ORDER_NOT_FOUND =
            new BusinessErrorCode(4051, "Order not found", 404);

    public static final BusinessErrorCode INVALID_BOX_DEFINITION =
            new BusinessErrorCode(4052, "Invalid box definition", 400);

    public static final BusinessErrorCode INVALID_LOCKED_AMOUNT =
            new BusinessErrorCode(4053, "Invalid locked amount", 400);

    public static final BusinessErrorCode EXCEED_ACTION_RATE_LIMIT =
            new BusinessErrorCode(4055, "Exceeds action rate limit", 400);

    public static final BusinessErrorCode INVALID_CONTRACT =
            new BusinessErrorCode(4056, "Invalid contract", 400);

    public static final BusinessErrorCode NOT_YET_TIME_TO_CLAIM =
            new BusinessErrorCode(4057, "Not yet time to claim interest", 400);

    public static final BusinessErrorCode OUT_OF_CLAIM_TIMES =
            new BusinessErrorCode(4058, "Out of claim times", 400);

    public static final BusinessErrorCode KEY_NOT_FOUND =
            new BusinessErrorCode(4054, "This key not found", 404);

    public static final BusinessErrorCode CONTRACT_NOT_FOUND =
            new BusinessErrorCode(4059, "This contract not found", 404);

    public static final BusinessErrorCode REWARD_NOT_FOUND =
            new BusinessErrorCode(4060, "This reward not found", 404);

    public static final BusinessErrorCode NOT_YET_TIME_TO_WITHDRAW =
            new BusinessErrorCode(4061, "Not enough time for the next withdraw", 400);

    public static final BusinessErrorCode INVALID_WITHDRAWAL_WOFM_AMOUNT =
            new BusinessErrorCode(4062, "Invalid withdrawal wofm amount", 400);

    public static final BusinessErrorCode ACTION_NOT_SUPPORTED =
            new BusinessErrorCode(4063, "This action is not supported", 400);

    public static final BusinessErrorCode HERO_HAS_ALREADY_EXIST =
            new BusinessErrorCode(4064, "Hero has already exist", 400);

    public static final BusinessErrorCode ACCOUNT_NOT_ALLOWED_TO_ACTION =
            new BusinessErrorCode(4065, "Account is not allowed to action", 400);

    public static final BusinessErrorCode CANT_UPDATE_BOX_DEF =
            new BusinessErrorCode(4067, "Can't update box definition", 400);

    public static final BusinessErrorCode CANT_APPROVE_BOX_CONFIG =
            new BusinessErrorCode(4068, "Can't approve box definition", 400);

    public static final BusinessErrorCode CANT_ACTIVATE_BOX_CONFIG =
            new BusinessErrorCode(4069, "Can't activate box definition", 400);

    public static final BusinessErrorCode CANT_STOP_ACTIVE_BOX_CONFIG =
            new BusinessErrorCode(4070, "Can't stop box definition", 400);

    public static final BusinessErrorCode TOKEN_TYPE_NOT_SUPPORTED =
            new BusinessErrorCode(4071, "Token type not supported", 400);

    public static final BusinessErrorCode BOX_TYPE_NOT_SUPPORTED =
            new BusinessErrorCode(4072, "Box type not supported", 400);

    public static final BusinessErrorCode CANT_APPROVE_REWARD_WITH_EVENT =
            new BusinessErrorCode(4073, "Can't approve reward with event ", 400);

    public static final BusinessErrorCode INVALID_EVENT_ID =
            new BusinessErrorCode(4074, "Rewards with eventId approved", 400);

    public static final BusinessErrorCode CANT_VERIFY_TOKEN =
            new BusinessErrorCode(4075, "Can't verify token", 400);

    static {
        Set<Integer> codes = new HashSet<>();
        var duplications = Arrays.stream(ErrorCode.class.getDeclaredFields())
                .filter(f -> Modifier.isStatic(f.getModifiers()) && f.getType().equals(BusinessErrorCode.class))
                .map(f -> {
                    try {
                        return ((BusinessErrorCode) f.get(null)).getCode();
                    } catch (IllegalAccessException e) {
                        log.error("can't load error code into map", e);
                        throw new RuntimeException(e);
                    }
                })
                .filter(code -> !codes.add(code))
                .toList();
        if (!duplications.isEmpty()) {
            throw new RuntimeException("Duplicate error code: " + duplications);
        }
    }

    private ErrorCode() {
    }
}
