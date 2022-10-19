package com.viettel.api.model.entity;

import com.dslplatform.json.CompiledJson;
import com.github.longdt.dsljson.SnakeCaseNaming;
import com.viettel.api.converter.TransactionMetadataConverter;
import com.viettel.api.model.TransactionMetadata;
import com.viettel.api.model.TransactionStatus;
import com.viettel.api.model.TransactionType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@CompiledJson
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@Entity
public class Transaction extends BaseEntity<Transaction> {
    @Id
    Long id;
    Long senderId;
    Long recipientId;
    int channelId;
    long invoiceNo;
    @Enumerated(EnumType.STRING)
    TransactionType type;
    BigInteger wofmAmount;
    String tokenAddress;
    BigInteger tokenAmount;
    @Type(type = "jsonb")
    List<BigInteger> nftItems;
    @Type(type = "jsonb")
    Map<BigInteger, BigInteger> ftItems;
    Long gameId;
    String description;
    long expiredAt;
    String signature;
    @Enumerated(EnumType.STRING)
    TransactionStatus status;
    String txnHash;
    String senderAddress;
    String recipientAddress;
    Integer partition;
    @Column(name = "\"offset\"")
    Integer offset;
    OffsetDateTime createdAt;
    OffsetDateTime updatedAt;

    @Override
    protected Transaction self() {
        return this;
    }
}

