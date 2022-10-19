
CREATE TABLE IF NOT EXISTS transaction
(
    id                bigserial
        constraint transaction_pk
            primary key,
    sender_id         bigint,
    recipient_id      bigint,
    channel_id        integer     not null,
    invoice_no        bigint      not null,
    type              varchar(20) not null,
    wofm_amount        numeric,
    token_address     varchar(66),
    token_amount      numeric,
    nft_items         jsonb,
    ft_items          jsonb,
    game_id           bigint,
    description       varchar(1024),
    expired_at        bigint,
    signature         varchar(132),
    status            varchar(20) not null,
    txn_hash          varchar(66),
    sender_address    varchar(66),
    recipient_address varchar(66),
    created_at        timestamp with time zone,
    updated_at        timestamp with time zone
);

create table account
(
    id              serial8 not null
        constraint account_pkey
            primary key,
    account_id      bigint  not null,
    locked_amount   numeric(80),
    email          varchar (20) not null,
    password       varchar (20) not null,
    name      varchar (20) not null,
    boxes          jsonb,
);