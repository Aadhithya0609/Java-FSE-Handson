package com.example;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void submitData(String data) {
        api.sendData(data);
    }

    public void notify(String userId) {
        api.notifyUser(userId);
    }

    public String getNextMessage() {
        return api.fetchNext();
    }
}
