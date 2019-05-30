package com.amolzore.cloud.usermanager.controller;

public final class ApiPath {
    public static final String
            API = "api",
            V1 = "v1",
            V = "v?",
            SERVICE = "user",
            ID = "{id}",
            USER = "user";

    public static final String
            API_V_PATH = "/" + API + "/" + V,
            API_V1_PATH = "/" + API + "/" + V1,
            SERVICE_PATH = "/" + SERVICE,
            ID_PATH = "/" + ID,
            USER_PATH = "/" + USER;

    public static final String
            API_DOT = API + "." + V1,
            SERVICE_DOT = "." + SERVICE,
            ID_DOT = "." + ID;

    private ApiPath() {
    }
}