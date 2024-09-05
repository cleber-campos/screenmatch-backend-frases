package br.com.frases_series.utils;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverteDadosJson {
        <T> T  getClass(String json, Class<T> classe) throws JsonProcessingException;
    }
