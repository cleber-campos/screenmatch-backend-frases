package br.com.frases_series.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDadosJson implements IConverteDadosJson{
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getClass(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
