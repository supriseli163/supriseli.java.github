package com.base.data.access.alyer.netty.state;

public enum  SESSION_STATUS {
    CLIENT_FAKE_HANDSHAKE, CLIENT_FAKE_AUTH, QUERY_ANALYZE, FAKE_SQL, QUERY_HANDLE,QUERY_RESULT,
    FIELDS_RESULT, GRAY_HANDLE_SHAKE, GRAY_RESULT, QUIT, BATCH__HANDLE, BATCH_RESULT, BATCH_QUIT;
}
