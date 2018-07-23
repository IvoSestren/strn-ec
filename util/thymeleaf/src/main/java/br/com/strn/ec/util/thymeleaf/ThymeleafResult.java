package br.com.strn.ec.util.thymeleaf;

import br.com.caelum.vraptor.View;

import java.util.Map;

public interface ThymeleafResult extends View {

    void sendError(int statusCode);
    void sendError(int statusCode, String message);
    void setStatusCode(int statusCode);

    ThymeleafResult addHeader(String name, String value);
    ThymeleafResult addIntHeader(String name, int value);
    ThymeleafResult addDateHeader(String name, long date);

    ThymeleafResult addVariables(Map map);
    ThymeleafResult addVariable(String chave, Object valor);

    ThymeleafResult templateFile(String arquivo);

    ThymeleafResult render();

    String generate();
}
