DROP TABLE IF EXISTS ACCOUNT_TRANSACTION;
CREATE TABLE ACCOUNT_TRANSACTION (
    ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    ACCOUNT_ID INT NOT NULL,
    AMOUNT DOUBLE NOT NULL,
    CREATED TIMESTAMP NOT NULL DEFAULT NOW()
);
