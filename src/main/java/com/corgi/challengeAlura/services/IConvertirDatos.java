package com.corgi.challengeAlura.services;

public interface IConvertirDatos {
    <T> T getData(String json, Class<T> classes);
}
