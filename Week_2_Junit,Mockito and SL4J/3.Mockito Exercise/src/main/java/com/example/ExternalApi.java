package com.example;

public interface ExternalApi {
    String getData();
    void sendData(String payload);
    void notifyUser(String userId);
    String fetchNext();
}
